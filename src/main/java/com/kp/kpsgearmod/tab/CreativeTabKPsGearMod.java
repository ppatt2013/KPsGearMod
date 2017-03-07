package com.kp.kpsgearmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabKPsGearMod extends CreativeTabs {

    public CreativeTabKPsGearMod(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return ItemStack.EMPTY;
    }
}
