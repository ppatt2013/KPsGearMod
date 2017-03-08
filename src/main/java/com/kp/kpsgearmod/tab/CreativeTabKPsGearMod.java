package com.kp.kpsgearmod.tab;

import com.kp.kpsgearmod.Reference;
import com.kp.kpsgearmod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabKPsGearMod extends CreativeTabs
{

    public CreativeTabKPsGearMod(int index)
    {
        super(index, Reference.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.obsidianingot);
    }
}