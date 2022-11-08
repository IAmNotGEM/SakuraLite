package cn.mcmod.sakura.world.gen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenLoader {
	private static final WorldGenLoader instance = new WorldGenLoader();
	private WorldGenLoader() {
	}
	public void WorldGenRegister() {
		GameRegistry.registerWorldGenerator(new WorldGenBambooShot(), 1);
	}
	public static WorldGenLoader getInstance() {
		return instance;
	}

}
