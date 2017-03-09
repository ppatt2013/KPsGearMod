package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenBoots extends ItemArmor {

    public ItemMoltenBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENBOOTS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENBOOTS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}