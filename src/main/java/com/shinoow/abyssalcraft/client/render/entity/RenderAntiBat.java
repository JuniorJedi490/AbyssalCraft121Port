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
package com.shinoow.abyssalcraft.client.render.entity;

//import com.shinoow.abyssalcraft.client.model.entity.ModelAntiBat;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiBat;

//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.entity.RenderLiving;
//import net.minecraft.client.renderer.entity.RenderManager;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.math.MathHelper;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;

//@SideOnly(Side.CLIENT)
/*public class RenderAntiBat extends RenderLiving
{
	private static final ResourceLocation batTextures = new ResourceLocation("abyssalcraft:textures/model/anti/bat.png");
	private int renderedBatSize;

	public RenderAntiBat(RenderManager manager)
	{
		super(manager, new ModelAntiBat(), 0.25F);
		renderedBatSize = ((ModelAntiBat)mainModel).getBatSize();
	}

	public void doRender(EntityAntiBat par1EntityBat, double par2, double par4, double par6, float par8, float par9)
	{
		int i = ((ModelAntiBat)mainModel).getBatSize();

		if (i != renderedBatSize)
		{
			renderedBatSize = i;
			mainModel = new ModelAntiBat();
		}

		super.doRender(par1EntityBat, par2, par4, par6, par8, par9);
	}

	protected ResourceLocation getEntityTexture(EntityAntiBat par1EntityBat)
	{
		return batTextures;
	}

	protected void preRenderCallback(EntityAntiBat par1EntityBat, float par2)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}

	protected void renderLivingAt(EntityAntiBat par1EntityBat, double par2, double par4, double par6)
	{
		super.renderLivingAt(par1EntityBat, par2, par4, par6);
	}

	protected void applyRotations(EntityAntiBat par1EntityBat, float par2, float par3, float par4)
	{
		if (!par1EntityBat.getIsBatHanging())
			GlStateManager.translate(0.0F, MathHelper.cos(par2 * 0.3F) * 0.1F, 0.0F);
		else
			GlStateManager.translate(0.0F, -0.1F, 0.0F);

		super.applyRotations(par1EntityBat, par2, par3, par4);
	}

	@Override
	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	{
		this.preRenderCallback((EntityAntiBat)par1EntityLivingBase, par2);
	}

	@Override
	protected void applyRotations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4)
	{
		this.applyRotations((EntityAntiBat)par1EntityLivingBase, par2, par3, par4);
	}

	@Override
	protected void renderLivingAt(EntityLivingBase par1EntityLivingBase, double par2, double par4, double par6)
	{
		this.renderLivingAt((EntityAntiBat)par1EntityLivingBase, par2, par4, par6);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.getEntityTexture((EntityAntiBat)par1Entity);
	}
}*/
