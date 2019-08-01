package com.kalashnikov.factorial.entity.neutral;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
 
public class EntityTuskenMelee extends EntityZombie {
	public EntityTuskenMelee(World worldIn) {
		super(worldIn);
	}
		
/*	@Override
	protected void entityInit() {
		
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		
	}  */
	
	
	public EntityZombie createChild(EntityAgeable ageable) {
		return new EntityTuskenMelee(world);
	}
	
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
}

