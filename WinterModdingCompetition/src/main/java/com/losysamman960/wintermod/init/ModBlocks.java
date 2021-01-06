package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.blocks.*;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheWinteryYear.MOD_ID);

    //This Registers the Blocks
    public static final RegistryObject<Block> ICY_LEAVES = BLOCKS.register("icy_leaves", IcyLeaves::new);
    public static final RegistryObject<FenceBlock> ICY_FENCE = BLOCKS.register("icy_fence", IcyFence::new);
    public static final RegistryObject<Block> ICY_PLANKS = BLOCKS.register("icy_planks", IcyPlanks::new);
    public static final RegistryObject<Block> ICY_LOGS = BLOCKS.register("icy_logs", IcyLogs::new);
    public static final RegistryObject<FenceGateBlock> ICY_FENCE_GATE = BLOCKS.register("icy_fence_gate", IcyFenceGate::new);
    public static final RegistryObject<IcyLadder> ICY_LADDER = BLOCKS.register("icy_ladder", IcyLadder::new);
    public static final RegistryObject<Block> ICY_SAPLING = BLOCKS.register("icy_sapling", IcySapling::new);
    public static final RegistryObject<Block> ICY_BUTTON = BLOCKS.register("icy_button", IcyButton::new);
    public static final RegistryObject<Block> ICY_PRESSURE_PLATE = BLOCKS.register("icy_pressure_plate", IcyPressurePlate::new);

}
