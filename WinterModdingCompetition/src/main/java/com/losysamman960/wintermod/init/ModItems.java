package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.items.EggNogBucket;
import com.losysamman960.wintermod.items.Eggnog;
import com.losysamman960.wintermod.items.FrozenSword;
import com.losysamman960.wintermod.items.UglyChristmasSweater;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheWinteryYear.MOD_ID);

    //Item Registry
    public static final RegistryObject<Item> EGG_NOG = ITEMS.register("eggnog", Eggnog::new);
    public static final RegistryObject<Item> EGGNOG_BUCKET = ITEMS.register("eggnog_bucket", EggNogBucket::new);

    //Armor Registry
    public static final RegistryObject<ArmorItem> UGLY_CHRISTMAS_SWEATER = ITEMS.register("ugly_christmas_sweater", UglyChristmasSweater::new);

    //Tools Registry
    public static final RegistryObject<SwordItem> FROZEN_SWORD = ITEMS.register("frozen_sword", FrozenSword::new);

    //Block Item Registry
    public static final RegistryObject<Item> ICY_LEAVES_ITEM = ITEMS.register("icy_leaves",
            () -> new BlockItem(ModBlocks.ICY_LEAVES.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_LOG_ITEM = ITEMS.register("icy_logs",
            () -> new BlockItem(ModBlocks.ICY_LOGS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_PLANKS_ITEM = ITEMS.register("icy_planks",
            () -> new BlockItem(ModBlocks.ICY_PLANKS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_FENCE_ITEM = ITEMS.register("icy_fence",
            () -> new BlockItem(ModBlocks.ICY_FENCE.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_FENCE_GATE_ITEM = ITEMS.register("icy_fence_gate",
            () -> new BlockItem(ModBlocks.ICY_FENCE_GATE.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_LADDER_ITEM = ITEMS.register("icy_ladder",
            () -> new BlockItem(ModBlocks.ICY_LADDER.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_SAPLING_ITEM = ITEMS.register("icy_sapling",
            () -> new BlockItem(ModBlocks.ICY_SAPLING.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_BUTTON_ITEM = ITEMS.register("icy_button",
            () -> new BlockItem(ModBlocks.ICY_BUTTON.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_PRESSURE_PLATE_ITEM = ITEMS.register("icy_pressure_plate",
            () -> new BlockItem(ModBlocks.ICY_PRESSURE_PLATE.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> SNOW_GLOBE_ITEM = ITEMS.register("snow_globe",
            () -> new BlockItem(ModBlocks.SNOW_GLOBE.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> CRYSTALIZED_SNOW_SEED = ITEMS.register("crystalized_snow_seed",
            () -> new BlockItem(ModBlocks.CRYSTALIZED_SNOW.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_DOOR_ITEM = ITEMS.register("icy_door",
            () -> new BlockItem(ModBlocks.ICY_DOOR.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_TRAPDOOR_ITEM = ITEMS.register("icy_trapdoor",
            () -> new BlockItem(ModBlocks.ICY_TRAPDOR.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_SLAB_ITEM = ITEMS.register("icy_slab",
            () -> new BlockItem(ModBlocks.ICY_SLABS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_STAIRS_ITEM = ITEMS.register("icy_stairs",
            () -> new BlockItem(ModBlocks.ICY_STAIRS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

}
