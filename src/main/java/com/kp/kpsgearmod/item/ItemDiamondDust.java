package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemDiamondDust extends Item

{

    public ItemDiamondDust()
    {
        setUnlocalizedName(Reference.KPsGearModItems.DIAMONDDUST.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.DIAMONDDUST.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);


    }
}
