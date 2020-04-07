package net.mobz.Entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import net.mobz.Inits.Soundinit;
import net.mobz.Inits.Entityinit;

public class Boar extends PigEntity {
    private static final Ingredient BREEDING_INGREDIENT;

    public Boar(EntityType<? extends PigEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(14.0D);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
    }

    public boolean canBeControlledByRider() {
        return false;
    }

    protected SoundEvent getAmbientSound() {
        return Soundinit.BOARSAYEVENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSource_1) {
        return Soundinit.BOARSAYEVENT;
    }

    protected SoundEvent getDeathSound() {
        return Soundinit.BOARDEATHEVENT;
    }

    public boolean isSaddled() {
        return false;
    }

    public Boar method_6574(PassiveEntity passiveEntity_1) {
        return (Boar) Entityinit.BOAR.create(this.world);
    }

    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }

    public Boar createChild(PassiveEntity passiveEntity) {
        return (Boar) Entityinit.BOAR.create(this.world);
    }

    static {

        BREEDING_INGREDIENT = Ingredient.ofItems(Items.CARROT, Items.POTATO, Items.BEETROOT);
    }

}
