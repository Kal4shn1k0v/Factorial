package com.kalashnikov.factorial.entity.render;

import com.kalashnikov.factorial.entity.model.ModelTuskenMelee;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenMelee;
import com.kalashnikov.factorial.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTuskenMelee extends RenderLiving<EntityTuskenMelee> {
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/neutral/tuskenmelee.png");
	
	public RenderTuskenMelee(RenderManager manager) {
		super(manager, new ModelTuskenMelee(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTuskenMelee entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTuskenMelee entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
