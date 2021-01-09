package com.losysamman960.wintermod.world.feature;

import com.losysamman960.wintermod.init.ModBlocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class FrozenTree extends Tree {

    public static final TreeFeatureConfig FROZEN_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.ICY_LOGS.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.ICY_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(3, 0)))
            .baseHeight(4)
            .heightRandA(4)
            .foliageHeight(4)
            .ignoreVines()
            .setSapling((IPlantable)ModBlocks.ICY_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.FANCY_TREE.withConfiguration(FROZEN_TREE_CONFIG);
    }
}
