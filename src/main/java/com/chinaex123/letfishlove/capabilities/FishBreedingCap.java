package com.chinaex123.letfishlove.capabilities;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.util.INBTSerializable;

import javax.annotation.Nullable;
import java.util.UUID;

/**
 * 鱼类繁殖能力数据类，负责存储和管理鱼的繁殖相关状态。
 */
public class FishBreedingCap implements INBTSerializable<CompoundTag> {

    // 所属的鱼类实体
    private final WaterAnimal entity;

    // 求爱倒计时（刻），大于0表示处于求爱模式
    public int inLove;

    // 触发求爱的玩家UUID
    @Nullable
    public UUID loveCause;

    // 是否怀孕（已受精等待产卵）
    public boolean isPregnant;

    // 繁殖冷却时间（刻），冷却期间无法再次繁殖
    public int canLoveCooldown;

    /**
     * 构造方法，初始化所有状态为默认值。
     */
    public FishBreedingCap(WaterAnimal entity) {
        this.entity = entity;
        this.inLove = 0;
        this.loveCause = null;
        this.isPregnant = false;
        this.canLoveCooldown = 0;
    }

    /**
     * 获取所属的鱼类实体。
     */
    public WaterAnimal getEntity() {
        return entity;
    }

    /**
     * 获取求爱倒计时。
     */
    public int getInLoveInt() {
        return inLove;
    }

    /**
     * 设置求爱倒计时。
     * @param inLove 倒计时值（刻）
     * @param sync 是否同步到客户端
     */
    public void setInLoveInt(int inLove, boolean sync) {
        this.inLove = inLove;
    }

    /**
     * 获取触发求爱的玩家UUID。
     */
    @Nullable
    public UUID getLoveCauseUUID() {
        return loveCause;
    }

    /**
     * 设置触发求爱的玩家UUID。
     */
    public void setLoveCauseUUID(@Nullable UUID loveCause, boolean sync) {
        this.loveCause = loveCause;
    }

    /**
     * 检查鱼类是否可以进入求爱模式。
     * 条件：不在求爱中、未怀孕、冷却时间为0。
     */
    public boolean canFallInLove() {
        return this.getInLoveInt() <= 0 && !this.isPregnant() && this.getCanLoveCooldown() == 0;
    }

    /**
     * 使鱼类进入求爱模式，播放爱心粒子效果。
     * @param fish 目标鱼类
     * @param pPlayer 触发求爱的玩家（可为空）
     * @param level 世界
     */
    public void setInLove(WaterAnimal fish, @Nullable Player pPlayer, Level level) {
        RandomSource random = level.getRandom();
        // 设置求爱倒计时为600刻（30秒）
        this.setInLoveInt(600, true);
        if (pPlayer != null) {
            this.setLoveCauseUUID(pPlayer.getUUID(), true);
        }
        // 生成爱心粒子效果
        for(int i = 0; i < 7; ++i) {
            double d0 = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            level.addParticle(ParticleTypes.HEART, fish.getRandomX(1.0D), fish.getRandomY() + 0.5D, fish.getRandomZ(1.0D), d0, d1, d2);
        }
    }

    /**
     * 获取触发求爱的玩家（服务端）。
     */
    @Nullable
    public ServerPlayer getLoveCause(Level level) {
        if (this.getLoveCauseUUID() == null) {
            return null;
        } else {
            Player player = level.getPlayerByUUID(this.getLoveCauseUUID());
            return player instanceof ServerPlayer ? (ServerPlayer)player : null;
        }
    }

    /**
     * 检查鱼类是否处于求爱模式。
     */
    public boolean isInLove() {
        return this.getInLoveInt() > 0;
    }

    /**
     * 重置求爱状态。
     */
    public void resetLove() {
        this.setInLoveInt(0, true);
    }

    /**
     * 检查鱼类是否怀孕。
     */
    public boolean isPregnant() {
        return this.isPregnant;
    }

    /**
     * 设置怀孕状态。
     */
    public void setPregnant(boolean pregnant, boolean sync) {
        this.isPregnant = pregnant;
    }

    /**
     * 获取繁殖冷却时间。
     */
    public int getCanLoveCooldown() {
        return this.canLoveCooldown;
    }

    /**
     * 设置繁殖冷却时间。
     */
    public void setCanLoveCooldown(int canLoveCooldown, boolean sync) {
        this.canLoveCooldown = canLoveCooldown;
    }

    /**
     * 将数据序列化为NBT，用于保存到世界。
     */
    @Override
    public CompoundTag serializeNBT(HolderLookup.Provider provider) {
        CompoundTag tag = new CompoundTag();
        // 保存求爱倒计时
        tag.putInt("inLove", this.inLove);
        // 保存求爱触发者UUID
        if (this.loveCause != null) {
            tag.putUUID("LoveCause", this.loveCause);
        }
        // 保存怀孕状态
        tag.putBoolean("isPregnant", this.isPregnant);
        // 保存冷却时间
        tag.putInt("canLoveCooldown", this.canLoveCooldown);
        return tag;
    }

    /**
     * 从NBT反序列化数据，用于加载世界数据。
     */
    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag nbt) {
        // 加载求爱倒计时
        this.inLove = nbt.getInt("inLove");
        // 加载求爱触发者UUID
        this.loveCause = nbt.hasUUID("LoveCause") ? nbt.getUUID("LoveCause") : null;
        // 加载怀孕状态
        this.isPregnant = nbt.getBoolean("isPregnant");
        // 加载冷却时间
        this.canLoveCooldown = nbt.getInt("canLoveCooldown");
    }
}