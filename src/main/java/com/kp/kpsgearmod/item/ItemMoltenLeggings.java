package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenLeggings extends ItemArmor {

    public ItemMoltenLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENLEGGINGS.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENLEGGINGS.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}