package cn.mcmod.sakura.event;

import cn.mcmod.sakura.block.BlockLoader;
import cn.mcmod.sakura.item.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class SakuraEventLoader {
    @SubscribeEvent
    public static void onFuelRegister(FurnaceFuelBurnTimeEvent event) {
    	if(ItemStack.areItemsEqual(event.getItemStack(), new ItemStack(BlockLoader.BAMBOO)))
    		event.setBurnTime(400);
    	if(ItemStack.areItemsEqual(event.getItemStack(), new ItemStack(ItemLoader.MATERIAL, 1,0)))
    		event.setBurnTime(1600);
    	if(ItemStack.areItemsEqual(event.getItemStack(), new ItemStack(BlockLoader.BAMBOO_CHARCOAL_BLOCK)))
    		event.setBurnTime(8000);
	}
}
