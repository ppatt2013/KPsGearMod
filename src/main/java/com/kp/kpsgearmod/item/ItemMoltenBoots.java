package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenBoots extends Item {

    public ItemMoltenBoots()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENBOOTS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENBOOTS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}