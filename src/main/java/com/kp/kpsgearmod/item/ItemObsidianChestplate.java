package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianChestplate extends Item {

    public ItemObsidianChestplate()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANCHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANCHESTPLATE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
