package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

public class ItemRefinedObsidian extends Item {

    public ItemRefinedObsidian()
    {
        setUnlocalizedName(Reference.KPsGearModItems.REFINEDOBSIDIAN.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.REFINEDOBSIDIAN.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
