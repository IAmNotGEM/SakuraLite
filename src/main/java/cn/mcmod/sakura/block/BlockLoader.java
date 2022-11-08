package cn.mcmod.sakura.block;

import cn.mcmod.sakura.CommonProxy;
import cn.mcmod.sakura.SakuraMain;
import cn.mcmod.sakura.block.slab.BlockBambooSlab;
import cn.mcmod.sakura.block.tree.*;
import cn.mcmod_mmf.mmlib.register.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {

    public static Block BAMBOO = new BlockPlantBamboo();
    public static BlockBambooShoot BAMBOOSHOOT = new BlockBambooShoot();
    public static Block BAMBOO_BLOCK = new BlockBambooBlock(Material.WOOD).setHardness(1.6F).setResistance(6.0F);
    public static Block BAMBOO_CHARCOAL_BLOCK = new BlockBambooBlock(Material.WOOD).setHardness(1F).setResistance(5F);
	public static Block SAKURA_LOG = (Block)new BlockMapleLog();
    public static Block SAKURA_PLANK = new BlockSakuraPlank(Material.WOOD);
	public static Block SAKURA_PLANK_STAIR = new BlockStairBasic(SAKURA_PLANK.getDefaultState());
	public static Block SAKURA_PLANK_SLAB = new BlockBambooSlab(Material.WOOD);
	public static Block SAKURA_LEAVES = new BlockSakuraLeave();
	public static Block SAKURA_SAPLING = new BlockSakuraSapling();
	private static final BlockLoader instance = new BlockLoader();
	public void registerBlock() {
        register(BAMBOO, new ItemBlock(BAMBOO), "bamboo");
        register(BAMBOOSHOOT, new ItemBlock(BAMBOOSHOOT), "bamboo_shoot");
        register(BAMBOO_BLOCK, new ItemBlock(BAMBOO_BLOCK), "bamboo_block");
        register(BAMBOO_CHARCOAL_BLOCK, new ItemBlock(BAMBOO_CHARCOAL_BLOCK), "bamboo_charcoal_block");
        register(SAKURA_LEAVES, new ItemBlock(SAKURA_LEAVES), "sakuraleaves");
		register(SAKURA_SAPLING, new ItemBlock(SAKURA_SAPLING), "sakura_sapling");
		register(SAKURA_LOG, new ItemBlock(SAKURA_LOG), "sakura_log");
        register(SAKURA_PLANK, new ItemBlock(SAKURA_PLANK), "plank_sakura");
		register(SAKURA_PLANK_STAIR, (Item)new ItemBlock(SAKURA_PLANK_STAIR), "stairs_plank_sakura");
		register(SAKURA_PLANK_SLAB, (Item)new ItemBlock(SAKURA_PLANK_SLAB), "slab_plank_sakura");

		Blocks.FIRE.setFireInfo(SAKURA_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(BAMBOO_BLOCK, 5, 5);
		Blocks.FIRE.setFireInfo(BAMBOO, 5, 20);
		Blocks.FIRE.setFireInfo(SAKURA_LEAVES, 30, 60);
	}
	private BlockLoader() {
// singleton
    }

	private void register(Block block, Item itemBlock, String string) {
		block.setCreativeTab(CommonProxy.tab);
		BlockRegister.getInstance().register(SakuraMain.MODID, block, itemBlock, string);
	}

	@SideOnly(Side.CLIENT)
	public void registerRenders() {
//		please register blocks' renders in THIS void!
		registerRender(BAMBOO_CHARCOAL_BLOCK);
		registerRender(BAMBOO);
		registerRender(BAMBOOSHOOT);
        registerRender(BAMBOO_BLOCK);
		registerRender(SAKURA_LEAVES);
		registerRender(SAKURA_LOG);
        registerRender(SAKURA_PLANK);
		registerRender(SAKURA_PLANK_STAIR);
		registerRender(SAKURA_PLANK_SLAB);
		registerRender(SAKURA_SAPLING);
	}

	@SideOnly(Side.CLIENT)
	public void registerRender(Block block) {
		BlockRegister.getInstance().registerRender(block);
	}

	public static BlockLoader getInstance() {
		return instance;
	}
}
