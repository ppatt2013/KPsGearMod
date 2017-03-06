package com.kp.kpsgearmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemObsidianPickAxe extends ItemPickaxe
{

    public ItemObsidianPickAxe(ToolMaterial material) {
        super(material);
    }

    public ItemObsidianPickAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName)
            .setRegistryName(KPsGearMod.MODID + ":" + unlocalizedName)
            .setCreativeTab(CreativeTabs.TOOLS);

    }

}
