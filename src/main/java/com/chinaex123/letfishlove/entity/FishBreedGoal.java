package com.chinaex123.letfishlove.entity;

import com.chinaex123.letfishlove.capabilities.FishBreedingCap;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

/**
 * 鱼类繁殖AI目标，控制两条鱼靠近并进行繁殖。
 */
public class FishBreedGoal extends Goal {

    // 寻找配偶的条件：范围8格，无视视线遮挡
    private static final TargetingConditions PARTNER_TARGETING = TargetingConditions.forNonCombat().range(8.0D).ignoreLineOfSight();

    // 当前鱼类
    protected final WaterAnimal fish;

    // 配偶的实体类型
    private final Class<? extends WaterAnimal> partnerClass;

    // 当前世界
    protected final Level level;

    // 找到的配偶
    @Nullable
    protected WaterAnimal partner;

    // 求爱计时器
    private int loveTime;

    // 移动速度倍数
    private final double speedModifier;

    /**
     * 构造繁殖AI目标。
     * @param fish 目标鱼类
     * @param pSpeedModifier 移动速度倍数
     */
    public FishBreedGoal(WaterAnimal fish, double pSpeedModifier) {
        this(fish, pSpeedModifier, fish.getClass());
    }

    /**
     * 构造繁殖AI目标，可指定配偶类型。
     * @param fish 目标鱼类
     * @param pSpeedModifier 移动速度倍数
     * @param pPartnerClass 配偶的实体类型
     */
    public FishBreedGoal(WaterAnimal fish, double pSpeedModifier, Class<? extends WaterAnimal> pPartnerClass) {
        this.fish = fish;
        this.level = fish.level();
        this.partnerClass = pPartnerClass;
        this.speedModifier = pSpeedModifier;
        // 设置需要移动和看向目标
        this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    /**
     * 检查AI是否可以启动。
     * 条件：鱼处于求爱模式、未怀孕、且能找到可繁殖的配偶。
     */
    public boolean canUse() {
        FishBreedingCap cap = FishBreedingUtil.getFishCap(fish);
        if (!cap.isInLove() || cap.isPregnant()) {
            return false;
        } else {
            this.partner = this.getFreePartner();
            return this.partner != null;
        }
    }

    /**
     * 检查AI是否可以继续执行。
     * 条件：配偶存在且存活、配偶处于求爱模式、求爱时间未超时（<100刻）。
     */
    public boolean canContinueToUse() {
        return this.partner != null && this.partner.isAlive() && FishBreedingUtil.getFishCap(partner).isInLove() && this.loveTime < 100;
    }

    /**
     * AI结束时调用，重置配偶和计时器。
     */
    public void stop() {
        this.partner = null;
        this.loveTime = 0;
    }

    /**
     * 每刻执行，控制鱼向配偶移动并检查是否完成繁殖。
     */
    public void tick() {
        if (partner == null) {
            return;
        }
        // 看向配偶
        this.fish.getLookControl().setLookAt(this.partner, 10.0F, (float)this.fish.getMaxHeadXRot());
        // 向配偶移动
        this.fish.getNavigation().moveTo(this.partner, this.speedModifier);
        // 增加计时器
        ++this.loveTime;
        // 达到100刻（5秒）且距离小于3格时执行繁殖
        if (this.loveTime >= this.adjustedTickDelay(100) && this.fish.distanceToSqr(this.partner) < 9.0D) {
            this.breed();
        }
    }

    /**
     * 寻找空闲的可繁殖配偶。
     * @return 找到的配偶，如果没有则返回null
     */
    @Nullable
    private WaterAnimal getFreePartner() {
        // 获取范围内的所有同类型鱼类
        List<? extends WaterAnimal> list = this.level.getNearbyEntities(this.partnerClass, PARTNER_TARGETING, this.fish, this.fish.getBoundingBox().inflate(8.0D));
        double d0 = Double.MAX_VALUE;
        WaterAnimal partner = null;
        // 找出距离最近的、可以配对的鱼类
        for(WaterAnimal otherFish : list) {
            if (FishBreedingUtil.canMate(this.fish, otherFish) && this.fish.distanceToSqr(otherFish) < d0) {
                partner = otherFish;
                d0 = this.fish.distanceToSqr(otherFish);
            }
        }
        return partner;
    }

    /**
     * 执行繁殖，生成鱼卵。
     */
    protected void breed() {
        FishBreedingUtil.spawnFishFromBreeding((ServerLevel)this.level, this.fish, this.partner);
    }
}