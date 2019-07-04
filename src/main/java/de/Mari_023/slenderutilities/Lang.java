package de.Mari_023.slenderutilities;

import de.Mari_023.slenderutilities.init.ModItems;

public class Lang {
	public static String[] types = {"crude", "casted", "industrial", "refined", "handforged"};
	public static String[] ttypes = {"Crude", "Casted", "Industrial", "Refined", "Handforged"};
	public static String[] ding = {"ingot", "nugget", "gear", "plate"};
	public static String[] dding = {"Ingot", "Nugget", "Gear", "Plate"};

	public static void main(String[] args) {
		System.out.println(create());
	}
	
	public static String create() {
		String a = "";
		for(int m = 0; m < ModItems.Metals.length; m++){
			for(int t = 0; t < types.length; t++){
				for(int d = 0; d < ding.length; d++){
					a = a.concat("item."+types[t]+"_"+ModItems.Metals[m]+"_"+ding[d]+".name="+ttypes[t]+" "+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" "+dding[d]+"\n");
				}
				a = a.concat("tile."+types[t]+"_"+ModItems.Metals[m]+"_block.name="+ttypes[t]+" "+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" Block"+"\n");
			}
			a = a.concat("tile."+ModItems.Metals[m]+"_ore.name="+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" Ore"+"\n");
			a = a.concat("item."+ModItems.Metals[m]+"_ore_dust.name="+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" Oredust"+"\n");
			a = a.concat("item."+ModItems.Metals[m]+"_dust.name="+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" Dust"+"\n");
			a = a.concat("item.refined"+ModItems.Metals[m]+"_dust.name=Refined "+(""+ModItems.Metals[m].charAt(0)).toUpperCase()+ModItems.Metals[m].substring(1)+" Dust"+"\n");
			}
		for(int i = 0; i < ModItems.Woodtypes.length; i++)
			a = a.concat("item."+ModItems.Woodtypes[i]+"_bark.name="+(""+ModItems.Woodtypes[i].charAt(0)).toUpperCase()+ModItems.Woodtypes[i].substring(1)+" Bark\n");
		return a;
	}
}