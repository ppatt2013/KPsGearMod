package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.ItemAxe;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianAxe extends ItemAxe
{

    public ItemObsidianAxe(ToolMaterial material)
    {
        super(material, 9f, -2.1f);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANAXE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANAXE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}