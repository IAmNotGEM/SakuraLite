package cn.mcmod.sakura.util;

import cn.mcmod.sakura.block.BlockLoader;
import cn.mcmod.sakura.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class SakuraRecipeRegister {
	private static final SakuraRecipeRegister instance = new SakuraRecipeRegister();
	private SakuraRecipeRegister() {
		
	}
	public static SakuraRecipeRegister getInstance() {
		return instance;
	}
	
	public void Init() {
		furnaceRegister();
	}
	
    public void furnaceRegister() {
		FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlockLoader.SAKURA_LOG, 1), new ItemStack(Items.COAL, 1, 1), 0.1F);
		FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlockLoader.BAMBOO_BLOCK, 1), new ItemStack(BlockLoader.BAMBOO_CHARCOAL_BLOCK), 0.1F);
		FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlockLoader.BAMBOO, 1), new ItemStack(ItemLoader.MATERIAL, 1, 0), 0.1F);
	}
}
