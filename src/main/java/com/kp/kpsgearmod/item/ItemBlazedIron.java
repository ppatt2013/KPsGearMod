package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazedIron extends Item
{

    public ItemBlazedIron()
    {
        setUnlocalizedName(Reference.KPsGearModItems.BLAZEDIRON.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZEDIRON.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
