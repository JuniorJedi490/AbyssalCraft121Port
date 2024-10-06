/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2024 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.world.gen.layer;

import com.shinoow.abyssalcraft.api.biome.ACBiomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerHillsDL extends GenLayer
{
	private final GenLayer riverLayer;

	public GenLayerHillsDL(long p_i45479_1_, GenLayer p_i45479_3_, GenLayer p_i45479_4_)
	{
		super(p_i45479_1_);
		parent = p_i45479_3_;
		riverLayer = p_i45479_4_;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or Biome ID's based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
	{
		int[] aint = parent.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
		int[] aint1 = riverLayer.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
		int[] aint2 = IntCache.getIntCache(areaWidth * areaHeight);

		for (int i = 0; i < areaHeight; ++i)
			for (int j = 0; j < areaWidth; ++j)
			{
				initChunkSeed(j + areaX, i + areaY);
				int k = aint[j + 1 + (i + 1) * (areaWidth + 2)];
				int l = aint1[j + 1 + (i + 1) * (areaWidth + 2)];
				boolean flag = (l - 2) % 29 == 0;


				Biome biome = Biome.getBiomeForId(k);
				boolean flag1 = biome != null && biome.isMutation();

				if (k != 0 && l >= 2 && (l - 2) % 29 == 1 && !flag1)
				{
					Biome biome3 = Biome.getMutationForBiome(biome);
					aint2[j + i * areaWidth] = biome3 == null ? k : Biome.getIdForBiome(biome3);
				}
				else if (nextInt(3) != 0 && !flag)
					aint2[j + i * areaWidth] = k;
				else
				{
					Biome biome1 = biome;

					if (biome == ACBiomes.dreadlands_ocean)
						biome1 = ACBiomes.dreadlands;

					int j2 = Biome.getIdForBiome(biome1);

					if (flag && j2 != k)
					{
						Biome biome2 = Biome.getMutationForBiome(biome1);
						j2 = biome2 == null ? k : Biome.getIdForBiome(biome2);
					}

					if (j2 == k)
						aint2[j + i * areaWidth] = k;
					else
					{
						int i2 = 0;

						if (i2 >= 3)
							aint2[j + i * areaWidth] = j2;
						else
							aint2[j + i * areaWidth] = k;
					}
				}
			}

		return aint2;
	}
}
