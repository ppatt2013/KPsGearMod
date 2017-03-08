package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianSword extends Item {

    public ItemObsidianSword()
    {
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANSWORD.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANSWORD.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(64);
    }
}
