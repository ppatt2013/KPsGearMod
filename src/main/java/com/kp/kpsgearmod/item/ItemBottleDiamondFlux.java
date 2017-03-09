package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

public class ItemBottleDiamondFlux extends Item {

    public ItemBottleDiamondFlux()
    {
        setUnlocalizedName(Reference.KPsGearModItems.BOTTLEDIAMONDFLUX.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BOTTLEDIAMONDFLUX.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}
