package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenChestplate extends Item {

    public ItemMoltenChestplate()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENCHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENCHESTPLATE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}