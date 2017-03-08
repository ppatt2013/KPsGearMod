package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianPickaxe extends Item {

    public ItemObsidianPickaxe()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANPICKAXE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}