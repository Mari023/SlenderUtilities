package de.Mari_023.slenderutilities.items.tools;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.tabslenderutilities);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
