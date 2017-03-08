package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianShovel extends Item {

    public ItemObsidianShovel()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANSHOVEL.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANSHOVEL.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}