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


import java.util.Random;

import com.shinoow.abyssalcraft.common.entity.*;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenDrT;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenNoTree;
import com.shinoow.abyssalcraft.lib.ACClientVars;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeMountainDreadlands extends BiomeDreadlandsBase {

	private WorldGenTrees worldGenDreadTrees;

	public BiomeMountainDreadlands(BiomeProperties par1) {
		super(par1);
		worldGenDreadTrees = new WorldGenDrT(false).setMaxHeight(95);
		decorator.treesPerChunk = 3;
	}

	@Override
	public void setMobSpawns(){
		super.setMobSpawns();
		spawnableMonsterList.add(new SpawnListEntry(EntityDreadling.class, 40, 1, 3));
		spawnableMonsterList.add(new SpawnListEntry(EntityDreadguard.class, 20, 1, 2));
		spawnableMonsterList.add(new SpawnListEntry(EntityChagarothFist.class, 25, 1, 2));
		spawnableMonsterList.add(new SpawnListEntry(EntityChagarothSpawn.class, 30, 1, 2));
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random par1Random)
	{
		return par1Random.nextInt(3) == 0 ? new WorldGenNoTree() : par1Random.nextInt(5) == 0 ? worldGenDreadTrees : new WorldGenNoTree();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return ACClientVars.getDreadlandsMountainsSkyColor();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return ACClientVars.getDreadlandsMountainsGrassColor();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return ACClientVars.getDreadlandsMountainsFoliageColor();
	}
}
