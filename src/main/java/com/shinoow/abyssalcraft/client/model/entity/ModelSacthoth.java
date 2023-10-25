/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2023 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSacthoth extends ModelBase {

	public ModelRenderer head;
	public ModelRenderer leftshoulder;
	public ModelRenderer leftarm1;
	public ModelRenderer leftarm2;
	public ModelRenderer rightshoulder;
	public ModelRenderer rightarm1;
	public ModelRenderer rightarm2;
	public ModelRenderer body;
	public ModelRenderer core;
	public ModelRenderer leftleg;
	public ModelRenderer rightleg;
	public ModelRenderer spikerow11;
	public ModelRenderer spikerow12;
	public ModelRenderer spikerow13;
	public ModelRenderer spikerow14;
	public ModelRenderer spikerow15;
	public ModelRenderer spikerow16;
	public ModelRenderer spikerow17;
	public ModelRenderer spikerow18;
	public ModelRenderer spikerow19;
	public ModelRenderer spikerow110;
	public ModelRenderer spikerow111;
	public ModelRenderer spikerow112;
	public ModelRenderer spikerow113;
	public ModelRenderer spikerow114;
	public ModelRenderer spikerow115;
	public ModelRenderer spikerow116;
	public ModelRenderer spikerow21;
	public ModelRenderer spikerow22;
	public ModelRenderer spikerow23;
	public ModelRenderer spikerow24;
	public ModelRenderer spikerow25;
	public ModelRenderer spikerow26;
	public ModelRenderer spikerow27;
	public ModelRenderer spikerow28;
	public ModelRenderer spikerow29;
	public ModelRenderer spikerow210;
	public ModelRenderer spikerow211;
	public ModelRenderer spikerow212;
	public ModelRenderer spikerow31;
	public ModelRenderer spikerow32;
	public ModelRenderer spikerow33;
	public ModelRenderer spikerow34;
	public ModelRenderer spikerow35;
	public ModelRenderer spikerow36;
	public ModelRenderer spikerow37;
	public ModelRenderer spikerow38;
	public ModelRenderer spikerow41;
	public ModelRenderer spikerow42;
	public ModelRenderer spikerow43;
	public ModelRenderer spikerow44;
	public ModelRenderer tbase1;
	public ModelRenderer tbase2;
	public ModelRenderer tbase3;
	public ModelRenderer tbase4;
	public ModelRenderer tbase5;
	public ModelRenderer tentacle1;
	public ModelRenderer tentacle2;
	public ModelRenderer tentacle3;
	public ModelRenderer tentacle4;
	public ModelRenderer tentacle5;

	public ModelSacthoth()
	{
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4.5F, -10F, -4.5F, 9, 10, 9);
		head.setRotationPoint(0F, -22F, 0F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		leftshoulder = new ModelRenderer(this, 72, 0);
		leftshoulder.addBox(0F, 0F, 0F, 8, 5, 7);
		leftshoulder.setRotationPoint(5.5F, -22F, -3.5F);
		leftshoulder.setTextureSize(128, 64);
		leftshoulder.mirror = true;
		setRotation(leftshoulder, 0F, 0F, 0.185895F);
		leftarm1 = new ModelRenderer(this, 72, 12);
		leftarm1.addBox(-5F, -1F, -2.5F, 5, 12, 5);
		leftarm1.setRotationPoint(-6.5F, -19F, 0F);
		leftarm1.setTextureSize(128, 64);
		leftarm1.mirror = true;
		setRotation(leftarm1, 0F, 0F, 0F);
		leftarm2 = new ModelRenderer(this, 72, 12);
		leftarm2.addBox(-5F, 8F, 3F, 5, 12, 5);
		leftarm2.setRotationPoint(0,0,0);
		leftarm2.setTextureSize(128, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, -0.5576792F, 0F, 0F);
		leftarm1.addChild(leftarm2);
		rightshoulder = new ModelRenderer(this, 72, 0);
		rightshoulder.addBox(-8F, 0F, 0F, 8, 5, 7);
		rightshoulder.setRotationPoint(-5.5F, -22F, -3.5F);
		rightshoulder.setTextureSize(128, 64);
		rightshoulder.mirror = true;
		setRotation(rightshoulder, 0F, 0F, -0.1858931F);
		rightarm1 = new ModelRenderer(this, 72, 12);
		rightarm1.addBox(-0.5F, -1F, -2.5F, 5, 12, 5);
		rightarm1.setRotationPoint(7F, -19F, 0F);
		rightarm1.setTextureSize(128, 64);
		rightarm1.mirror = true;
		setRotation(rightarm1, 0F, 0F, 0F);
		rightarm2 = new ModelRenderer(this, 72, 12);
		rightarm2.addBox(-0.5F, 8F, 3F, 5, 12, 5);
		rightarm2.setRotationPoint(0,0,0);
		rightarm2.setTextureSize(128, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, -0.5576851F, 0F, 0F);
		rightarm1.addChild(rightarm2);
		body = new ModelRenderer(this, 36, 0);
		body.addBox(0F, 0F, 0F, 11, 24, 7);
		body.setRotationPoint(-5.5F, -22F, -3.5F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		core = new ModelRenderer(this, 0, 20);
		core.addBox(0F, 0F, 0F, 5, 5, 1);
		core.setRotationPoint(-2.5F, -15F, -4.5F);
		core.setTextureSize(128, 64);
		core.mirror = true;
		setRotation(core, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 102, 0);
		leftleg.addBox(-2.5F, 0F, -3.5F, 5, 22, 7);
		leftleg.setRotationPoint(-3F, 2F, 0F);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 102, 0);
		rightleg.addBox(-2.5F, 0F, -3.5F, 5, 22, 7);
		rightleg.setRotationPoint(3F, 2F, 0F);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		spikerow11 = new ModelRenderer(this, 0, 0);
		spikerow11.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow11.setRotationPoint(-4.5F, -12F, -4.5F);
		spikerow11.setTextureSize(128, 64);
		spikerow11.mirror = true;
		setRotation(spikerow11, 0F, 0F, 0F);
		head.addChild(spikerow11);
		spikerow12 = new ModelRenderer(this, 0, 0);
		spikerow12.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow12.setRotationPoint(-2.5F, -12F, -4.5F);
		spikerow12.setTextureSize(128, 64);
		spikerow12.mirror = true;
		setRotation(spikerow12, 0F, 0F, 0F);
		head.addChild(spikerow12);
		spikerow13 = new ModelRenderer(this, 0, 0);
		spikerow13.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow13.setRotationPoint(-0.5F, -12F, -4.5F);
		spikerow13.setTextureSize(128, 64);
		spikerow13.mirror = true;
		setRotation(spikerow13, 0F, 0F, 0F);
		head.addChild(spikerow13);
		spikerow14 = new ModelRenderer(this, 0, 0);
		spikerow14.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow14.setRotationPoint(1.5F, -12F, -4.5F);
		spikerow14.setTextureSize(128, 64);
		spikerow14.mirror = true;
		setRotation(spikerow14, 0F, 0F, 0F);
		head.addChild(spikerow14);
		spikerow15 = new ModelRenderer(this, 0, 0);
		spikerow15.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow15.setRotationPoint(3.5F, -12F, -4.5F);
		spikerow15.setTextureSize(128, 64);
		spikerow15.mirror = true;
		setRotation(spikerow15, 0F, 0F, 0F);
		head.addChild(spikerow15);
		spikerow16 = new ModelRenderer(this, 0, 0);
		spikerow16.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow16.setRotationPoint(3.5F, -12F, -2.5F);
		spikerow16.setTextureSize(128, 64);
		spikerow16.mirror = true;
		setRotation(spikerow16, 0F, 0F, 0F);
		head.addChild(spikerow16);
		spikerow17 = new ModelRenderer(this, 0, 0);
		spikerow17.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow17.setRotationPoint(3.5F, -12F, -0.5F);
		spikerow17.setTextureSize(128, 64);
		spikerow17.mirror = true;
		setRotation(spikerow17, 0F, 0F, 0F);
		head.addChild(spikerow17);
		spikerow18 = new ModelRenderer(this, 0, 0);
		spikerow18.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow18.setRotationPoint(3.5F, -12F, 1.5F);
		spikerow18.setTextureSize(128, 64);
		spikerow18.mirror = true;
		setRotation(spikerow18, 0F, 0F, 0F);
		head.addChild(spikerow18);
		spikerow19 = new ModelRenderer(this, 0, 0);
		spikerow19.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow19.setRotationPoint(3.5F, -12F, 3.5F);
		spikerow19.setTextureSize(128, 64);
		spikerow19.mirror = true;
		setRotation(spikerow19, 0F, 0F, 0F);
		head.addChild(spikerow19);
		spikerow110 = new ModelRenderer(this, 0, 0);
		spikerow110.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow110.setRotationPoint(1.5F, -12F, 3.5F);
		spikerow110.setTextureSize(128, 64);
		spikerow110.mirror = true;
		setRotation(spikerow110, 0F, 0F, 0F);
		head.addChild(spikerow110);
		spikerow111 = new ModelRenderer(this, 0, 0);
		spikerow111.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow111.setRotationPoint(-0.5F, -12F, 3.5F);
		spikerow111.setTextureSize(128, 64);
		spikerow111.mirror = true;
		setRotation(spikerow111, 0F, 0F, 0F);
		head.addChild(spikerow111);
		spikerow112 = new ModelRenderer(this, 0, 0);
		spikerow112.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow112.setRotationPoint(-2.5F, -12F, 3.5F);
		spikerow112.setTextureSize(128, 64);
		spikerow112.mirror = true;
		setRotation(spikerow112, 0F, 0F, 0F);
		head.addChild(spikerow112);
		spikerow113 = new ModelRenderer(this, 0, 0);
		spikerow113.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow113.setRotationPoint(-4.5F, -12F, 3.5F);
		spikerow113.setTextureSize(128, 64);
		spikerow113.mirror = true;
		setRotation(spikerow113, 0F, 0F, 0F);
		head.addChild(spikerow113);
		spikerow114 = new ModelRenderer(this, 0, 0);
		spikerow114.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow114.setRotationPoint(-4.5F, -12F, 1.5F);
		spikerow114.setTextureSize(128, 64);
		spikerow114.mirror = true;
		setRotation(spikerow114, 0F, 0F, 0F);
		head.addChild(spikerow114);
		spikerow115 = new ModelRenderer(this, 0, 0);
		spikerow115.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow115.setRotationPoint(-4.5F, -12F, -0.5F);
		spikerow115.setTextureSize(128, 64);
		spikerow115.mirror = true;
		setRotation(spikerow115, 0F, 0F, 0F);
		head.addChild(spikerow115);
		spikerow116 = new ModelRenderer(this, 0, 0);
		spikerow116.addBox(0F, 0F, 0F, 1, 2, 1);
		spikerow116.setRotationPoint(-4.5F, -12F, -2.5F);
		spikerow116.setTextureSize(128, 64);
		spikerow116.mirror = true;
		setRotation(spikerow116, 0F, 0F, 0F);
		head.addChild(spikerow116);
		spikerow21 = new ModelRenderer(this, 0, 0);
		spikerow21.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow21.setRotationPoint(-3.5F, -13F, -3.5F);
		spikerow21.setTextureSize(128, 64);
		spikerow21.mirror = true;
		setRotation(spikerow21, 0F, 0F, 0F);
		head.addChild(spikerow21);
		spikerow22 = new ModelRenderer(this, 0, 0);
		spikerow22.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow22.setRotationPoint(-1.5F, -13F, -3.5F);
		spikerow22.setTextureSize(128, 64);
		spikerow22.mirror = true;
		setRotation(spikerow22, 0F, 0F, 0F);
		head.addChild(spikerow22);
		spikerow23 = new ModelRenderer(this, 0, 0);
		spikerow23.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow23.setRotationPoint(0.5F, -13F, -3.5F);
		spikerow23.setTextureSize(128, 64);
		spikerow23.mirror = true;
		setRotation(spikerow23, 0F, 0F, 0F);
		head.addChild(spikerow23);
		spikerow24 = new ModelRenderer(this, 0, 0);
		spikerow24.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow24.setRotationPoint(2.5F, -13F, -3.5F);
		spikerow24.setTextureSize(128, 64);
		spikerow24.mirror = true;
		setRotation(spikerow24, 0F, 0F, 0F);
		head.addChild(spikerow24);
		spikerow25 = new ModelRenderer(this, 0, 0);
		spikerow25.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow25.setRotationPoint(2.5F, -13F, -1.5F);
		spikerow25.setTextureSize(128, 64);
		spikerow25.mirror = true;
		setRotation(spikerow25, 0F, 0F, 0F);
		head.addChild(spikerow25);
		spikerow26 = new ModelRenderer(this, 0, 0);
		spikerow26.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow26.setRotationPoint(2.5F, -13F, 0.5F);
		spikerow26.setTextureSize(128, 64);
		spikerow26.mirror = true;
		setRotation(spikerow26, 0F, 0F, 0F);
		head.addChild(spikerow26);
		spikerow27 = new ModelRenderer(this, 0, 0);
		spikerow27.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow27.setRotationPoint(2.5F, -13F, 2.5F);
		spikerow27.setTextureSize(128, 64);
		spikerow27.mirror = true;
		setRotation(spikerow27, 0F, 0F, 0F);
		head.addChild(spikerow27);
		spikerow28 = new ModelRenderer(this, 0, 0);
		spikerow28.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow28.setRotationPoint(0.5F, -13F, 2.5F);
		spikerow28.setTextureSize(128, 64);
		spikerow28.mirror = true;
		setRotation(spikerow28, 0F, 0F, 0F);
		head.addChild(spikerow28);
		spikerow29 = new ModelRenderer(this, 0, 0);
		spikerow29.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow29.setRotationPoint(-1.5F, -13F, 2.5F);
		spikerow29.setTextureSize(128, 64);
		spikerow29.mirror = true;
		setRotation(spikerow29, 0F, 0F, 0F);
		head.addChild(spikerow29);
		spikerow210 = new ModelRenderer(this, 0, 0);
		spikerow210.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow210.setRotationPoint(-3.5F, -13F, 2.5F);
		spikerow210.setTextureSize(128, 64);
		spikerow210.mirror = true;
		setRotation(spikerow210, 0F, 0F, 0F);
		head.addChild(spikerow210);
		spikerow211 = new ModelRenderer(this, 0, 0);
		spikerow211.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow211.setRotationPoint(-3.5F, -13F, 0.5F);
		spikerow211.setTextureSize(128, 64);
		spikerow211.mirror = true;
		setRotation(spikerow211, 0F, 0F, 0F);
		head.addChild(spikerow211);
		spikerow212 = new ModelRenderer(this, 0, 0);
		spikerow212.addBox(0F, 0F, 0F, 1, 3, 1);
		spikerow212.setRotationPoint(-3.5F, -13F, -1.5F);
		spikerow212.setTextureSize(128, 64);
		spikerow212.mirror = true;
		setRotation(spikerow212, 0F, 0F, 0F);
		head.addChild(spikerow212);
		spikerow31 = new ModelRenderer(this, 0, 0);
		spikerow31.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow31.setRotationPoint(-2.5F, -14F, -2.5F);
		spikerow31.setTextureSize(128, 64);
		spikerow31.mirror = true;
		setRotation(spikerow31, 0F, 0F, 0F);
		head.addChild(spikerow31);
		spikerow32 = new ModelRenderer(this, 0, 0);
		spikerow32.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow32.setRotationPoint(-0.5F, -14F, -2.5F);
		spikerow32.setTextureSize(128, 64);
		spikerow32.mirror = true;
		setRotation(spikerow32, 0F, 0F, 0F);
		head.addChild(spikerow32);
		spikerow33 = new ModelRenderer(this, 0, 0);
		spikerow33.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow33.setRotationPoint(1.5F, -14F, -2.5F);
		spikerow33.setTextureSize(128, 64);
		spikerow33.mirror = true;
		setRotation(spikerow33, 0F, 0F, 0F);
		head.addChild(spikerow33);
		spikerow34 = new ModelRenderer(this, 0, 0);
		spikerow34.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow34.setRotationPoint(1.5F, -14F, -0.5F);
		spikerow34.setTextureSize(128, 64);
		spikerow34.mirror = true;
		setRotation(spikerow34, 0F, 0F, 0F);
		head.addChild(spikerow34);
		spikerow35 = new ModelRenderer(this, 0, 0);
		spikerow35.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow35.setRotationPoint(1.5F, -14F, 1.5F);
		spikerow35.setTextureSize(128, 64);
		spikerow35.mirror = true;
		setRotation(spikerow35, 0F, 0F, 0F);
		head.addChild(spikerow35);
		spikerow36 = new ModelRenderer(this, 0, 0);
		spikerow36.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow36.setRotationPoint(-0.5F, -14F, 1.5F);
		spikerow36.setTextureSize(128, 64);
		spikerow36.mirror = true;
		setRotation(spikerow36, 0F, 0F, 0F);
		head.addChild(spikerow36);
		spikerow37 = new ModelRenderer(this, 0, 0);
		spikerow37.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow37.setRotationPoint(-2.5F, -14F, 1.5F);
		spikerow37.setTextureSize(128, 64);
		spikerow37.mirror = true;
		setRotation(spikerow37, 0F, 0F, 0F);
		head.addChild(spikerow37);
		spikerow38 = new ModelRenderer(this, 0, 0);
		spikerow38.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow38.setRotationPoint(-2.5F, -14F, -0.5F);
		spikerow38.setTextureSize(128, 64);
		spikerow38.mirror = true;
		setRotation(spikerow38, 0F, 0F, 0F);
		head.addChild(spikerow38);
		spikerow41 = new ModelRenderer(this, 0, 0);
		spikerow41.addBox(0F, 0F, 0F, 1, 5, 1);
		spikerow41.setRotationPoint(-1.5F, -15F, -1.5F);
		spikerow41.setTextureSize(128, 64);
		spikerow41.mirror = true;
		setRotation(spikerow41, 0F, 0F, 0F);
		head.addChild(spikerow41);
		spikerow42 = new ModelRenderer(this, 0, 0);
		spikerow42.addBox(0F, 0F, 0F, 1, 5, 1);
		spikerow42.setRotationPoint(0.5F, -15F, -1.5F);
		spikerow42.setTextureSize(128, 64);
		spikerow42.mirror = true;
		setRotation(spikerow42, 0F, 0F, 0F);
		head.addChild(spikerow42);
		spikerow43 = new ModelRenderer(this, 0, 0);
		spikerow43.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow43.setRotationPoint(-1.5F, -15F, 0.5F);
		spikerow43.setTextureSize(128, 64);
		spikerow43.mirror = true;
		setRotation(spikerow43, 0F, 0F, 0F);
		head.addChild(spikerow43);
		spikerow44 = new ModelRenderer(this, 0, 0);
		spikerow44.addBox(0F, 0F, 0F, 1, 4, 1);
		spikerow44.setRotationPoint(0.5F, -15F, 0.5F);
		spikerow44.setTextureSize(128, 64);
		spikerow44.mirror = true;
		setRotation(spikerow44, 0F, 0F, 0F);
		head.addChild(spikerow44);
		tbase1 = new ModelRenderer(this, 30, 0);
		tbase1.addBox(0F, 0F, 0F, 1, 1, 1);
		tbase1.setRotationPoint(-4.5F, -1F, -5.5F);
		tbase1.setTextureSize(128, 64);
		tbase1.mirror = true;
		setRotation(tbase1, 0F, 0F, 0F);
		head.addChild(tbase1);
		tbase2 = new ModelRenderer(this, 30, 0);
		tbase2.addBox(0F, 0F, 0F, 1, 1, 1);
		tbase2.setRotationPoint(-2.5F, -1F, -5.5F);
		tbase2.setTextureSize(128, 64);
		tbase2.mirror = true;
		setRotation(tbase2, 0F, 0F, 0F);
		head.addChild(tbase2);
		tbase3 = new ModelRenderer(this, 30, 0);
		tbase3.addBox(0F, 0F, 0F, 1, 1, 1);
		tbase3.setRotationPoint(-0.5F, -1F, -5.5F);
		tbase3.setTextureSize(128, 64);
		tbase3.mirror = true;
		setRotation(tbase3, 0F, 0F, 0F);
		head.addChild(tbase3);
		tbase4 = new ModelRenderer(this, 30, 0);
		tbase4.addBox(0F, 0F, 0F, 1, 1, 1);
		tbase4.setRotationPoint(1.5F, -1F, -5.5F);
		tbase4.setTextureSize(128, 64);
		tbase4.mirror = true;
		setRotation(tbase4, 0F, 0F, 0F);
		head.addChild(tbase4);
		tbase5 = new ModelRenderer(this, 30, 0);
		tbase5.addBox(0F, 0F, 0F, 1, 1, 1);
		tbase5.setRotationPoint(3.5F, -1F, -5.5F);
		tbase5.setTextureSize(128, 64);
		tbase5.mirror = true;
		setRotation(tbase5, 0F, 0F, 0F);
		head.addChild(tbase5);
		tentacle1 = new ModelRenderer(this, 30, 0);
		tentacle1.addBox(0F, 0F, 0F, 1, 5, 1);
		tentacle1.setRotationPoint(0F, 0F, -1F);
		tentacle1.setTextureSize(128, 64);
		tentacle1.mirror = true;
		setRotation(tentacle1, 0F, 0F, 0F);
		tbase1.addChild(tentacle1);
		tentacle2 = new ModelRenderer(this, 30, 0);
		tentacle2.addBox(0F, 0F, 0F, 1, 5, 1);
		tentacle2.setRotationPoint(0F, 0F, -1F);
		tentacle2.setTextureSize(128, 64);
		tentacle2.mirror = true;
		setRotation(tentacle2, 0F, 0F, 0F);
		tbase2.addChild(tentacle2);
		tentacle3 = new ModelRenderer(this, 30, 0);
		tentacle3.addBox(0F, 0F, 0F, 1, 5, 1);
		tentacle3.setRotationPoint(0F, 0F, -1F);
		tentacle3.setTextureSize(128, 64);
		tentacle3.mirror = true;
		setRotation(tentacle3, 0F, 0F, 0F);
		tbase3.addChild(tentacle3);
		tentacle4 = new ModelRenderer(this, 30, 0);
		tentacle4.addBox(0F, 0F, 0F, 1, 5, 1);
		tentacle4.setRotationPoint(0F, 0F, -1F);
		tentacle4.setTextureSize(128, 64);
		tentacle4.mirror = true;
		setRotation(tentacle4, 0F, 0F, 0F);
		tbase4.addChild(tentacle4);
		tentacle5 = new ModelRenderer(this, 30, 0);
		tentacle5.addBox(0F, 0F, 0F, 1, 5, 1);
		tentacle5.setRotationPoint(0F, 0F, -1F);
		tentacle5.setTextureSize(128, 64);
		tentacle5.mirror = true;
		setRotation(tentacle5, 0F, 0F, 0F);
		tbase5.addChild(tentacle5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		leftshoulder.render(f5);
		leftarm1.render(f5);
		rightshoulder.render(f5);
		rightarm1.render(f5);
		body.render(f5);
		core.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
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

		tentacle1.offsetX = tentacle1.offsetY = tentacle1.offsetZ = 0.0F;
		float f6 = 0.01F * (entity.getEntityId() % 10);
		tentacle1.rotateAngleX = MathHelper.sin(entity.ticksExisted * f6) * 4.5F * (float)Math.PI / 180.0F;
		tentacle1.rotateAngleY = 0.0F;
		tentacle1.rotateAngleZ = MathHelper.cos(entity.ticksExisted * f6) * 2.5F * (float)Math.PI / 180.0F;
		float f7 = 0.02F * (entity.getEntityId() % 10);
		tentacle2.offsetX = tentacle2.offsetY = tentacle2.offsetZ = 0.0F;
		tentacle2.rotateAngleX = MathHelper.sin(entity.ticksExisted * f7) * 4.5F * (float)Math.PI / 180.0F;
		tentacle2.rotateAngleY = 0.0F;
		tentacle2.rotateAngleZ = MathHelper.cos(entity.ticksExisted * f7) * 2.5F * (float)Math.PI / 180.0F;
		float f8 = 0.03F * (entity.getEntityId() % 10);
		tentacle3.offsetX = tentacle3.offsetY = tentacle3.offsetZ = 0.0F;
		tentacle3.rotateAngleX = MathHelper.sin(entity.ticksExisted * f8) * 4.5F * (float)Math.PI / 180.0F;
		tentacle3.rotateAngleY = 0.0F;
		tentacle3.rotateAngleZ = MathHelper.cos(entity.ticksExisted * f8) * 2.5F * (float)Math.PI / 180.0F;
		float f9 = 0.04F * (entity.getEntityId() % 10);
		tentacle4.offsetX = tentacle4.offsetY = tentacle4.offsetZ = 0.0F;
		tentacle4.rotateAngleX = MathHelper.sin(entity.ticksExisted * f9) * 4.5F * (float)Math.PI / 180.0F;
		tentacle4.rotateAngleY = 0.0F;
		tentacle4.rotateAngleZ = MathHelper.cos(entity.ticksExisted * f9) * 2.5F * (float)Math.PI / 180.0F;
		float f10 = 0.04F * (entity.getEntityId() % 10);
		tentacle5.offsetX = tentacle5.offsetY = tentacle5.offsetZ = 0.0F;
		tentacle5.rotateAngleX = MathHelper.sin(entity.ticksExisted * f10) * 4.5F * (float)Math.PI / 180.0F;
		tentacle5.rotateAngleY = 0.0F;
		tentacle5.rotateAngleZ = MathHelper.cos(entity.ticksExisted * f10) * 2.5F * (float)Math.PI / 180.0F;

		rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;

		rightarm1.rotateAngleZ = 0.0F;
		leftarm1.rotateAngleZ = 0.0F;

		rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		rightleg.rotateAngleY = 0.0F;

		leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leftleg.rotateAngleY = 0.0F;

		leftarm1.rotateAngleX = leftarm1.rotateAngleX * 0.5F - (float)Math.PI / 10F;
		leftarm1.rotateAngleY = 0.0F;

		rightarm1.rotateAngleY = 0.0F;

		body.rotateAngleY = 0.0F;

		if (isRiding)
		{
			rightarm1.rotateAngleX += -((float)Math.PI / 5F);
			leftarm1.rotateAngleX += -((float)Math.PI / 5F);

			leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
			rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);

			leftleg.rotateAngleY = (float)Math.PI / 10F;
			rightleg.rotateAngleY = -((float)Math.PI / 10F);
		}

		if (swingProgress > 0.0F)
		{
			float f11 = swingProgress;
			body.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;

			rightarm1.rotateAngleY += body.rotateAngleY;
			leftarm1.rotateAngleY += body.rotateAngleY;
			leftarm1.rotateAngleX += body.rotateAngleY;
			f11 = 1.0F - swingProgress;
			f11 = f11 * f11;
			f11 = f11 * f11;
			f11 = 1.0F - f11;
			float f12 = MathHelper.sin(f11 * (float)Math.PI);
			float f13 = MathHelper.sin(swingProgress * (float)Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;
			leftarm1.rotateAngleX = (float)(leftarm1.rotateAngleX - (f12 * 1.2D + f13));
			leftarm1.rotateAngleY += body.rotateAngleY * 2.0F;
			leftarm1.rotateAngleZ += MathHelper.sin(swingProgress * (float)Math.PI) * -0.4F;
		}
	}

}
