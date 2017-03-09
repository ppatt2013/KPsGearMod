package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBottleMoltenBlaze extends Item
{

    public ItemBottleMoltenBlaze()
    {
        setUnlocalizedName(Reference.KPsGearModItems.BOTTLEMOLTENBLAZE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BOTTLEMOLTENBLAZE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}
