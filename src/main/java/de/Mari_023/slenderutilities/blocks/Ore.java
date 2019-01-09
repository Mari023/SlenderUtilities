package de.Mari_023.slenderutilities.blocks;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModBlocks;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Ore extends Block implements IHasModel {

	public Ore(String name) {
		super(Material.ROCK);
		setUnlocalizedName(name+"_ore");
		setRegistryName(name+"_ore");
		setCreativeTab(ModItems.tabslenderutilities);
		
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}