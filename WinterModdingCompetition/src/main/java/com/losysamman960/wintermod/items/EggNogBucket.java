package com.losysamman960.wintermod.items;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.init.ModBlocks;
import com.losysamman960.wintermod.init.ModFluids;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;

public class EggNogBucket extends BucketItem {

    public EggNogBucket() {
        super(ModFluids.EGGNOG_FLUID, new Properties().group(TheWinteryYear.TAB).maxStackSize(1));
    }
}
