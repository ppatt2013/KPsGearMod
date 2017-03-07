package com.kp.kpsgearmod;

import com.kp.kpsgearmod.item.ModItems;
import com.kp.kpsgearmod.proxy.CommonProxy;
import com.kp.kpsgearmod.tab.CreativeTabKPsGearMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KPsGearMod.MODID, version = KPsGearMod.VERSION, name = KPsGearMod.NAME)
public class KPsGearMod {
    public static final String MODID = "kpsgearmod";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "KPs Gear Mod";

    @SidedProxy(clientSide = "com.kp.kpsgearmod.proxy.ClientProxy", serverSide = "com.kp.kpsgearmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static KPsGearMod instance;

    public static CreativeTabKPsGearMod tabKPsGearMod;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabKPsGearMod = new CreativeTabKPsGearMod(CreativeTabs.getNextID(), "tab_kpsgearmod");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}

