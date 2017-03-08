package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianBoots extends Item {

    public ItemObsidianBoots()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANBOOTS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANBOOTS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}