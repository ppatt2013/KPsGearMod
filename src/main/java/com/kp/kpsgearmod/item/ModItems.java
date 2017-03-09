package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.Materials;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item refinedobsidian;
    public static Item fluxedobsidian;
    public static Item obsidianalloyingot;
    public static Item diamonddust;
    public static Item bottlediamondflux;
    public static Item bottlemoltenblaze;
    public static Item blazediron;
    public static Item blazealloyingot;
    public static Item obsidianchestplate;
    public static Item obsidianhelmet;
    public static Item obsidianleggings;
    public static Item obsidianboots;
    public static Item obsidiansword;
    public static Item obsidianpickaxe;
    public static Item obsidianshovel;
    public static Item obsidianaxe;
    public static Item obsidianhoe;
    public static Item blazechestplate;
    public static Item blazehelmet;
    public static Item blazeleggings;
    public static Item blazeboots;

    public static void init()
    {
        refinedobsidian = new ItemRefinedObsidian();
        fluxedobsidian = new ItemFluxedObsidian();
        diamonddust = new ItemDiamondDust();
        obsidianalloyingot = new ItemObsidianAlloyIngot();
        bottlediamondflux = new ItemBottleDiamondFlux();
        bottlemoltenblaze = new ItemBottleMoltenBlaze();
        blazediron = new ItemBlazedIron();
        blazealloyingot = new ItemBlazeAlloyIngot();
        obsidianchestplate = new ItemObsidianChestplate(Materials.obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST);
        obsidianhelmet = new ItemObsidianHelmet(Materials.obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD);
        obsidianleggings = new ItemObsidianLeggings(Materials.obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS);
        obsidianboots = new ItemObsidianBoots(Materials.obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET);
        obsidiansword = new ItemObsidianSword(Materials.obsidianToolMaterial);
        obsidianpickaxe = new ItemObsidianPickaxe(Materials.obsidianToolMaterial);
        obsidianshovel = new ItemObsidianShovel(Materials.obsidianToolMaterial);
        obsidianaxe = new ItemObsidianAxe(Materials.obsidianToolMaterial);
        obsidianhoe = new ItemObsidianHoe(Materials.obsidianToolMaterial);
        blazechestplate = new ItemBlazeChestplate(Materials.blazeArmorMaterial, 1, EntityEquipmentSlot.CHEST);
        blazehelmet = new ItemBlazeHelmet(Materials.blazeArmorMaterial, 1, EntityEquipmentSlot.HEAD);
        blazeleggings = new ItemBlazeLeggings(Materials.blazeArmorMaterial, 2, EntityEquipmentSlot.LEGS);
        blazeboots = new ItemBlazeBoots(Materials.blazeArmorMaterial, 1, EntityEquipmentSlot.FEET);
        register();
    }

    public static void register()
    {
        GameRegistry.register(refinedobsidian);
        GameRegistry.register(fluxedobsidian);
        GameRegistry.register(diamonddust);
        GameRegistry.register(obsidianalloyingot);
        GameRegistry.register(bottlediamondflux);
        GameRegistry.register(bottlemoltenblaze);
        GameRegistry.register(blazediron);
        GameRegistry.register(blazealloyingot);
        GameRegistry.register(obsidianchestplate);
        GameRegistry.register(obsidianhelmet);
        GameRegistry.register(obsidianleggings);
        GameRegistry.register(obsidianboots);
        GameRegistry.register(obsidiansword);
        GameRegistry.register(obsidianpickaxe);
        GameRegistry.register(obsidianshovel);
        GameRegistry.register(obsidianaxe);
        GameRegistry.register(obsidianhoe);
        GameRegistry.register(blazechestplate);
        GameRegistry.register(blazehelmet);
        GameRegistry.register(blazeleggings);
        GameRegistry.register(blazeboots);
    }

    public static void registerRenders()
    {
        registerRender(refinedobsidian);
        registerRender(fluxedobsidian);
        registerRender(diamonddust);
        registerRender(obsidianalloyingot);
        registerRender(bottlediamondflux);
        registerRender(bottlemoltenblaze);
        registerRender(blazediron);
        registerRender(blazealloyingot);
        registerRender(obsidianchestplate);
        registerRender(obsidianhelmet);
        registerRender(obsidianleggings);
        registerRender(obsidianboots);
        registerRender(obsidiansword);
        registerRender(obsidianpickaxe);
        registerRender(obsidianshovel);
        registerRender(obsidianaxe);
        registerRender(obsidianhoe);
        registerRender(blazechestplate);
        registerRender(blazehelmet);
        registerRender(blazeleggings);
        registerRender(blazeboots);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}