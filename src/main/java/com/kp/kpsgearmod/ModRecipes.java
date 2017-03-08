package com.kp.kpsgearmod;

import com.kp.kpsgearmod.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by keane on 3/8/2017.
 */
public class ModRecipes
{
    public static void addRecipes()
    {
        //All shaped crafting recipes.
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianchestplate),
            "A A",
            "AAA",
            "AAA",
            'A', new ItemStack(ModItems.obsidianalloy)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianhelmet),
                "AAA",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloy)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianleggings),
                "AAA",
                "A A",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloy)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianboots),
                "A A",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloy)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidiansword),
                " A ",
                " A ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloy), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianpickaxe),
                "AAA",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloy), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianshovel),
                " A ",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloy), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianaxe),
                "AA ",
                "AB ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloy), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianhoe),
                "AA ",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloy), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.moltenchestplate),
                "A A",
                "AAA",
                "AAA",
                'A', new ItemStack(ModItems.molteningot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.moltenhelmet),
                "AAA",
                "A A",
                'A', new ItemStack(ModItems.molteningot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.moltenleggings),
                "AAA",
                "A A",
                "A A",
                'A', new ItemStack(ModItems.molteningot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.moltenboots),
                "A A",
                "A A",
                'A', new ItemStack(ModItems.molteningot)
        );

        //All shapeless crafting recipes.
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamonddust), Items.DIAMOND);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianalloy), new ItemStack(ModItems.obsidianingot), new ItemStack(ModItems.diamonddust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.moltenblaze), Items.LAVA_BUCKET, Items.BLAZE_POWDER);

        //All smelting recipes.
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidianingot), 1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.moltenblaze), new ItemStack(ModItems.molteningot), 1F);

    }
}
