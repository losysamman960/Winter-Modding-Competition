package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.items.Eggnog;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheWinteryYear.MOD_ID);

    //Items
    public static final RegistryObject<Item> EGG_NOG = ITEMS.register("eggnog", Eggnog::new);
    public static final RegistryObject<Item> EGGNOG_BUCKET = ITEMS.register("eggnog_bucket",
            () -> new BucketItem(() -> ModFluids.EGGNOG_FLUID.get(), new Item.Properties().group(TheWinteryYear.TAB).maxStackSize(1)));
    //Block Items
    public static final RegistryObject<Item> ICY_LEAVES_ITEM = ITEMS.register("icy_leaves",
            () -> new BlockItem(ModBlocks.ICY_LEAVES.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_LOG_ITEM = ITEMS.register("icy_logs",
            () -> new BlockItem(ModBlocks.ICY_LOGS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_PLANKS_ITEM = ITEMS.register("icy_planks",
            () -> new BlockItem(ModBlocks.ICY_PLANKS.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_FENCE_ITEM = ITEMS.register("icy_fence",
            () -> new BlockItem(ModBlocks.ICY_WALL.get(), new Item.Properties().group(TheWinteryYear.TAB)));

    public static final RegistryObject<Item> ICY_FENCE_GATE_ITEM = ITEMS.register("icy_fence_gate",
            () -> new BlockItem(ModBlocks.ICY_FENCE_GATE.get(), new Item.Properties().group(TheWinteryYear.TAB)));
}
