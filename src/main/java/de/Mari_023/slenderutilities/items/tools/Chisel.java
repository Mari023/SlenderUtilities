package de.Mari_023.slenderutilities.items.tools;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Chisel extends ItemSword implements IHasModel{

	public Chisel() {
		super(EnumHelper.addToolMaterial("material_chisel", 1, 32, 0, -3, 0));
		setUnlocalizedName("stone_chisel");
		setRegistryName("stone_chisel");
		setCreativeTab(ModItems.tabslenderutilities);
		setMaxDamage(0);
		
		ModItems.ITEMS.add(this);
	}
	
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
