package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianHelmet extends ItemArmor
{

    public ItemObsidianHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot)
    {
        super(material, renderIndex, slot);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANHELMET.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANHELMET.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}