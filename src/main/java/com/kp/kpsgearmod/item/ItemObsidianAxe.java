package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianAxe extends Item {

    public ItemObsidianAxe()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANAXE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANAXE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}