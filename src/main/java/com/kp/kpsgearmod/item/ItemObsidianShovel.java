package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.ItemSpade;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianShovel extends ItemSpade
{

    public ItemObsidianShovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANSHOVEL.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANSHOVEL.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}