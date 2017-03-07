package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemObsidianPickaxe extends ItemPickaxe
{

    public ItemObsidianPickaxe(ToolMaterial material) {
        super(material);
    }

    public ItemObsidianPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName)
            .setRegistryName(KPsGearMod.MODID + ":" + unlocalizedName)
            .setCreativeTab(CreativeTabs.TOOLS);

    }

}
