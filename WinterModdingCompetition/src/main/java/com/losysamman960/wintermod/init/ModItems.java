package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.items.Eggnog;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheWinteryYear.MOD_ID);

    public static final RegistryObject<Item> EGG_NOG = ITEMS.register("eggnog", Eggnog::new);
    public static final RegistryObject<Item> EGGNOG_BUCKET = ITEMS.register("eggnog_bucket",
            () -> new BucketItem(() -> ModFluids.EGGNOG_FLUID.get(), new Item.Properties().group(TheWinteryYear.TAB).maxStackSize(1)));
}
