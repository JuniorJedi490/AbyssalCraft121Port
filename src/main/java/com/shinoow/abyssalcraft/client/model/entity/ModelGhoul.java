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

import com.shinoow.abyssalcraft.lib.client.model.ModelArmoredBase;

//import net.minecraft.client.model.ModelRenderer;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.entity.Entity;
//import net.minecraft.inventory.EntityEquipmentSlot;
//import net.minecraft.util.EnumHandSide;
//import net.minecraft.util.math.MathHelper;

/*public class ModelGhoul extends ModelArmoredBase {

	public ModelRenderer pelvis;
	public ModelRenderer lleg;
	public ModelRenderer rleg;
	public ModelRenderer spine;
	public ModelRenderer shoulders;
	public ModelRenderer neck;
	public ModelRenderer lside;
	public ModelRenderer rside;
	public ModelRenderer back;
	public ModelRenderer rrib1;
	public ModelRenderer rrib2;
	public ModelRenderer rrib3;
	public ModelRenderer lrib1;
	public ModelRenderer lrib2;
	public ModelRenderer lrib3;
	public ModelRenderer larm1;
	public ModelRenderer rarm1;
	public ModelRenderer larm2;
	public ModelRenderer lfinger1;
	public ModelRenderer lfinger2;
	public ModelRenderer lfinger3;
	public ModelRenderer lfinger4;
	public ModelRenderer rarm2;
	public ModelRenderer rfinger1;
	public ModelRenderer rfinger2;
	public ModelRenderer rfinger3;
	public ModelRenderer rfinger4;
	public ModelRenderer headJoint;
	public ModelRenderer head;
	public ModelRenderer jaw;
	public ModelRenderer tooth1;
	public ModelRenderer tooth2;
	public ModelRenderer tooth3;
	public ModelRenderer tooth4;
	public ModelRenderer tooth5;
	public ModelRenderer lleg2;
	public ModelRenderer rleg2;

	public ModelGhoul() {
		this(0);
	}

	public ModelGhoul(float f) {
		textureWidth = 128;
		textureHeight = 64;
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 6.5F, -20.2F);
		head.addBox(-4.5F, -9.5F, -4.5F, 9, 9, 9, f);
		lleg = new ModelRenderer(this, 16, 40);
		lleg.mirror = true;
		lleg.setRotationPoint(3.5F, 6.4F, 4.0F);
		lleg.addBox(-2.1F, 0.0F, -2.1F, 4, 12, 4, f);
		setRotateAngle(lleg, -0.8726646259971648F, -0.7853981633974483F, 0.0F);
		rarm1 = new ModelRenderer(this, 56, 22);
		rarm1.setRotationPoint(-8.0F, 0.8F, -0.8F);
		rarm1.addBox(-4.0F, -2.0F, -2.0F, 4, 12, 4, f);
		setRotateAngle(rarm1, -1.48352986419518F, 0.0F, 0.0F);
		rleg = new ModelRenderer(this, 16, 40);
		rleg.setRotationPoint(-3.3F, 6.4F, 4.1F);
		rleg.addBox(-2.1F, 0.0F, -2.2F, 4, 12, 4, f);
		setRotateAngle(rleg, -0.8726646259971648F, 0.7853981633974483F, 0.0F);
		rfinger2 = new ModelRenderer(this, 50, 34);
		rfinger2.setRotationPoint(1.0F, 8.0F, 3.0F);
		rfinger2.addBox(-0.5F, -0.5F, -1.0F, 1, 5, 1, 0.0F);
		shoulders = new ModelRenderer(this, 54, 12);
		shoulders.setRotationPoint(0.0F, 5.5F, -14.53F);
		shoulders.addBox(-8.0F, -2.0F, -2.0F, 16, 4, 4, f);
		setRotateAngle(shoulders, 1.6997761585172775F, 0.0F, 0.0F);
		back = new ModelRenderer(this, 0, 18);
		back.setRotationPoint(0.0F, -1.5F, 2.51F);
		back.addBox(-5.0F, -5.5F, -1.0F, 10, 13, 0, f);
		larm2 = new ModelRenderer(this, 72, 26);
		larm2.mirror = true;
		larm2.setRotationPoint(2.0F, 4.0F, -2.0F);
		larm2.addBox(-2.0F, 1.0F, 3.0F, 4, 8, 4, f);
		setRotateAngle(larm2, -0.8290313946973066F, 0.0F, 0.0F);
		lrib1 = new ModelRenderer(this, 39, 35);
		lrib1.mirror = true;
		lrib1.setRotationPoint(4.0F, -3.58F, -0.5F);
		lrib1.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 2, f);
		rrib2 = new ModelRenderer(this, 39, 35);
		rrib2.setRotationPoint(-4.0F, -0.38F, -0.5F);
		rrib2.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 2, f);
		rfinger4 = new ModelRenderer(this, 50, 34);
		rfinger4.setRotationPoint(3.0F, 8.0F, 5.0F);
		rfinger4.addBox(-1.0F, -0.5F, -1.0F, 1, 5, 1, f);
		lfinger2 = new ModelRenderer(this, 50, 34);
		lfinger2.mirror = true;
		lfinger2.setRotationPoint(1.0F, 8.0F, 3.0F);
		lfinger2.addBox(-0.5F, -0.5F, -1.0F, 1, 5, 1, f);
		rside = new ModelRenderer(this, 40, 13);
		rside.setRotationPoint(-6.0F, -1.5F, -0.49F);
		rside.addBox(0.99F, -5.5F, -3.0F, 0, 13, 5,f);
		lfinger4 = new ModelRenderer(this, 50, 34);
		lfinger4.mirror = true;
		lfinger4.setRotationPoint(2.0F, 8.0F, 5.0F);
		lfinger4.addBox(0.0F, -0.5F, -1.0F, 1, 5, 1, f);
		headJoint = new ModelRenderer(this, 0, 0);
		headJoint.setRotationPoint(0.0F, -3.0F, 0.0F);
		headJoint.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, f);
		setRotateAngle(headJoint, -1.0471975511965976F, 0.0F, 0.0F);
		lrib2 = new ModelRenderer(this, 39, 35);
		lrib2.mirror = true;
		lrib2.setRotationPoint(4.0F, -0.38F, -0.5F);
		lrib2.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 2, f);
		rfinger1 = new ModelRenderer(this, 50, 34);
		rfinger1.setRotationPoint(-1.0F, 8.0F, 3.0F);
		rfinger1.addBox(-0.5F, -0.5F, -1.0F, 1, 5, 1, f);
		rrib3 = new ModelRenderer(this, 39, 35);
		rrib3.setRotationPoint(-4.0F, 2.82F, -0.5F);
		rrib3.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 2, f);
		tooth4 = new ModelRenderer(this, 48, 11);
		tooth4.setRotationPoint(2.0F, -1.5F, -4.0F);
		tooth4.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, f);
		tooth1 = new ModelRenderer(this, 48, 11);
		tooth1.setRotationPoint(-4.0F, -1.5F, -4.0F);
		tooth1.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, f);
		tooth5 = new ModelRenderer(this, 48, 11);
		tooth5.setRotationPoint(4.0F, -1.5F, -4.0F);
		tooth5.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, f);
		neck = new ModelRenderer(this, 0, 44);
		neck.setRotationPoint(0.0F, -11.0F, -0.95F);
		neck.addBox(-2.0F, -4.0F, -3.0F, 4, 8, 4, f);
		setRotateAngle(neck, 0.2617993877991494F, 0.0F, 0.0F);
		pelvis = new ModelRenderer(this, 72, 0);
		pelvis.setRotationPoint(0.0F, 4.69F, 1.0F);
		pelvis.addBox(-5.0F, -1.0F, -3.0F, 10, 6, 5, f);
		setRotateAngle(pelvis, 1.5707963267948966F, 0.0F, 0.0F);
		spine = new ModelRenderer(this, 0, 44);
		spine.setRotationPoint(0.0F, -7.0F, 0.5F);
		spine.addBox(-2.0F, -8.0F, -3.0F, 4, 14, 4, f);
		larm1 = new ModelRenderer(this, 56, 22);
		larm1.mirror = true;
		larm1.setRotationPoint(8.0F, 0.8F, -0.8F);
		larm1.addBox(0.0F, -2.0F, -2.0F, 4, 12, 4, f);
		setRotateAngle(larm1, -1.48352986419518F, 0.0F, 0.0F);
		lrib3 = new ModelRenderer(this, 39, 35);
		lrib3.mirror = true;
		lrib3.setRotationPoint(4.0F, 2.82F, -0.5F);
		lrib3.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 2, f);
		lfinger3 = new ModelRenderer(this, 50, 34);
		lfinger3.mirror = true;
		lfinger3.setRotationPoint(-2.0F, 8.0F, 5.0F);
		lfinger3.addBox(-1.0F, -0.5F, -1.0F, 1, 5, 1, f);
		rrib1 = new ModelRenderer(this, 39, 35);
		rrib1.setRotationPoint(-4.0F, -3.58F, -0.5F);
		rrib1.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 2, f);
		rleg2 = new ModelRenderer(this, 32, 40);
		rleg2.setRotationPoint(0.0F, 9.4F, -0.2F);
		rleg2.addBox(-2.1F, 0.1F, -3.3F, 4, 12, 4, f);
		setRotateAngle(rleg2, 0.8726646259971648F, 0.0F, 0.0F);
		tooth2 = new ModelRenderer(this, 48, 11);
		tooth2.setRotationPoint(-2.0F, -1.5F, -4.0F);
		tooth2.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, f);
		lfinger1 = new ModelRenderer(this, 50, 34);
		lfinger1.mirror = true;
		lfinger1.setRotationPoint(-1.0F, 8.0F, 3.0F);
		lfinger1.addBox(-0.5F, -0.5F, -1.0F, 1, 5, 1, f);
		tooth3 = new ModelRenderer(this, 48, 11);
		tooth3.setRotationPoint(0.0F, -1.5F, -4.0F);
		tooth3.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, f);
		lleg2 = new ModelRenderer(this, 32, 40);
		lleg2.mirror = true;
		lleg2.setRotationPoint(0.0F, 9.4F, -0.2F);
		lleg2.addBox(-2.1F, 0.1F, -3.2F, 4, 12, 4, f);
		setRotateAngle(lleg2, 0.8726646259971648F, 0.0F, 0.0F);
		rarm2 = new ModelRenderer(this, 72, 26);
		rarm2.setRotationPoint(-2.0F, 4.0F, -2.0F);
		rarm2.addBox(-2.0F, 1.0F, 3.0F, 4, 8, 4, f);
		setRotateAngle(rarm2, -0.8290313946973066F, 0.0F, 0.0F);
		lside = new ModelRenderer(this, 30, 13);
		lside.setRotationPoint(6.0F, -1.5F, -0.49F);
		lside.addBox(-0.99F, -5.5F, -3.0F, 0, 13, 5, f);
		rfinger3 = new ModelRenderer(this, 50, 34);
		rfinger3.setRotationPoint(-3.0F, 8.0F, 5.0F);
		rfinger3.addBox(0.0F, -0.5F, -1.0F, 1, 5, 1, f);
		jaw = new ModelRenderer(this, 36, 0);
		jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
		jaw.addBox(-4.5F, -0.5F, -4.5F, 9, 1, 9, 0.0F);
		setRotateAngle(jaw, 0.2365560978651047F, 0.0F, f);
		shoulders.addChild(rarm1);
		rarm2.addChild(rfinger2);
		spine.addChild(back);
		larm1.addChild(larm2);
		spine.addChild(lrib1);
		spine.addChild(rrib2);
		rarm2.addChild(rfinger4);
		larm2.addChild(lfinger2);
		spine.addChild(rside);
		larm2.addChild(lfinger4);
		neck.addChild(headJoint);
		spine.addChild(lrib2);
		rarm2.addChild(rfinger1);
		spine.addChild(rrib3);
		jaw.addChild(tooth4);
		jaw.addChild(tooth1);
		jaw.addChild(tooth5);
		spine.addChild(neck);
		pelvis.addChild(spine);
		shoulders.addChild(larm1);
		spine.addChild(lrib3);
		larm2.addChild(lfinger3);
		spine.addChild(rrib1);
		rleg.addChild(rleg2);
		jaw.addChild(tooth2);
		larm2.addChild(lfinger1);
		jaw.addChild(tooth3);
		lleg.addChild(lleg2);
		rarm1.addChild(rarm2);
		spine.addChild(lside);
		rarm2.addChild(rfinger3);
		head.addChild(jaw);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (isChild)
		{
			float f6 = 2.0F;
			GlStateManager.pushMatrix();
			GlStateManager.scale(1.5F / f6, 1.5F / f6, 1.5F / f6);
			GlStateManager.translate(0.0F, 21.0F * f5, 0.0F);
			head.render(f5);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
			lleg.render(f5);
			rleg.render(f5);
			pelvis.render(f5);
			shoulders.render(f5);
			GlStateManager.popMatrix();
		} else{
			lleg.render(f5);
			rleg.render(f5);
			pelvis.render(f5);
			head.render(f5);
			shoulders.render(f5);
		}
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {

		head.rotateAngleY = par4 / (180F / (float)Math.PI);
		head.rotateAngleX = par5 / (180F / (float)Math.PI);

		float f = 1.0f;

		// We're currently standing still if all of these conditions are true
		if(par7Entity.posX == par7Entity.prevPosX && par7Entity.posY == par7Entity.prevPosY && par7Entity.posZ == par7Entity.prevPosZ)
			f = 0;

		head.rotationPointY = f == 0 ? -10F : 6.5F;
		head.rotationPointZ = f == 0 ? -9.20F : -14.2F;
		head.offsetY = f == 0 ? 0.35f : 0.0f;

		shoulders.rotationPointY = f == 0 ? -7.5F : 5.50F;
		shoulders.rotationPointZ = f == 0 ? -4.7F : -8.53F;
		shoulders.offsetY = f == 0 ? 0.35f : 0.0f;
		shoulders.rotateAngleX = f == 0 ? 0.9143779951198293F : 1.6997761585172775F;

		rleg.rotateAngleX = -0.8726646259971648F + MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		rleg.rotateAngleY = 0.7853981633974483F;
		lleg.rotateAngleX = -0.8726646259971648F + MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		lleg.rotateAngleY = -0.7853981633974483F;

		rleg.rotateAngleX = f == 0 ? -1.4726646259971648F : rleg.rotateAngleX;
		lleg.rotateAngleX = f == 0 ? -1.4726646259971648F : lleg.rotateAngleX;

		pelvis.rotateAngleX = f == 0 ? 0.7853981633974483F : 1.5707963267948966F;

		pelvis.offsetY = f == 0 ? 0.25f : 0.0f;

		lleg.offsetY = f == 0 ? 0.25F : 0.0f;
		rleg.offsetY = f == 0 ? 0.25F : 0.0f;

		lleg2.rotateAngleX = 0.8726646259971648F + (f == 0 ? 1.3f : 0);
		rleg2.rotateAngleX = 0.8726646259971648F + (f == 0 ? 1.3f : 0);

		pelvis.rotationPointZ = f == 1 ? 5.0F : 7.0F;
		lleg.rotationPointZ = f == 1 ? 8.5F : 9.5F;
		rleg.rotationPointZ = f == 1 ? 8.5F : 9.5F;

		if (isRiding){

			rarm1.rotateAngleX += -((float)Math.PI / 5F);
			larm1.rotateAngleX += -((float)Math.PI / 5F);

			rleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
			lleg.rotateAngleX = -((float)Math.PI * 2F / 5F);

			rleg.rotateAngleY = (float)Math.PI / 10F;
			lleg.rotateAngleY = -((float)Math.PI / 10F);
		}

		float f6 = MathHelper.sin(swingProgress * (float)Math.PI);
		float f7 = MathHelper.sin((1.0F - (1.0F - swingProgress) * (1.0F - swingProgress)) * (float)Math.PI);
		rarm1.rotateAngleZ = 0.0F;
		larm1.rotateAngleZ = 0.0F;
		rarm1.rotateAngleY = 0.1F - f6;
		larm1.rotateAngleY = -(0.1F - f6);
		rarm1.rotateAngleX = (f == 0 ? -0.5F : -1.48352986419518F) + MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
		larm1.rotateAngleX = (f == 0 ? -0.5F : -1.48352986419518F) + MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
		rarm1.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
		larm1.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
		rarm1.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		larm1.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		rarm1.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
		larm1.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	/*public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void postRenderArm(float scale, EnumHandSide side){
		getArmForSide(side).postRender(scale);
	}

	protected ModelRenderer getArmForSide(EnumHandSide side)
	{
		return side == EnumHandSide.LEFT ? larm1 : rarm1;
	}

	@Override
	public void setVisible(boolean visible) {
		lleg.showModel = visible;
		rleg.showModel = visible;
		pelvis.showModel = visible;
		head.showModel = visible;
		shoulders.showModel = visible;
	}

	@Override
	public void setEquipmentSlotVisible(EntityEquipmentSlot slot) {
		lfinger1.showModel = false;
		lfinger2.showModel = false;
		lfinger3.showModel = false;
		lfinger4.showModel = false;
		rfinger1.showModel = false;
		rfinger2.showModel = false;
		rfinger3.showModel = false;
		rfinger4.showModel = false;
		spine.showModel = false;
		switch (slot) {
		case FEET:
			rleg.showModel = true;
			lleg.showModel = true;
			break;
		case LEGS:
			pelvis.showModel = true;
			rleg.showModel = true;
			lleg.showModel = true;
			break;
		case CHEST:
			shoulders.showModel = true;
			break;
		case HEAD:
			head.showModel = true;
			break;
		default:
			break;
		}
	}
}*/
