package cn.mcmod.sakura.item;

import cn.mcmod.sakura.CommonProxy;
import cn.mcmod.sakura.SakuraMain;
import cn.mcmod_mmf.mmlib.item.ItemBase;
import cn.mcmod_mmf.mmlib.register.ItemRegister;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    public static ItemBase MATERIAL = new ItemBase(SakuraMain.MODID,"materials", 64, new String[]{
            "bamboo_charcoal"
    });
    private static final ItemLoader INSTANCE = new ItemLoader();

    private ItemLoader() {}
    
    public void registerItem() {
        register(MATERIAL);
	}

    @SideOnly(Side.CLIENT)
    public void registerRenders() {
        ItemRegister.getInstance().registerRender(MATERIAL);
    }

    private void register(Item item) {
        item.setCreativeTab(CommonProxy.tab);
        ItemRegister.getInstance().register(SakuraMain.MODID, item);
    }

	public static ItemLoader getInstance() {
        return INSTANCE;
	}
}
