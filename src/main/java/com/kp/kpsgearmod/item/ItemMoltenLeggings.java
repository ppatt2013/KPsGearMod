package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenLeggings extends Item {

    public ItemMoltenLeggings()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENLEGGINGS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENLEGGINGS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}