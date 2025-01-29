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
package com.shinoow.abyssalcraft.common.blocks.tile;

import com.shinoow.abyssalcraft.common.blocks.BlockTieredEnergyCollector;

import net.minecraft.tileentity.TileEntity;

public class TileEntityTieredEnergyCollector extends TileEntityEnergyCollector {

	@Override
	public int getMaxEnergy() {
		int base = 1000;

		return (int) (base * (1.5 + 0.5 * ((BlockTieredEnergyCollector)getBlockType()).TYPE.getMeta()));
	}

	@Override
	public TileEntity getContainerTile() {

		return this;
	}
}
