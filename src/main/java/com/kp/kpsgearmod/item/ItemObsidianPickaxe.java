package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianPickaxe extends ItemPickaxe
{

    public ItemObsidianPickaxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANPICKAXE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}