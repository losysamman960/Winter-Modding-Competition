package com.losysamman960.wintermod.blocks;

import com.losysamman960.wintermod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;

public class IcyStairs extends StairsBlock {

    public IcyStairs() {
        super(ModBlocks.ICY_PLANKS.get().getDefaultState(), Block.Properties.create(Material.ICE)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(2.0f)
                .harvestLevel(0)
                .slipperiness(0.98F));
    }
}
