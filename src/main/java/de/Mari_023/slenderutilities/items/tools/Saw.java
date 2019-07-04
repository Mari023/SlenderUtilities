package de.Mari_023.slenderutilities.items.tools;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.Item;

public class Saw extends Item implements IHasModel {

	public Saw() {
		super();
		setUnlocalizedName("saw");
		setRegistryName("saw");
        setMaxStackSize(1);
        setMaxDamage(288);
		setCreativeTab(ModItems.tabslenderutilities);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
