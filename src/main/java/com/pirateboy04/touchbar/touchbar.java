package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = touchBar.MODID, name = touchBar.NAME, version = touchBar.VERSION)
public class touchbar
{
    public static final String MODID = "touchbar";
    public static final String NAME = "Touch Bar";
    public static final String VERSION = "0.0.1";
    public static final boolean clientSideOnly = true
    public static final String acceptedMinecraftVersions = "1.12.2"
    public static final String updateJSON = "https://github.com/Pirateboy04/Touch-Bar-for-Minecraft/blob/master/update.json"


    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
