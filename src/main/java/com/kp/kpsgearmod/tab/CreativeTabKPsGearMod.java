package com.kp.kpsgearmod.tab;

import com.kp.kpsgearmod.Reference;
import com.kp.kpsgearmod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabKPsGearMod extends CreativeTabs
{

    public CreativeTabKPsGearMod(int index)
    {
        super(index, Reference.CREATIVE_TAB_LABEL);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.obsidianingot);
    }
}