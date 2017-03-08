package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianHoe extends ItemHoe
{

    public ItemObsidianHoe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANHOE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANHOE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}