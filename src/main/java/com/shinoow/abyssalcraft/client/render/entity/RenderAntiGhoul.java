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

//import com.shinoow.abyssalcraft.client.model.entity.ModelGhoul;
//import com.shinoow.abyssalcraft.client.render.entity.layers.LayerGhoulArmor;
//import com.shinoow.abyssalcraft.client.render.entity.layers.LayerGhoulHeldItem;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiGhoul;

//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.entity.RenderManager;
//import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;

//@SideOnly(Side.CLIENT)
/*public class RenderAntiGhoul extends RenderGhoulBase<EntityAntiGhoul> {

	private static final ResourceLocation ghoulResource = new ResourceLocation("abyssalcraft:textures/model/anti/depths_ghoul.png");

	public RenderAntiGhoul(RenderManager manager)
	{
		this(manager, new ModelGhoul());
	}

	public RenderAntiGhoul(RenderManager manager, ModelGhoul model){
		super(manager, model, 0.6F);
		addLayer(new LayerGhoulHeldItem(this));
		addLayer(new LayerGhoulArmor(this));
		addLayer(new LayerCustomHead(model.head));
	}

	@Override
	protected void preRenderCallback(EntityAntiGhoul par1EntityLivingBase, float par2)
	{
		GlStateManager.scale(0.7F, 0.7F, 0.7F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAntiGhoul entity) {

		return ghoulResource;
	}
}*/
