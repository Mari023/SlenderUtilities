package de.Mari_023.slenderutilities.items;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.Item;

public class WeavingSticks extends Item implements IHasModel{

	public WeavingSticks() {
		setUnlocalizedName("weavingsticks");
		setRegistryName("weavingsticks");
        setMaxDamage(32);
		setCreativeTab(ModItems.tabslenderutilities);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
