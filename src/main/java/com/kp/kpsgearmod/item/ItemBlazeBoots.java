package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazeBoots extends ItemBlazeArmorBase {

    public ItemBlazeBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.KPsGearModItems.BLAZEBOOTS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZEBOOTS.getRegistryName());
    }
}