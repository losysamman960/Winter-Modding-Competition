package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFluids {

    //Textures
    public static final ResourceLocation EGGNOG_STILL_RL = new ResourceLocation(TheWinteryYear.MOD_ID, "blocks/eggnog_still");
    public static final ResourceLocation EGGNOG_FLOWING_RL = new ResourceLocation(TheWinteryYear.MOD_ID, "blocks/eggnog_flowing");
    public static final ResourceLocation EGGNOG_OVERLAY_RL = new ResourceLocation(TheWinteryYear.MOD_ID, "blocks/eggnog_overlay");

    //Registry
    public static final DeferredRegister<Fluid> FLUIDS =  new DeferredRegister<>(ForgeRegistries.FLUIDS, TheWinteryYear.MOD_ID);

    public static final RegistryObject<FlowingFluid> EGGNOG_FLUID = FLUIDS.register("eggnog_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.EGGNOG_PROPERTIES));

    public static final RegistryObject<FlowingFluid> EGGNOG_FLOWING = FLUIDS.register("eggnog_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.EGGNOG_PROPERTIES));

    //Fluid Properties
    public static final ForgeFlowingFluid.Properties EGGNOG_PROPERTIES = new ForgeFlowingFluid.Properties(
            ()-> EGGNOG_FLUID.get(), ()-> EGGNOG_FLOWING.get(), FluidAttributes.builder(EGGNOG_STILL_RL, EGGNOG_FLOWING_RL)
            .density(20)
            .luminosity(10)
            .rarity(Rarity.RARE)
            .sound(SoundEvents.BLOCK_PORTAL_AMBIENT)
            .overlay(EGGNOG_OVERLAY_RL)).block(() -> ModFluids.EGGNOG_BLOCK.get())
            .bucket(ModItems.EGGNOG_BUCKET);

    //Fluid Block
    public static final RegistryObject<FlowingFluidBlock> EGGNOG_BLOCK = ModBlocks.BLOCKS.register("eggnog",
            () -> new FlowingFluidBlock(() -> ModFluids.EGGNOG_FLUID.get(), Block.Properties.create(Material.WATER)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(100.0f)
                    .noDrops()));
}
