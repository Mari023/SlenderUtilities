package de.Mari_023.slenderutilities.init;

import java.util.ArrayList;
import java.util.List;

import de.Mari_023.slenderutilities.blocks.BlockBase;
import de.Mari_023.slenderutilities.blocks.BlockMetal;
import de.Mari_023.slenderutilities.blocks.Ore;
import de.Mari_023.slenderutilities.blocks.PureBlock;
import de.Mari_023.slenderutilities.items.ItemBase;
import de.Mari_023.slenderutilities.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Pure Blöcke
	public static final Block PURE_CERTUS = new PureBlock("pure_certusquartz_block", Material.ROCK);
	public static final Block PURE_FLUIX = new PureBlock("pure_fluix_block", Material.ROCK);
	public static final Block PURE_QUARTZ = new PureBlock("pure_netherquartz_block", Material.ROCK);
	
	public static final Block COMPANIONCUBE = new BlockBase("companion_cube", Material.IRON);
	
	
	public static final String[] Metals = ModItems.Metals;
	public static final String[] Types = ModItems.Types;
	
	public static List<Block> getBlocks() {
		for (int i1 = 0; i1 < Metals.length; i1++) {
			for (int i2 = 0; i2 < Types.length; i2++) {
					BLOCKS.add(new BlockMetal(Types[i2]+"_"+Metals[i1]+"_block", Material.IRON));
			}
			if(i1<11) {
				BLOCKS.add(new Ore(Metals[i1]));
			}
		}
		return BLOCKS;
	}
}