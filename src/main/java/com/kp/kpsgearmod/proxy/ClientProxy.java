package com.kp.kpsgearmod.proxy;

import com.kp.kpsgearmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements ICommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
