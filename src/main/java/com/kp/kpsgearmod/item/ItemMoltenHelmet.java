package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenHelmet extends Item {

    public ItemMoltenHelmet()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENHELMET.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENHELMET.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}