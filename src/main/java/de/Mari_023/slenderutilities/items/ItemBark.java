package de.Mari_023.slenderutilities.items;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBark extends Item implements IHasModel {

	public ItemBark(String type) {
		setUnlocalizedName(type+"_bark");
		setRegistryName(type+"_bark");
		setCreativeTab(ModItems.tabslenderutilities);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}