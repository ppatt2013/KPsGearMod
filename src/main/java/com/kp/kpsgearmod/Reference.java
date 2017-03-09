package com.kp.kpsgearmod;

/**
 * Created by PEARSON-PC on 3/6/2017.
 */
public class Reference
    {
        public static final String MOD_ID = "kpsgearmod";
        public static final String NAME = "KPs Gear Mod";
        public static final String VERSION = "1.0.0";
        public static final String ACCEPTED_VERSIONS = "[1.11.2]";
        public static final String CLIENT_PROXY_CLASS = "com.kp.kpsgearmod.proxy.ClientProxy";
        public static final String SERVER_PROXY_CLASS = "com.kp.kpsgearmod.proxy.ServerProxy";
        public static final String CREATIVE_TAB_LABEL = "tab_kpsgearmod";

        public static enum KPsGearModItems
        {
            REFINEDOBSIDIAN("refinedobsidian", "ItemRefinedObsidian"),
            OBSIDIANALLOY("obsidianalloy", "ItemObsidianAlloy"),
            DIAMONDDUST("diamonddust", "ItemDiamondDust"),
            BOTTLEDIAMONDFLUX("bottlediamondflux", "ItemBottleDiamondFLux"),
            OBSIDIANALLOYINGOT("obsidianalloyingot", "ItemObsidianAlloyIngot"),
            BOTTLEMOLTENBLAZE("bottlemoltenblaze", "ItemBottleMoltenBlaze"),
            BLAZEALLOY("blazealloy", "ItemBlazeAlloy"),
            BLAZEALLOYINGOT("blazealloyingot", "ItemBlazeAlloyIngot"),
            OBSIDIANCHESTPLATE("obsidianchestplate", "ItemObsidianChestplate"),
            OBSIDIANHELMET("obsidianhelmet", "ItemObsidianHelmet"),
            OBSIDIANLEGGINGS("obsidianleggings", "ItemObsidianLeggings"),
            OBSIDIANBOOTS("obsidianboots", "ItemObsidianBoots"),
            OBSIDIANSWORD("obsidiansword", "ItemObsidianSword"),
            OBSIDIANPICKAXE("obsidianpickaxe", "ItemObsidianPickaxe"),
            OBSIDIANSHOVEL("obsidianshovel", "ItemObsidianShovel"),
            OBSIDIANAXE("obsidianaxe", "ItemObsidianAxe"),
            OBSIDIANHOE("obsidianhoe", "ItemObsidianHoe"),
            BLAZECHESTPLATE("blazechestplate", "ItemBlazeChestplate"),
            BLAZEHELMET("blazehelmet", "ItemBlazeHelmet"),
            BLAZELEGGINGS("blazeleggings", "ItemBlazeLeggings"),
            BLAZEBOOTS("blazeboots", "ItemBlazeBoots");

        private String unlocalizedName;
        private String registryName;

        KPsGearModItems(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

        public String getRegistryName()
        {
            return registryName;
        }
    }
}
