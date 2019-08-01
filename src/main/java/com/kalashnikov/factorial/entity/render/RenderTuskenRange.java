package com.kalashnikov.factorial.entity.render;

import com.kalashnikov.factorial.entity.model.ModelTuskenRange;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenMelee;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenRange;
import com.kalashnikov.factorial.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTuskenRange extends RenderLiving<EntityTuskenRange> {
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/neutral/tuskenrange.png");
	
	public RenderTuskenRange(RenderManager manager) {
		super(manager, new ModelTuskenRange(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTuskenRange entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTuskenRange entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
