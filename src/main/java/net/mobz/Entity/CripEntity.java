package net.mobz.Entity;

import net.mobz.Config.configz;
import net.mobz.Inits.Configinit;
import net.mobz.Inits.Entityinit;
import net.mobz.Inits.Soundinit;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class CripEntity extends CreeperEntity {

   public CripEntity(EntityType<? extends CreeperEntity> entityType, World world) {
      super(entityType, world);
   }

   public static DefaultAttributeContainer.Builder createCripEntityAttributes() {
      return HostileEntity.createHostileAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH,
                  Configinit.CONFIGZ.CookieCreeperLife * Configinit.CONFIGZ.LifeMultiplicatorMob)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0D);
   }

   @Override
   protected SoundEvent getHurtSound(DamageSource damageSource_1) {
      return Soundinit.SAYCRIPEVENT;
   }

   @Override
   protected SoundEvent getDeathSound() {
      return Soundinit.DEATHCRIPEVENT;
   }

   @Override
   public boolean canSpawn(WorldView view) {
      BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
      BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());
      return view.intersectsEntities(this) && !world.containsFluid(this.getBoundingBox())
            && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
            && this.world.getBlockState(blockunderentity).allowsSpawning(view, blockunderentity, Entityinit.CRIP)
            && AutoConfig.getConfigHolder(configz.class).getConfig().CookieCreeperSpawn;

   }
}
