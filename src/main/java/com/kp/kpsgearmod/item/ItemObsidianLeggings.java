package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianLeggings extends ItemArmor
{

    public ItemObsidianLeggings(ArmorMaterial material, EntityEquipmentSlot slot)
    {
        super(material, 0, slot);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANLEGGINGS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANLEGGINGS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}