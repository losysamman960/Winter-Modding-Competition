package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WallBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheWinteryYear.MOD_ID);

    public static final RegistryObject<Block> ICY_LEAVES = BLOCKS.register("icy_leaves", IcyLeaves::new);
    public static final RegistryObject<WallBlock> ICY_WALL = BLOCKS.register("icy_wall", IcyWall::new);
    public static final RegistryObject<Block> ICY_PLANKS = BLOCKS.register("icy_planks", IcyPlanks::new);
    public static final RegistryObject<Block> ICY_LOGS = BLOCKS.register("icy_logs", IcyLogs::new);
    public static final RegistryObject<FenceGateBlock> ICY_FENCE_GATE = BLOCKS.register("icy_fence_gate", IcyFenceGate::new);
}
