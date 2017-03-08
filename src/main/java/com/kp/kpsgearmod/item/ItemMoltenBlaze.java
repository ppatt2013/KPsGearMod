package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenBlaze extends Item
{

    public ItemMoltenBlaze()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENBLAZE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENBLAZE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
