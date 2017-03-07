package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

public class ItemUnrefinedObsidianDust extends Item {

    public ItemUnrefinedObsidianDust()
    {
        setUnlocalizedName(Reference.KPsGearModItems.UNREFINEDOBSIDIANDUST.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.UNREFINEDOBSIDIANDUST.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
