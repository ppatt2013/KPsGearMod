package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemMoltenChestplate extends ItemArmor
{

    public ItemMoltenChestplate(ArmorMaterial material, EntityEquipmentSlot slot)
    {
        super(material, 0, slot);
        setUnlocalizedName(Reference.KPsGearModItems.MOLTENCHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.MOLTENCHESTPLATE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }
}