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
 * Created by PEARSON-PC on 3/9/2017.
 */
public class ItemBlazeArmorBase extends ItemArmor
{
    public ItemBlazeArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        Iterable<ItemStack> equippedItems = player.getArmorInventoryList();

        int equippedBlazePieces = 0;
        for (ItemStack equippedItemStack : equippedItems)
        {
            String equippedItemUnlocalizedName = equippedItemStack.getItem().getUnlocalizedName().substring(5);

            if (equippedItemUnlocalizedName.equals(Reference.KPsGearModItems.BLAZECHESTPLATE.getUnlocalizedName())
                    || equippedItemUnlocalizedName.equals(Reference.KPsGearModItems.BLAZEBOOTS.getUnlocalizedName())
                    || equippedItemUnlocalizedName.equals(Reference.KPsGearModItems.BLAZEHELMET.getUnlocalizedName())
                    || equippedItemUnlocalizedName.equals(Reference.KPsGearModItems.BLAZELEGGINGS.getUnlocalizedName()))
            {
                equippedBlazePieces++;
            }
        }

        String fireResistanceEffectName = MobEffects.FIRE_RESISTANCE.getName();
        if (equippedBlazePieces == 4)
        {
            for (PotionEffect activePotionEffect : player.getActivePotionEffects())
            {
                if (activePotionEffect.getEffectName().equals(fireResistanceEffectName))
                {
                    return;
                }
            }
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 32767, 2));
        }
        else
        {
            for (PotionEffect activePotionEffect : player.getActivePotionEffects())
            {
                String activeEffectName = activePotionEffect.getEffectName();

                if (activeEffectName.equals(fireResistanceEffectName))
                {
                    player.removePotionEffect(MobEffects.FIRE_RESISTANCE);
                    return;
                }
            }
        }
    }
}
