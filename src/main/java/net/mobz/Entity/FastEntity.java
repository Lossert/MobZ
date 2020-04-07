package net.mobz.Entity;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.mobz.Config.configz;
import net.mobz.Inits.Configinit;
import net.mobz.Inits.Entityinit;
import net.mobz.Inits.Soundinit;

public class FastEntity extends ZombieEntity {

    public FastEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);

    }

    public boolean canSpawn(WorldView view) {
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());
        return view.intersectsEntities(this)
                && this.world.getLocalDifficulty(posentity).getGlobalDifficulty() != Difficulty.PEACEFUL
                && this.world.getLightLevel(posentity) <= 7
                && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
                && this.world.getBlockState(blockunderentity).getBlock()
                        .allowsSpawning(world.getBlockState(blockunderentity), view, blockunderentity, Entityinit.FAST)
                && AutoConfig.getConfigHolder(configz.class).getConfig().SpeedyZombieSpawn;

    }

    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH)
                .setBaseValue(Configinit.CONFIGZ.SpeedyZombieLife * Configinit.CONFIGZ.LifeMultiplicatorMob);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.27D);
        this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE)
                .setBaseValue(Configinit.CONFIGZ.SpeedyZombieAttack * Configinit.CONFIGZ.DamageMultiplicatorMob);
    }

    public boolean canBreakDoors() {
        return false;
    }

    protected SoundEvent getStepSound() {
        return Soundinit.STEPSPEEDEVENT;
    }

    protected SoundEvent getAmbientSound() {
        return Soundinit.SAYSPEEDEVENT;
    }

    public boolean isBaby() {
        return false;
    }

}
