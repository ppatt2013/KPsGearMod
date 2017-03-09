package com.kp.kpsgearmod;

import com.google.common.collect.Lists;
import com.kp.kpsgearmod.item.ModItems;
import com.kp.kpsgearmod.recipies.RecipeMoltenBlaze;
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
            'A', new ItemStack(ModItems.obsidianalloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianhelmet),
                "AAA",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianleggings),
                "AAA",
                "A A",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianboots),
                "A A",
                "A A",
                'A', new ItemStack(ModItems.obsidianalloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidiansword),
                " A ",
                " A ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloyingot), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianpickaxe),
                "AAA",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloyingot), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianshovel),
                " A ",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloyingot), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianaxe),
                "AA ",
                "AB ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloyingot), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianhoe),
                "AA ",
                " B ",
                " B ",
                'A', new ItemStack(ModItems.obsidianalloyingot), 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.blazechestplate),
                "A A",
                "AAA",
                "AAA",
                'A', new ItemStack(ModItems.blazealloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.blazehelmet),
                "AAA",
                "A A",
                'A', new ItemStack(ModItems.blazealloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.blazeleggings),
                "AAA",
                "A A",
                "A A",
                'A', new ItemStack(ModItems.blazealloyingot)
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.blazeboots),
                "A A",
                "A A",
                'A', new ItemStack(ModItems.blazealloyingot)
        );

        //GameRegistry.addRecipe(new RecipeMoltenBlaze(new ItemStack(ModItems.moltenblaze), Lists.newArrayList(new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.BLAZE_POWDER))));

        //All shapeless crafting recipes.
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamonddust), Items.DIAMOND);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianalloy), new ItemStack(ModItems.refinedobsidian), new ItemStack(ModItems.bottlediamondflux));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bottlediamondflux), Items.POTIONITEM, Items.MAGMA_CREAM, new ItemStack(ModItems.diamonddust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bottlemoltenblaze), Items.POTIONITEM, Items.BLAZE_POWDER, Items.MAGMA_CREAM);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blazealloy), Items.IRON_INGOT, new ItemStack(ModItems.bottlemoltenblaze));

        //All smelting recipes.
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.refinedobsidian), 1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.blazealloy), new ItemStack(ModItems.blazealloyingot), 1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.obsidianalloy), new ItemStack(ModItems.obsidianalloyingot), 1F);

    }
}
