package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazeHelmet extends ItemBlazeArmorBase {

    public ItemBlazeHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.KPsGearModItems.BLAZEHELMET.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZEHELMET.getRegistryName());
    }
}