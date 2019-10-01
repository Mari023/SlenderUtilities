package de.Mari_023.slenderutilities.init;

import java.util.ArrayList;
import java.util.List;

import de.Mari_023.slenderutilities.items.ItemBark;
import de.Mari_023.slenderutilities.items.ItemBase;
import de.Mari_023.slenderutilities.items.ItemMetal;
import de.Mari_023.slenderutilities.items.EarlyPearl;
import de.Mari_023.slenderutilities.items.HMB288;
import de.Mari_023.slenderutilities.items.Soap;
import de.Mari_023.slenderutilities.items.WeavingSticks;
import de.Mari_023.slenderutilities.items.tools.Chisel;
import de.Mari_023.slenderutilities.items.tools.Saw;
import de.Mari_023.slenderutilities.items.tools.ToolPickaxe;
import de.Mari_023.slenderutilities.items.tools.ToolSpade;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final CreativeTabs tabslenderutilities = (new CreativeTabs("slenderutilities") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(XHADIUPALM);
		}
		
	});
	
	
	//Materials
	public static final ToolMaterial MATERIAL_FLINTBONE = EnumHelper.addToolMaterial("material_flintbone", 1, 128, 10, 0, 0);
	public static final ToolMaterial MATERIAL_TROWEL = EnumHelper.addToolMaterial("material_trowel", 1, 16, 1, 0, 0);
	public static final ToolMaterial MATERIAL_SAW = EnumHelper.addToolMaterial("material_saw", 0, 288, 1, 0, 0);
	
	//Items
	public static final Item SAW = new Saw();
	public static final Item CHISEL = new Chisel();
	
	public static final Item MECHANICALCONNECTOR = new ItemBase("mechanicalconnector");
	public static final Item WOVEN_STRING = new ItemBase("stringwoven");
	public static final Item YARN = new ItemBase("yarn");
	public static final Item CLOTH = new ItemBase("cloth");
	public static final Item STICKY_TWINE = new ItemBase("sticky_twine");
	public static final Item STONE_CHISEL_HEAD = new ItemBase("stone_chisel_head");
	public static final Item BINDING_STICKY_TWINE = new ItemBase("binding_sticky_twine");
	public static final Item BINDING_YARN = new ItemBase("binding_yarn");
	
	public static final Item CERTUSDIE = new ItemBase("certus_die");

	public static final Item WET_PAPER = new ItemBase("paper_wet");
	public static final Item CARDBORD_SHEET = new ItemBase("cardboard_sheet");
	public static final Item POTASH = new ItemBase("potash");
	public static final Item ASH = new ItemBase("ash");
	public static final Item TALLOW = new ItemBase("tallow");
	public static final Item GOO = new ItemBase("goo");
	public static final Item STAMPED_POTATO = new ItemBase("stamped_potato");
	public static final Item STARCH = new ItemBase("starch");
	public static final Item SOAP = new Soap();
	public static final Item WEAVING_STICKS = new WeavingSticks();
	public static final Item GLUEBOTTLE = new ItemBase("glue_bottle");
	public static final Item UNFIREDCLAYBRICK = new ItemBase("unfired_clay_brick");
	
	
	
	
	//public static final Item INGOTSIMPLE = new ItemBase("ingotsimple");
	//public static final Item INGOTMEDIOCORE = new ItemBase("ingotmediocore");
	//public static final Item INGOTCOMPLEX = new ItemBase("ingotcomplex");
	public static final Item INGOTCREATIVE = new ItemBase("ingotcreative");
	
	
	//Tools
	public static final ItemSpade TROWEL = new ToolSpade("trowel", MATERIAL_TROWEL);
	public static final ItemPickaxe BoneBonePickaxe = new ToolPickaxe("bone_pickaxe", MATERIAL_FLINTBONE);
	public static final ItemPickaxe FlintWoodPickaxe = new ToolPickaxe("flint-wood_pickaxe", MATERIAL_FLINTBONE);
	public static final ItemPickaxe BoneWoodPickaxe = new ToolPickaxe("bone-wood_pickaxe", MATERIAL_FLINTBONE);
	public static final ItemPickaxe FlintBonePickaxe = new ToolPickaxe("flint-bone_pickaxe", MATERIAL_FLINTBONE);
	
	
	
	
	//Pictures & other VERRY important things
	public static final Item XHADIUPALM = new ItemBase("xhadiupalm");
	public static final Item MARI_023 = new ItemBase("mari_023");
	public static final Item SCHOCKOCRAFT = new ItemBase("schockocraft");
	public static final Item BLACKDEMONFIRE = new ItemBase("blackdemonfire");
	public static final Item PHILLIP = new ItemBase("phillip");
	public static final Item EARLYPEARL = new EarlyPearl();
	
	
	public static final String[] Metals = new String[] {"copper", "tin", "aluminium", "lead", "iron", "gold", "nickel", "shiny", "zinc", "tungsten", "silver", "steel", /*alloys*/"bronze", "brass", "constantan", "electrum"};
	public static final String[] Types = new String[] {"crude", "casted", "industrial", "refined"};
	public static final String[] Itemtypes = new String[] {"ingot", "nugget"};
	
	public static final String[] Woodtypes = new String[] {"oak", "spruce"};
	
	
	public static List<Item> getItems() {
		/*for (int i1 = 0; i1 < Metals.length; i1++) {
			for (int i2 = 0; i2 < Types.length; i2++) {
				for (int i3 = 0; i3 < Itemtypes.length; i3++) {
					ITEMS.add(new ItemMetal(Types[i2]+"_"+Metals[i1]+"_"+Itemtypes[i3]));
				}
			}
			if(i1<10) {
				ITEMS.add(new ItemMetal(Metals[i1]+"_ore_dust"));
			}
			ITEMS.add(new ItemMetal(Metals[i1]+"_dust"));
			ITEMS.add(new ItemMetal("refined_"+Metals[i1]+"_dust"));
			
			ITEMS.add(new ItemMetal("handforged_"+Metals[i1]+"_plate"));
			ITEMS.add(new ItemMetal("casted_"+Metals[i1]+"_plate"));
			ITEMS.add(new ItemMetal("industrial_"+Metals[i1]+"_plate"));
			
			ITEMS.add(new ItemMetal("casted_"+Metals[i1]+"_gear"));
			ITEMS.add(new ItemMetal("industrial_"+Metals[i1]+"_gear"));
		}
		
		ITEMS.add(new ItemMetal("bronze_saw"));
		ITEMS.add(new ItemMetal("iron_saw"));
		ITEMS.add(new ItemMetal("steel_saw"));
		
		//bark
		for(int i = 0; i < Woodtypes.length; i++) {
			ITEMS.add(new ItemBark(Woodtypes[i]));
		}
		*/
		return ITEMS;
	}
}
