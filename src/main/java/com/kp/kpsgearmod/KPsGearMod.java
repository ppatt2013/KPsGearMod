package com.kp.kpsgearmod;

import com.kp.kpsgearmod.item.ModItems;
import com.kp.kpsgearmod.proxy.ICommonProxy;
import com.kp.kpsgearmod.tab.CreativeTabKPsGearMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class KPsGearMod
{
    @Mod.Instance
    public static KPsGearMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static ICommonProxy proxy;

    public static CreativeTabKPsGearMod tabKPsGearMod;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabKPsGearMod = new CreativeTabKPsGearMod(CreativeTabs.getNextID());
        ModItems.init();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.addRecipes();
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}