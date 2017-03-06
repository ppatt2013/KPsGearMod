package com.kp.kpsgearmod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by Pearson Patterson on 3/6/2017.
 */
@Mod(modid = KPsGearMod.MODID, version = KPsGearMod.VERSION)
public class KPsGearMod
{
    public static final String MODID = "kpsgearmod";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}

