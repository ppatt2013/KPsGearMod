package com.kp.kpsgearmod.item;

import com.kp.kpsgearmod.KPsGearMod;
import com.kp.kpsgearmod.Reference;
import net.minecraft.item.ItemSword;

/**
 * Created by keane on 3/8/2017.
 */
public class ItemObsidianSword extends ItemSword
{

    public ItemObsidianSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(Reference.KPsGearModItems.OBSIDIANSWORD.getUnlocalizedName());
        setRegistryName(Reference.KPsGearModItems.OBSIDIANSWORD.getRegistryName());
        setCreativeTab(KPsGearMod.tabKPsGearMod);
        setMaxStackSize(1);


    }
}
