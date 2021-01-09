package com.losysamman960.wintermod.world.gen;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.world.feature.FrozenTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;


@Mod.EventBusSubscriber(modid = TheWinteryYear.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModStuffGen {

    @SubscribeEvent
    //This Adds the Frozen Tree to all biomes
    public static void generateTree(FMLCommonSetupEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(FrozenTree.FROZEN_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.0f, 0))));
        }
    }
}
