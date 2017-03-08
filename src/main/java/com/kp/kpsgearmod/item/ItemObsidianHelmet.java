package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import javax.swing.text.html.parser.Entity;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianHelmet extends ItemArmor
{

    public ItemObsidianHelmet(ArmorMaterial material, EntityEquipmentSlot slot)
    {
        super(material, 0, slot);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANHELMET.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANHELMET.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}