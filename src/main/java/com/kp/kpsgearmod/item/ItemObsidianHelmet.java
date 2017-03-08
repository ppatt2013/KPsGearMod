package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianHelmet extends Item {

    public ItemObsidianHelmet()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANHELMET.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANHELMET.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}