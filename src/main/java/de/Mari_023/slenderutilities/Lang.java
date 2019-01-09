package de.Mari_023.slenderutilities;

public class Lang {
	public String[] metals = {"copper", "tin", "aluminium", "lead", "iron", "gold", "nickel", "shiny", "zinc", "thungsten", "steel", "bronze", "brass", "constantan", "electrum"};
	public String[] mmetals = {"Copper", "Tin", "Aluminium", "Lead", "Iron", "Gold", "Nickel", "Shiny", "Zinc", "Thungsten", "Steel", "Bronze", "Brass", "Constantan", "Electrum"};
	public String[] types = {"crude_", "casted_", "industrial_", "refined_", "handforged_"};
	public String[] ttypes = {"Crude ", "Casted ", "Industrial ", "Refined ", "Handforged "};
	public String[] ding = {"_ingot", "_nugget", "_gear", "_plate", "_dust"};
	public String[] dding = {" Ingot", " Nugget", " Gear", " Plate", " Dust"};

	public String create() {
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
			a = a.concat("item."+metals[m]+"_sawblade.name="+mmetals[m]+" Sawblade"+"\n");
		}
		return a;
	}
}