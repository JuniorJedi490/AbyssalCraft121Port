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
package com.shinoow.abyssalcraft.client.gui;

import java.util.ArrayList;
import java.util.List;

//import org.lwjgl.input.Keyboard;

import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.api.item.ACItems;
//import com.shinoow.abyssalcraft.client.gui.necronomicon.buttons.ButtonNextPage;
import com.shinoow.abyssalcraft.common.world.data.NecromancyWorldSavedData;

import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.GuiButton;
//import net.minecraft.client.gui.GuiScreen;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.GlStateManager.DestFactor;
//import net.minecraft.client.renderer.GlStateManager.SourceFactor;
//import net.minecraft.client.renderer.RenderHelper;
//import net.minecraft.client.renderer.RenderItem;
//import net.minecraft.client.resources.I18n;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Tuple;
//import net.minecraftforge.oredict.OreDictionary;

/*public class GuiFaceBook extends GuiScreen {

	private static final ResourceLocation bookGuiTextures = new ResourceLocation("abyssalcraft:textures/gui/face_book.png");

	private List<Tuple<String, Integer>> data = new ArrayList<>();

	protected int currTurnup;
	private ButtonNextPage buttonNextPage, buttonPreviousPage;

	public final int guiWidth = 176;
	public final int guiHeight = 160;

	public GuiFaceBook() {
		if(Minecraft.getMinecraft().world != null)
			data = NecromancyWorldSavedData.get(Minecraft.getMinecraft().world).getClientData();
	}

	@Override
	public void initGui()
	{
		Keyboard.enableRepeatEvents(true);
		buttonList.clear();

		int i = (width - guiWidth) / 2;
		byte b0 = 2;
		buttonList.add(buttonNextPage = new ButtonNextPage(1, i + 132, b0 + 134, true, false));
		buttonList.add(buttonPreviousPage = new ButtonNextPage(2, i + 20, b0 + 134, false, false));
		updateButtons();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		mc.getTextureManager().bindTexture(bookGuiTextures);
		int k = (width - guiWidth) / 2;
		byte b0 = 2;
		drawTexturedModalRect(k, b0, 0, 0, guiWidth, guiHeight);
		super.drawScreen(mouseX, mouseY, partialTicks);

		fontRenderer.drawString(I18n.format("gui.abyssalcraft.facebook.name"), k + 20, b0 + 16, 0);
		String s = I18n.format("gui.abyssalcraft.facebook.crystalsize");
		fontRenderer.drawString(s, k - fontRenderer.getStringWidth(s) + guiWidth - 22, b0 + 16, 0);

		int page = 5 * currTurnup;
		int max = page + 5 > data.size() ? data.size() : page + 5;

		for(int i = page; i < max; i++) {
			Tuple<String, Integer> dat = data.get(i);
			int len = dat.getFirst().length();
			int yOffset1 = len > 30 ? 14 : 32;
			int yOffset2 = len > 30 ? 26 : 20;
			fontRenderer.drawSplitString(dat.getFirst(), k + 20, b0 + yOffset1 + yOffset2 * (i - page), 90, 0);
			int y = b0 + 26 + 20 * (i - page);
			renderItem(k - 16  + guiWidth - 45, y, getStackForSize(dat.getSecond()), mouseX, mouseY);
		}
	}

	private ItemStack getStackForSize(int size) {
		switch(size) {
		case 0:
			return new ItemStack(ACItems.crystal_shard_iron);
		case 1:
			return new ItemStack(ACItems.crystal_iron);
		case 2:
			return new ItemStack(ACBlocks.iron_crystal_cluster);
		default:
			return new ItemStack(ACItems.crystal_shard_iron);
		}
	}

	@Override
	public void onGuiClosed()
	{
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.visible) {
			if(button.id == buttonNextPage.id)
				++currTurnup;
			else if(button.id == buttonPreviousPage.id)
				--currTurnup;
			updateButtons();
		}
	}

	private void updateButtons()
	{
		if(!data.isEmpty()) {
			if(currTurnup == 0)
				buttonPreviousPage.visible = false;
			else
				buttonPreviousPage.visible = true;
			if(data.size() > 5 && currTurnup * 5 + 5 < data.size())
				buttonNextPage.visible = true;
			else
				buttonNextPage.visible = false;
		} else {
			buttonPreviousPage.visible = false;
			buttonNextPage.visible = false;
		}
	}

	public void renderItem(int xPos, int yPos, ItemStack stack, int mx, int my)
	{
		if(stack == null || stack.isEmpty()) return;

		if(stack.getItemDamage() == OreDictionary.WILDCARD_VALUE)
			stack.setItemDamage(0);

		RenderItem render = mc.getRenderItem();
		//		if(mx > xPos && mx < xPos+16 && my > yPos && my < yPos+16)
		//			tooltipStack = stack;

		GlStateManager.pushMatrix();
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.enableRescaleNormal();
		GlStateManager.enableDepth();
		render.renderItemAndEffectIntoGUI(stack, xPos, yPos);
		render.renderItemOverlayIntoGUI(mc.fontRenderer, stack, xPos, yPos, null);
		RenderHelper.disableStandardItemLighting();
		GlStateManager.popMatrix();

		GlStateManager.disableLighting();
	}
}*/
