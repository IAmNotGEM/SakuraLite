package cn.mcmod.sakura;

import cn.mcmod.sakura.block.BlockLoader;
import cn.mcmod.sakura.item.ItemLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SakuraOreDictLoader {
	private static final SakuraOreDictLoader instance = new SakuraOreDictLoader();
	private SakuraOreDictLoader() {
	}
	public void registerOre() {
		OreDictionary.registerOre("cropBambooshoot", new ItemStack(BlockLoader.BAMBOOSHOOT));
		OreDictionary.registerOre("bamboo", new ItemStack(BlockLoader.BAMBOO));
		OreDictionary.registerOre("bambooCharcoal", new ItemStack(ItemLoader.MATERIAL,1,0));
		OreDictionary.registerOre("logWood", new ItemStack(Item.getItemFromBlock(BlockLoader.SAKURA_LOG), 1));
        OreDictionary.registerOre("plankWood", new ItemStack(BlockLoader.SAKURA_PLANK, 1));
        OreDictionary.registerOre("stairWood", new ItemStack(BlockLoader.SAKURA_PLANK_STAIR, 1));
        OreDictionary.registerOre("logWood", new ItemStack(BlockLoader.SAKURA_LOG, 1));
        OreDictionary.registerOre("slabWood", new ItemStack(BlockLoader.SAKURA_PLANK_SLAB, 1));
        OreDictionary.registerOre("sakuraLeaves", new ItemStack(BlockLoader.SAKURA_LEAVES, 1));
	}
	public static SakuraOreDictLoader getInstance() {
		return instance;
	}
	

}
