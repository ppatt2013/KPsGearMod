package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemFluxedObsidian extends Item
{

    public ItemFluxedObsidian()
    {
        setUnlocalizedName(Reference.KPsGearModItems.FLUXEDOBSIDIAN.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.FLUXEDOBSIDIAN.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
