package com.kp.kpsgearmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item obsidianingot;
    public static Item obsidianalloy;
    public static Item diamonddust;
    public static Item moltenblaze;
    public static Item molteningot;
    public static Item obsidianchestplate;
    public static Item obsidianhelmet;
    public static Item obsidianleggings;
    public static Item obsidianboots;
    public static Item obsidiansword;
    public static Item obsidianpickaxe;
    public static Item obsidianshovel;
    public static Item obsidianaxe;
    public static Item obsidianhoe;
    public static Item moltenchestplate;
    public static Item moltenhelmet;
    public static Item moltenleggings;
    public static Item moltenboots;

    public static void init()
    {
        obsidianingot = new ItemObsidianIngot();
        obsidianalloy = new ItemObsidianAlloy();
        diamonddust = new ItemDiamondDust();
        moltenblaze = new ItemMoltenBlaze();
        molteningot = new ItemMoltenIngot();
        obsidianchestplate = new ItemObsidianChestplate();
        obsidianhelmet = new ItemObsidianHelmet();
        obsidianleggings = new ItemObsidianLeggings();
        obsidianboots = new ItemObsidianBoots();
        obsidiansword = new ItemObsidianSword();
        obsidianpickaxe = new ItemObsidianPickaxe();
        obsidianshovel = new ItemObsidianShovel();
        obsidianaxe = new ItemObsidianAxe();
        obsidianhoe = new ItemObsidianHoe();
        moltenchestplate = new ItemMoltenChestplate();
        moltenhelmet = new ItemMoltenHelmet();
        moltenleggings = new ItemMoltenLeggings();
        moltenboots = new ItemMoltenBoots();
        register();
    }

    public static void register()
    {
        GameRegistry.register(obsidianingot);
        GameRegistry.register(obsidianalloy);
        GameRegistry.register(diamonddust);
        GameRegistry.register(moltenblaze);
        GameRegistry.register(molteningot);
        GameRegistry.register(obsidianchestplate);
        GameRegistry.register(obsidianhelmet);
        GameRegistry.register(obsidianleggings);
        GameRegistry.register(obsidianboots);
        GameRegistry.register(obsidiansword);
        GameRegistry.register(obsidianpickaxe);
        GameRegistry.register(obsidianshovel);
        GameRegistry.register(obsidianaxe);
        GameRegistry.register(obsidianhoe);
        GameRegistry.register(moltenchestplate);
        GameRegistry.register(moltenhelmet);
        GameRegistry.register(moltenleggings);
        GameRegistry.register(moltenboots);
    }

    public static void registerRenders()
    {
        registerRender(obsidianingot);
        registerRender(obsidianalloy);
        registerRender(diamonddust);
        registerRender(moltenblaze);
        registerRender(molteningot);
        registerRender(obsidianchestplate);
        registerRender(obsidianhelmet);
        registerRender(obsidianleggings);
        registerRender(obsidianboots);
        registerRender(obsidiansword);
        registerRender(obsidianpickaxe);
        registerRender(obsidianshovel);
        registerRender(obsidianaxe);
        registerRender(obsidianhoe);
        registerRender(moltenchestplate);
        registerRender(moltenhelmet);
        registerRender(moltenleggings);
        registerRender(moltenboots);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}