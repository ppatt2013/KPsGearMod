package com.kp.kpsgearmod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by keane on 3/8/2017.
 */
public class Materials
{
    //Tool Materials
    public static Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("OBSIDIAN", 3, 4000, 15.0F, 5.0F, 15);

    //Armor Materials
    public static final ItemArmor.ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("OBSIDIAN", "kpsgearmod:obsidian", 40, new int[]{3, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static final ItemArmor.ArmorMaterial blazeArmorMaterial = EnumHelper.addArmorMaterial("BLAZE","kpsgearmod:molten", 25, new int[]{2, 4, 6, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
}
