package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazeAlloy extends Item
{

    public ItemBlazeAlloy()
    {
        setUnlocalizedName(Reference.KPsGearModItems.BLAZEALLOY.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZEALLOY.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
