package de.Mari_023.slenderutilities.util.handlers;

import de.Mari_023.slenderutilities.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class DeathEventHandler {

	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void Respawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event)
	{	
		event.player.addItemStackToInventory(new ItemStack(ModItems.XHADIUPALM));
	}
}
