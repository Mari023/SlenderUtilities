package de.Mari_023.slenderutilities;

public class Lang {
	public static String[] metals = {"copper", "tin", "aluminium", "lead", "iron", "gold", "nickel", "shiny", "zinc", "tungsten", "steel", "bronze", "brass", "constantan", "electrum"};
	public static String[] mmetals = {"Copper", "Tin", "Aluminium", "Lead", "Iron", "Gold", "Nickel", "Shiny", "Zinc", "Tungsten", "Steel", "Bronze", "Brass", "Constantan", "Electrum"};
	public static String[] types = {"crude_", "casted_", "industrial_", "refined_", "handforged_"};
	public static String[] ttypes = {"Crude ", "Casted ", "Industrial ", "Refined ", "Handforged "};
	public static String[] ding = {"_ingot", "_nugget", "_gear", "_plate", "_dust"};
	public static String[] dding = {" Ingot", " Nugget", " Gear", " Plate", " Dust"};

	public static void main(String[] args) {
		System.out.println(create());
	}
	
	public static String create() {
		String a = "";
		for(int m = 0; m < metals.length; m++){
			for(int t = 0; t < types.length; t++){
				for(int d = 0; d < ding.length; d++){
					a = a.concat("item."+types[t]+metals[m]+ding[d]+".name="+ttypes[t]+mmetals[m]+dding[d]+"\n");
				}
				a = a.concat("tile."+types[t]+metals[m]+"_block.name="+ttypes[t]+mmetals[m]+" Block"+"\n");
			}
			a = a.concat("tile."+metals[m]+"_ore.name="+mmetals[m]+" Ore"+"\n");
			a = a.concat("item."+metals[m]+"_ore_dust.name="+mmetals[m]+" Oredust"+"\n");
		}
		return a;
	}
}