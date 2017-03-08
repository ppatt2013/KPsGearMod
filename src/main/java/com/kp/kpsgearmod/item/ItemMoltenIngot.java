package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenIngot extends Item
{

    public ItemMoltenIngot()
    {
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENINGOT.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENINGOT.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
