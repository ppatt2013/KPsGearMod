package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazeAlloyIngot extends Item
{

    public ItemBlazeAlloyIngot()
    {
        setUnlocalizedName(Reference.KPsGearModItems.BLAZEALLOYINGOT.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZEALLOYINGOT.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}