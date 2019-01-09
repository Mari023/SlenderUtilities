package de.Mari_023.slenderutilities.items;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sawblade extends Item implements IHasModel{

	public Sawblade(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
        setMaxDamage(288);
		setCreativeTab(ModItems.tabslenderutilities);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
