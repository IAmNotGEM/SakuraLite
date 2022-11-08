package cn.mcmod.sakura;

import cn.mcmod.sakura.block.BlockLoader;
import cn.mcmod.sakura.client.SakuraParticleType;
import cn.mcmod.sakura.event.SakuraEventLoader;
import cn.mcmod.sakura.item.ItemLoader;
import cn.mcmod.sakura.util.SakuraRecipeRegister;
import cn.mcmod.sakura.world.gen.WorldGenLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@EventBusSubscriber
public class CommonProxy {
    public static CreativeTabs tab = new CreativeTabsSakura();

    public void preInit(FMLPreInitializationEvent event) {
        BlockLoader.getInstance().registerBlock();
        ItemLoader.getInstance().registerItem();
        SakuraOreDictLoader.getInstance().registerOre();
    }

    public void init(FMLInitializationEvent event) {
    	MinecraftForge.TERRAIN_GEN_BUS.register(WorldGenLoader.getInstance());
    	WorldGenLoader.getInstance().WorldGenRegister();
        SakuraRecipeRegister.getInstance().Init();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void spawnParticle(SakuraParticleType particleType, double x, double y, double z, double velX, double velY, double velZ) {

    }
}
