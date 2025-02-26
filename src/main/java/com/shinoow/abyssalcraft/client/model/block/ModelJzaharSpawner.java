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
package com.shinoow.abyssalcraft.client.model.block;

//import net.minecraft.client.model.ModelBase;
//import net.minecraft.client.model.ModelRenderer;
//import net.minecraft.entity.Entity;
//import net.minecraft.util.math.MathHelper;

/*public class ModelJzaharSpawner extends ModelBase
{

	public ModelRenderer head;
	public ModelRenderer mask1;
	public ModelRenderer mask2;
	public ModelRenderer facetentacle1;
	public ModelRenderer facetentacle2;
	public ModelRenderer facetentacle3;
	public ModelRenderer body1;
	public ModelRenderer body2;
	public ModelRenderer body3;
	public ModelRenderer body4;
	public ModelRenderer body5;
	public ModelRenderer eye1;
	public ModelRenderer eye2;
	public ModelRenderer tentacle1;
	public ModelRenderer tentacle12;
	public ModelRenderer tentacle13;
	public ModelRenderer foot1;
	public ModelRenderer tentacle2;
	public ModelRenderer tentacle22;
	public ModelRenderer tentacle23;
	public ModelRenderer foot2;
	public ModelRenderer tentacle3;
	public ModelRenderer tentacle32;
	public ModelRenderer tentacle33;
	public ModelRenderer foot3;
	public ModelRenderer tentacle4;
	public ModelRenderer tentacle42;
	public ModelRenderer tentacle43;
	public ModelRenderer foot4;
	public ModelRenderer tentacle5;
	public ModelRenderer tentacle52;
	public ModelRenderer tentacle53;
	public ModelRenderer tentacle54;
	public ModelRenderer tentacle55;
	public ModelRenderer arm;
	public ModelRenderer Staff1;
	public ModelRenderer Staff2;
	public ModelRenderer Staff3;
	public ModelRenderer Staff4;
	public ModelRenderer Staff5;
	public ModelRenderer Staff6;
	public ModelRenderer Cube;
	public ModelRenderer tentacle6;
	public ModelRenderer tentacle62;
	public ModelRenderer tentacle63;
	public ModelRenderer foot5;
	public ModelRenderer tentacle7;
	public ModelRenderer tentacle72;
	public ModelRenderer tentacle73;
	public ModelRenderer tentacle74;
	public ModelRenderer tentacle75;
	public ModelRenderer tentacle76;
	public ModelRenderer tentacle77;
	public ModelRenderer abyssalnomicon;

	public ModelJzaharSpawner()
	{
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 72, 0);
		head.addBox(-5F, -10F, -5F, 10, 10, 10);
		head.setRotationPoint(2F, -28F, 1F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		mask1 = new ModelRenderer(this, 102, 0);
		mask1.addBox(-3.5F, -10F, -7F, 6, 8, 1);
		mask1.setRotationPoint(0,0,0);
		mask1.setTextureSize(64, 32);
		mask1.mirror = true;
		setRotation(mask1, 0F, 0.3490659F, 0F);
		head.addChild(mask1);
		mask2 = new ModelRenderer(this, 102, 0);
		mask2.addBox(-2.5F, -10F, -7F, 6, 8, 1);
		mask2.setRotationPoint(0,0,0);
		mask2.setTextureSize(64, 32);
		mask2.mirror = true;
		setRotation(mask2, 0F, -0.3490659F, 0F);
		head.addChild(mask2);
		facetentacle1 = new ModelRenderer(this, 116, 0);
		facetentacle1.addBox(0F, 0F, 0F, 2, 6, 2);
		facetentacle1.setRotationPoint(-4F, -2F, -7F);
		facetentacle1.setTextureSize(64, 32);
		facetentacle1.mirror = true;
		setRotation(facetentacle1, 0F, 0F, 0F);
		head.addChild(facetentacle1);
		facetentacle2 = new ModelRenderer(this, 116, 0);
		facetentacle2.addBox(0F, 0F, 0F, 2, 6, 2);
		facetentacle2.setRotationPoint(-1F, -2F, -7F);
		facetentacle2.setTextureSize(64, 32);
		facetentacle2.mirror = true;
		setRotation(facetentacle2, 0F, 0F, 0F);
		head.addChild(facetentacle2);
		facetentacle3 = new ModelRenderer(this, 116, 0);
		facetentacle3.addBox(0F, 0F, 0F, 2, 6, 2);
		facetentacle3.setRotationPoint(2F, -2F, -7F);
		facetentacle3.setTextureSize(64, 32);
		facetentacle3.mirror = true;
		setRotation(facetentacle3, 0F, 0F, 0F);
		head.addChild(facetentacle3);
		body1 = new ModelRenderer(this, 0, 0);
		body1.addBox(0F, 0F, 0F, 18, 22, 5);
		body1.setRotationPoint(-7F, -28F, 0F);
		body1.setTextureSize(64, 32);
		body1.mirror = true;
		setRotation(body1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 46, 0);
		body2.addBox(0F, 0F, 0F, 5, 26, 1);
		body2.setRotationPoint(-7F, -28F, -1F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0F, 0F, 0F);
		body3 = new ModelRenderer(this, 58, 0);
		body3.addBox(0F, 0F, 0F, 5, 26, 1);
		body3.setRotationPoint(6F, -28F, -1F);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, 0F);
		body4 = new ModelRenderer(this, 46, 0);
		body4.addBox(0F, 0F, 0F, 4, 26, 1);
		body4.setRotationPoint(-7F, -28F, -2F);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0F, 0F, 0F);
		body5 = new ModelRenderer(this, 59, 0);
		body5.addBox(0F, 0F, 0F, 4, 26, 1);
		body5.setRotationPoint(7F, -28F, -2F);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 0F, 0F, 0F);
		eye1 = new ModelRenderer(this, 70, 0);
		eye1.addBox(0F, 0F, 0F, 5, 5, 1);
		eye1.setRotationPoint(-0.5F, -21F, -1F);
		eye1.setTextureSize(64, 32);
		eye1.mirror = true;
		setRotation(eye1, 0F, 0F, 0F);
		eye2 = new ModelRenderer(this, 70, 6);
		eye2.addBox(-1F, -1F, 0F, 2, 2, 1);
		eye2.setRotationPoint(2F, -18.5F, -1.5F);
		eye2.setTextureSize(64, 32);
		eye2.mirror = true;
		setRotation(eye2, 0F, 0F, 0F);
		tentacle1 = new ModelRenderer(this, 0, 27);
		tentacle1.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle1.setRotationPoint(-2.5F, -6.5F, 2F);
		tentacle1.setTextureSize(64, 32);
		tentacle1.mirror = true;
		setRotation(tentacle1, -0.0872665F, 0F, 0.0872665F);
		tentacle12 = new ModelRenderer(this, 0, 27);
		tentacle12.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle12.setRotationPoint(-3.3F, 2.3F, 1.2F);
		tentacle12.setTextureSize(64, 32);
		tentacle12.mirror = true;
		setRotation(tentacle12, -0.0872665F, 0F, 0.1745329F);
		tentacle13 = new ModelRenderer(this, 0, 27);
		tentacle13.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle13.setRotationPoint(-4.8F, 10.8F, 0.4F);
		tentacle13.setTextureSize(64, 32);
		tentacle13.mirror = true;
		setRotation(tentacle13, -0.0872665F, 0F, 0F);
		foot1 = new ModelRenderer(this, 0, 39);
		foot1.addBox(-1.5F, 0F, -5F, 3, 3, 6);
		foot1.setRotationPoint(-4.8F, 19.1F, -0.2F);
		foot1.setTextureSize(64, 32);
		foot1.mirror = true;
		setRotation(foot1, 0.2617994F, 0F, 0F);
		tentacle2 = new ModelRenderer(this, 0, 27);
		tentacle2.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle2.setRotationPoint(0.5F, -6.5F, 2F);
		tentacle2.setTextureSize(64, 32);
		tentacle2.mirror = true;
		setRotation(tentacle2, -0.0872665F, 0F, 0.0349066F);
		tentacle22 = new ModelRenderer(this, 0, 27);
		tentacle22.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle22.setRotationPoint(0.2F, 2.3F, 1.2F);
		tentacle22.setTextureSize(64, 32);
		tentacle22.mirror = true;
		setRotation(tentacle22, -0.1745329F, 0F, 0.0523599F);
		tentacle23 = new ModelRenderer(this, 0, 27);
		tentacle23.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle23.setRotationPoint(-0.2F, 10.7F, -0.4F);
		tentacle23.setTextureSize(64, 32);
		tentacle23.mirror = true;
		setRotation(tentacle23, 0.0872665F, 0F, 0.0872665F);
		foot2 = new ModelRenderer(this, 0, 39);
		foot2.addBox(-1.5F, 0F, -5F, 3, 3, 6);
		foot2.setRotationPoint(-1F, 19F, 0.7F);
		foot2.setTextureSize(64, 32);
		foot2.mirror = true;
		setRotation(foot2, 0.2617994F, 0F, 0F);
		tentacle3 = new ModelRenderer(this, 0, 27);
		tentacle3.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle3.setRotationPoint(3.5F, -6.5F, 2F);
		tentacle3.setTextureSize(64, 32);
		tentacle3.mirror = true;
		setRotation(tentacle3, -0.0872665F, 0F, -0.0349066F);
		tentacle32 = new ModelRenderer(this, 0, 27);
		tentacle32.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle32.setRotationPoint(3.8F, 2.3F, 1.2F);
		tentacle32.setTextureSize(64, 32);
		tentacle32.mirror = true;
		setRotation(tentacle32, -0.0698132F, 0F, -0.0698132F);
		tentacle33 = new ModelRenderer(this, 0, 27);
		tentacle33.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle33.setRotationPoint(4.4F, 11F, 0.6F);
		tentacle33.setTextureSize(64, 32);
		tentacle33.mirror = true;
		setRotation(tentacle33, -0.1745329F, 0F, 0F);
		foot3 = new ModelRenderer(this, 0, 39);
		foot3.addBox(-1.5F, 0F, -5F, 3, 3, 6);
		foot3.setRotationPoint(4.4F, 19.1F, -0.7F);
		foot3.setTextureSize(64, 32);
		foot3.mirror = true;
		setRotation(foot3, 0.2617994F, 0F, 0F);
		tentacle4 = new ModelRenderer(this, 0, 27);
		tentacle4.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle4.setRotationPoint(6.5F, -6.5F, 2F);
		tentacle4.setTextureSize(64, 32);
		tentacle4.mirror = true;
		setRotation(tentacle4, -0.0872665F, 0F, -0.0872665F);
		tentacle42 = new ModelRenderer(this, 0, 27);
		tentacle42.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle42.setRotationPoint(7.2F, 2F, 1.2F);
		tentacle42.setTextureSize(64, 32);
		tentacle42.mirror = true;
		setRotation(tentacle42, 0.0872665F, 0F, -0.1745329F);
		tentacle43 = new ModelRenderer(this, 0, 27);
		tentacle43.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle43.setRotationPoint(8.7F, 10.6F, 2F);
		tentacle43.setTextureSize(64, 32);
		tentacle43.mirror = true;
		setRotation(tentacle43, 0.1745329F, 0F, -0.0872665F);
		foot4 = new ModelRenderer(this, 0, 39);
		foot4.addBox(-1.5F, 0F, -5F, 3, 3, 6);
		foot4.setRotationPoint(9.4F, 19F, 4F);
		foot4.setTextureSize(64, 32);
		foot4.mirror = true;
		setRotation(foot4, 0.2617994F, 0F, 0F);
		tentacle5 = new ModelRenderer(this, 0, 27);
		tentacle5.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle5.setRotationPoint(-1F, -6.5F, 3F);
		tentacle5.setTextureSize(64, 32);
		tentacle5.mirror = true;
		setRotation(tentacle5, 0.0872665F, 0F, 0.0872665F);
		tentacle52 = new ModelRenderer(this, 0, 27);
		tentacle52.addBox(-1.5F, 0F, -1.5F, 3, 3, 3);
		tentacle52.setRotationPoint(-1.7F, 2F, 3.8F);
		tentacle52.setTextureSize(64, 32);
		tentacle52.mirror = true;
		setRotation(tentacle52, 0F, 0F, 0.2617994F);
		tentacle53 = new ModelRenderer(this, 0, 27);
		tentacle53.addBox(-1.5F, 0F, -1.5F, 3, 3, 3);
		tentacle53.setRotationPoint(-2.3F, 4.7F, 3.8F);
		tentacle53.setTextureSize(64, 32);
		tentacle53.mirror = true;
		setRotation(tentacle53, 0F, 0F, 0.4363323F);
		tentacle54 = new ModelRenderer(this, 12, 27);
		tentacle54.addBox(-5F, -1.5F, -1.5F, 5, 3, 3);
		tentacle54.setRotationPoint(-2.2F, 6.6F, 3.8F);
		tentacle54.setTextureSize(64, 32);
		tentacle54.mirror = true;
		setRotation(tentacle54, 0F, 0F, 0F);
		tentacle55 = new ModelRenderer(this, 0, 30);
		tentacle55.addBox(-3F, -1.5F, -1.5F, 3, 3, 3);
		tentacle55.setRotationPoint(-6.4F, 6.7F, 3.9F);
		tentacle55.setTextureSize(64, 32);
		tentacle55.mirror = true;
		setRotation(tentacle55, 0F, -0.2617994F, 0.2617994F);
		arm = new ModelRenderer(this, 12, 33);
		arm.addBox(-1.5F, -9F, -1.5F, 3, 9, 3);
		arm.setRotationPoint(-8.2F, 6.7F, 3.4F);
		arm.setTextureSize(64, 32);
		arm.mirror = true;
		setRotation(arm, 0F, -0.2617994F, -0.5235988F);
		Staff1 = new ModelRenderer(this, 54, 27);
		Staff1.addBox(-4.8F, -20.7F, -1.4F, 1, 18, 1);
		Staff1.setRotationPoint(0,0,0);
		Staff1.setTextureSize(64, 32);
		Staff1.mirror = true;
		setRotation(Staff1, 0F, -arm.rotateAngleY, -arm.rotateAngleZ);
		arm.addChild(Staff1);
		Staff2 = new ModelRenderer(this, 62, 27);
		Staff2.addBox(6F, -23.8F, -1.4F, 1, 4, 1);
		Staff2.setRotationPoint(0,0,0);
		Staff2.setTextureSize(64, 32);
		Staff2.mirror = true;
		setRotation(Staff2, 0F, 0F, -0.5235988F);
		Staff1.addChild(Staff2);
		Staff3 = new ModelRenderer(this, 66, 27);
		Staff3.addBox(-6.7F, -25.6F, -1.4F, 1, 2, 1);
		Staff3.setRotationPoint(0,0,0);
		Staff3.setTextureSize(64, 32);
		Staff3.mirror = true;
		setRotation(Staff3, 0F, 0F, 0F);
		Staff1.addChild(Staff3);
		Staff4 = new ModelRenderer(this, 66, 30);
		Staff4.addBox(-21.6F, -19.3F, -1.4F, 1, 4, 1);
		Staff4.setRotationPoint(0,0,0);
		Staff4.setTextureSize(64, 32);
		Staff4.mirror = true;
		setRotation(Staff4, 0F, 0F, 0.6981317F);
		Staff1.addChild(Staff4);
		Staff5 = new ModelRenderer(this, 62, 32);
		Staff5.addBox(18.3F, -21.5F, -1.4F, 1, 4, 1);
		Staff5.setRotationPoint(0,0,0);
		Staff5.setTextureSize(64, 32);
		Staff5.mirror = true;
		setRotation(Staff5, 0F, 0F, -0.8726646F);
		Staff1.addChild(Staff5);
		Staff6 = new ModelRenderer(this, 66, 35);
		Staff6.addBox(-3.9F, 1F, -4.1F, 1, 1, 1);
		Staff6.setRotationPoint(0,0,0);
		Staff6.setTextureSize(64, 32);
		Staff6.mirror = true;
		setRotation(Staff6, -0.8922867F, 0.5948578F, 0.2230717F);
		Staff1.addChild(Staff6);
		Cube = new ModelRenderer(this, 62, 42);
		Cube.addBox(-14.0F, -20.0F, -8.5F, 2, 2, 2);
		Cube.setRotationPoint(0,0,0);
		Cube.setTextureSize(64, 32);
		Cube.mirror = true;
		setRotation(Cube, 0F, 0.4833219F, 0.5205006F);
		Staff1.addChild(Cube);
		tentacle6 = new ModelRenderer(this, 0, 27);
		tentacle6.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle6.setRotationPoint(2F, -6.5F, 3F);
		tentacle6.setTextureSize(64, 32);
		tentacle6.mirror = true;
		setRotation(tentacle6, 0.0872665F, 0F, 0F);
		tentacle62 = new ModelRenderer(this, 0, 27);
		tentacle62.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle62.setRotationPoint(2F, 2.3F, 3.8F);
		tentacle62.setTextureSize(64, 32);
		tentacle62.mirror = true;
		setRotation(tentacle62, 0.1745329F, 0F, 0.0872665F);
		tentacle63 = new ModelRenderer(this, 0, 27);
		tentacle63.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle63.setRotationPoint(1.2F, 10.5F, 5.3F);
		tentacle63.setTextureSize(64, 32);
		tentacle63.mirror = true;
		setRotation(tentacle63, -0.0872665F, 0F, -0.0872665F);
		foot5 = new ModelRenderer(this, 0, 39);
		foot5.addBox(-1.5F, 0F, -1F, 3, 3, 6);
		foot5.setRotationPoint(1.9F, 19.2F, 4.1F);
		foot5.setTextureSize(64, 32);
		foot5.mirror = true;
		setRotation(foot5, -0.2617994F, 0F, 0F);
		tentacle7 = new ModelRenderer(this, 0, 27);
		tentacle7.addBox(-1.5F, 0F, -1.5F, 3, 9, 3);
		tentacle7.setRotationPoint(5F, -6.5F, 3F);
		tentacle7.setTextureSize(64, 32);
		tentacle7.mirror = true;
		setRotation(tentacle7, 0.0872665F, -0.0872665F, -0.0872665F);
		tentacle72 = new ModelRenderer(this, 0, 27);
		tentacle72.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
		tentacle72.setRotationPoint(5.7F, 1.9F, 3.8F);
		tentacle72.setTextureSize(64, 32);
		tentacle72.mirror = true;
		setRotation(tentacle72, 0F, -0.1745329F, -0.3490659F);
		tentacle73 = new ModelRenderer(this, 0, 27);
		tentacle73.addBox(-1.5F, 0F, -1.5F, 3, 5, 3);
		tentacle73.setRotationPoint(6.7F, 5.1F, 3.8F);
		tentacle73.setTextureSize(64, 32);
		tentacle73.mirror = true;
		setRotation(tentacle73, 0F, -0.1745329F, -0.7853982F);
		tentacle74 = new ModelRenderer(this, 0, 30);
		tentacle74.addBox(0F, -1.5F, -1.5F, 3, 3, 3);
		tentacle74.setRotationPoint(9.2F, 8.2F, 3.9F);
		tentacle74.setTextureSize(64, 32);
		tentacle74.mirror = true;
		setRotation(tentacle74, 0F, -0.1745329F, 0F);
		tentacle75 = new ModelRenderer(this, 12, 33);
		tentacle75.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
		tentacle75.setRotationPoint(10.9F, 9F, 4.5F);
		tentacle75.setTextureSize(64, 32);
		tentacle75.mirror = true;
		setRotation(tentacle75, 0F, -0.1745329F, 0.5235988F);
		tentacle76 = new ModelRenderer(this, 12, 33);
		tentacle76.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		tentacle76.setRotationPoint(13.7F, 4.3F, 4.5F);
		tentacle76.setTextureSize(64, 32);
		tentacle76.mirror = true;
		setRotation(tentacle76, 0F, -0.1745329F, 0.2617994F);
		tentacle77 = new ModelRenderer(this, 12, 33);
		tentacle77.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
		tentacle77.setRotationPoint(14.3F, 1.9F, 4.7F);
		tentacle77.setTextureSize(64, 32);
		tentacle77.mirror = true;
		setRotation(tentacle77, 0.3490659F, -0.1745329F, 0.2617994F);
		abyssalnomicon = new ModelRenderer(this, 28, 27);
		abyssalnomicon.addBox(-5F, -12F, -1.5F, 10, 12, 3);
		abyssalnomicon.setRotationPoint(17F, -5F, 3F);
		abyssalnomicon.setTextureSize(64, 32);
		abyssalnomicon.mirror = true;
		setRotation(abyssalnomicon, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		body4.render(f5);
		body5.render(f5);
		eye1.render(f5);
		eye2.render(f5);
		tentacle1.render(f5);
		tentacle12.render(f5);
		tentacle13.render(f5);
		foot1.render(f5);
		tentacle2.render(f5);
		tentacle22.render(f5);
		tentacle23.render(f5);
		foot2.render(f5);
		tentacle3.render(f5);
		tentacle32.render(f5);
		tentacle33.render(f5);
		foot3.render(f5);
		tentacle4.render(f5);
		tentacle42.render(f5);
		tentacle43.render(f5);
		foot4.render(f5);
		tentacle5.render(f5);
		tentacle52.render(f5);
		tentacle53.render(f5);
		tentacle54.render(f5);
		tentacle55.render(f5);
		arm.render(f5);
		tentacle6.render(f5);
		tentacle62.render(f5);
		tentacle63.render(f5);
		foot5.render(f5);
		tentacle7.render(f5);
		tentacle72.render(f5);
		tentacle73.render(f5);
		tentacle74.render(f5);
		tentacle75.render(f5);
		tentacle76.render(f5);
		tentacle77.render(f5);
		abyssalnomicon.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		head.rotateAngleY = f3 / (180F / (float)Math.PI);
		head.rotateAngleX = f4 / (180F / (float)Math.PI);

		for(int i = 0; i < 4; i++)
			abyssalnomicon.rotationPointY = -5.5F + MathHelper.cos((i * 2 + f2) * 0.25F);

		setRotation(arm, 0F, -0.2617994F, -0.5235988F);

		tentacle12.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle22.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle32.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle42.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle62.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle13.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle23.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle33.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle43.rotateAngleX = -((float)Math.PI * 2F / 5F);
		tentacle63.rotateAngleX = -((float)Math.PI * 2F / 5F);

		tentacle12.rotateAngleY = (float)Math.PI / 10F;
		tentacle22.rotateAngleY = (float)Math.PI / 10F;
		tentacle32.rotateAngleY = -(float)Math.PI / 10F;
		tentacle42.rotateAngleY = -((float)Math.PI / 10F);
		tentacle13.rotateAngleY = (float)Math.PI / 10F;
		tentacle23.rotateAngleY = (float)Math.PI / 10F;
		tentacle33.rotateAngleY = -(float)Math.PI / 10F;
		tentacle43.rotateAngleY = -((float)Math.PI / 10F);

		foot1.rotateAngleX = -((float)Math.PI * 2F / 5F);
		foot2.rotateAngleX = -((float)Math.PI * 2F / 5F);
		foot3.rotateAngleX = -((float)Math.PI * 2F / 5F);
		foot4.rotateAngleX = -((float)Math.PI * 2F / 5F);
		foot5.rotateAngleX = -((float)Math.PI * 2F / 5F);

		foot1.rotateAngleY = (float)Math.PI / 10F;
		foot2.rotateAngleY = (float)Math.PI / 10F;
		foot3.rotateAngleY = -(float)Math.PI / 10F;
		foot4.rotateAngleY = -((float)Math.PI / 10F);
		foot5.rotateAngleY = (float)Math.PI / 10F;

		tentacle12.rotationPointZ =+ 2;
		tentacle22.rotationPointZ =+ 2;
		tentacle32.rotationPointZ =+ 2;
		tentacle42.rotationPointZ =+ 2;
		tentacle62.rotationPointZ =+ 4.5F;

		tentacle12.rotationPointX =- 3.5F;
		tentacle22.rotationPointX =+ 0.5F;
		tentacle32.rotationPointX =+ 3.3F;
		tentacle42.rotationPointX =+ 6.6F;

		tentacle13.rotationPointY =+ 4.6F;
		tentacle23.rotationPointY =+ 4.8F;
		tentacle33.rotationPointY =+ 5F;
		tentacle43.rotationPointY =+ 4.3F;
		tentacle63.rotationPointY =+ 5.3F;

		tentacle13.rotationPointZ =- 5.5F;
		tentacle23.rotationPointZ =- 5.5F;
		tentacle33.rotationPointZ =- 6;
		tentacle43.rotationPointZ =- 6;
		tentacle63.rotationPointZ =- 4;

		tentacle13.rotationPointX =- 6.2F;
		tentacle23.rotationPointX =- 2.2F;
		tentacle33.rotationPointX =+ 6F;
		tentacle43.rotationPointX =+ 9.6F;
		tentacle63.rotationPointX =+ 2F;

		foot1.rotationPointX =- 8.2F;
		foot2.rotationPointX =- 4.5F;
		foot3.rotationPointX =+ 7.7F;
		foot4.rotationPointX =+ 11.6F;

		foot1.rotationPointY =+ 7F;
		foot2.rotationPointY =+ 7F;
		foot3.rotationPointY =+ 7.5F;
		foot4.rotationPointY =+ 6.5F;
		foot5.rotationPointY =+ 3.7F;

		foot1.rotationPointZ =- 12;
		foot2.rotationPointZ =- 12;
		foot3.rotationPointZ =- 12;
		foot4.rotationPointZ =- 12;
		foot5.rotationPointZ =- 12;
	}
}*/
