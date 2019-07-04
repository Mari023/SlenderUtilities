package de.Mari_023.slenderutilities.items;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.Item;

public class Soap extends Item implements IHasModel{

	public Soap() {
		setUnlocalizedName("soap");
		setRegistryName("soap");
        setMaxDamage(16);
		setCreativeTab(ModItems.tabslenderutilities);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
