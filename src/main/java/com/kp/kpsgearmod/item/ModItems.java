package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item unrefinedobsidiandust;

    public static void init()
    {
        unrefinedobsidiandust = new ItemUnrefinedObsidianDust();
        register();
    }

    public static void register()
    {
        GameRegistry.register(unrefinedobsidiandust);
    }

    public static void registerRenders()
    {
        registerRender(unrefinedobsidiandust);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
