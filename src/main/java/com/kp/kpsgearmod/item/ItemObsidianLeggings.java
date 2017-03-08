package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianLeggings extends Item {

    public ItemObsidianLeggings()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANLEGGINGS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANLEGGINGS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}