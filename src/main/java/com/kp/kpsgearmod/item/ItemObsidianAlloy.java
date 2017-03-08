package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianAlloy extends Item
{

    public ItemObsidianAlloy()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANALLOY.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANALLOY.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
