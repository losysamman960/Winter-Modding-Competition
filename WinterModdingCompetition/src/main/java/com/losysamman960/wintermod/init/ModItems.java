package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.items.Eggnog;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheWinteryYear.MOD_ID);

    //Item Registry
    public static final RegistryObject<Item> EGG_NOG = ITEMS.register("eggnog", Eggnog::new);
    public static final RegistryObject<Item> EGGNOG_BUCKET = ITEMS.register("eggnog_bucket",
            () -> new BucketItem(() -> ModFluids.EGGNOG_FLUID.get(), new Item.Properties().group(TheWinteryYear.TAB).maxStackSize(1)));

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
}
