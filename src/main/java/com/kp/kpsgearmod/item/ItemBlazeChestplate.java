package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemBlazeChestplate extends ItemArmor
{

    public ItemBlazeChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Reference.KPsGearModItems.BLAZECHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.BLAZECHESTPLATE.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 100, 2));
    }
}