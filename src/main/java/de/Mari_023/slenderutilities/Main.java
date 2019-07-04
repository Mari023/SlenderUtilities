package de.Mari_023.slenderutilities;

import de.Mari_023.slenderutilities.proxy.CommonProxy;
import de.Mari_023.slenderutilities.util.Reference;
import de.Mari_023.slenderutilities.util.handlers.DeathEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		System.out.println("\n\n\n\n\n\n");
		Lang.main(null);
		System.out.println("\n\n\n\n\n\n");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new DeathEventHandler());
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
	}
}