/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2025 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.model.entity;

//import net.minecraft.client.model.ModelRenderer;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.entity.Entity;
//import net.minecraft.inventory.EntityEquipmentSlot;

/*public class ModelGhoulArmor extends ModelGhoul {

	public ModelRenderer chestplate;

	public ModelGhoulArmor(){
		this(0.0F);
	}

	public ModelGhoulArmor(float f){
		super(f);

		chestplate = new ModelRenderer(this, 0, 18);
		chestplate.setTextureSize(128, 64);
		chestplate.addBox(-5.0F, -13.9F, -3.0F, 10, 13, 5, f);
		chestplate.setRotationPoint(0.0F, 4.59F, 1.0F);
		setRotateAngle(chestplate, 0.7853981633974483F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);

		if (isChild)
		{
			float f6 = 2.0F;

			GlStateManager.pushMatrix();
			GlStateManager.scale(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GlStateManager.translate(0.0F, 24.0F * par7, 0.0F);
			chestplate.render(par7);
			GlStateManager.popMatrix();
		} else chestplate.render(par7);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		chestplate.rotateAngleX = pelvis.rotateAngleX;
		chestplate.offsetY = pelvis.offsetY;

		chestplate.rotationPointZ = pelvis.rotationPointZ;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		chestplate.showModel = visible;
	}

	@Override
	public void setEquipmentSlotVisible(EntityEquipmentSlot slot) {
		super.setEquipmentSlotVisible(slot);
		if(slot == EntityEquipmentSlot.CHEST ||
				slot == EntityEquipmentSlot.LEGS)
			chestplate.showModel = true;
	}
}*/
