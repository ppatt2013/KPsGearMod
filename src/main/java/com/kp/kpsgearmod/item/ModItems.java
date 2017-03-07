package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item unrefinedobsidiandustItem;

    public static void preInit() {

        unrefinedobsidiandustItem = new ItemUnrefinedObsidianDustItem("unrefinedobsidiandust");

        registerItems();
    }

    public static void registerItems(){
        GameRegistry.register(unrefinedobsidiandustItem, new ResourceLocation(KPsGearMod.MODID, "unrefinedobsidiandust"));
    }

    public static void registerRenders() {

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(KPsGearMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
