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
package com.shinoow.abyssalcraft.common.world.biome;

import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.lib.ACClientVars;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeAbyssalPlateau extends BiomeAbyssalWastelandBase {

	public BiomeAbyssalPlateau(BiomeProperties properties) {
		super(properties);
		topBlock = ACBlocks.coralium_stone.getDefaultState();
		fillerBlock = ACBlocks.coralium_stone.getDefaultState();
		barren = true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return ACClientVars.getAbyssalPlateauSkyColor();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return ACClientVars.getAbyssalPlateauGrassColor();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return ACClientVars.getAbyssalPlateauFoliageColor();
	}
}
