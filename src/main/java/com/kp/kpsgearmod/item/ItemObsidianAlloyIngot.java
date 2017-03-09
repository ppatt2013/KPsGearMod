package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

public class ItemObsidianAlloyIngot extends Item {

    public ItemObsidianAlloyIngot()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANALLOYINGOT.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANALLOYINGOT.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
