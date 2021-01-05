package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.blocks.IcyFence;
import com.losysamman960.wintermod.blocks.IcyLeaves;
import com.losysamman960.wintermod.blocks.IcyLogs;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheWinteryYear.MOD_ID);

    public static final RegistryObject<Block> ICY_LEAVES = BLOCKS.register("icy_leaves", IcyLeaves::new);
    public static final RegistryObject<FenceBlock> ICY_FENCE = BLOCKS.register("icy_fence", IcyFence::new);
    public static final RegistryObject<Block> ICY_PLANKS = BLOCKS.register("icy_planks", IcyFence::new);
    public static final RegistryObject<Block> ICY_LOGS = BLOCKS.register("icy_logs", IcyLogs::new);
}
