package de.Mari_023.slenderutilities.items;

import de.Mari_023.slenderutilities.Main;
import de.Mari_023.slenderutilities.init.ModItems;
import de.Mari_023.slenderutilities.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class EarliPearl extends Item implements IHasModel {
    public EarliPearl() {
		setUnlocalizedName("earlipearl");
		setRegistryName("earlipearl");
        this.maxStackSize = 16;
        this.setCreativeTab(ModItems.tabslenderutilities);
		ModItems.ITEMS.add(this);
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        //playerIn.getCooldownTracker().setCooldown(this, 20);

        if (!worldIn.isRemote) {
        	de.Mari_023.slenderutilities.entity.EarliPearl entityenderpearl = new de.Mari_023.slenderutilities.entity.EarliPearl(worldIn, playerIn);
            entityenderpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityenderpearl);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}