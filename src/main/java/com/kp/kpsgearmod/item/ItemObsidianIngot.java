package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

public class ItemObsidianIngot extends Item {

    public ItemObsidianIngot()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANINGOT.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANINGOT.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
