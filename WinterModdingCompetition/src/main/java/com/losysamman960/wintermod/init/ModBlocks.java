package com.losysamman960.wintermod.init;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.blocks.*;
import com.losysamman960.wintermod.world.feature.FrozenTree;
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
    public static final RegistryObject<Block> ICY_SAPLING = BLOCKS.register("icy_sapling",
            () -> new IcySapling(() -> new FrozenTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ICY_BUTTON = BLOCKS.register("icy_button", IcyButton::new);
    public static final RegistryObject<Block> ICY_PRESSURE_PLATE = BLOCKS.register("icy_pressure_plate", IcyPressurePlate::new);
    public static final RegistryObject<Block> SNOW_GLOBE = BLOCKS.register("snow_globe", SnowGlobe::new);
    public static final RegistryObject<Block> CRYSTALIZED_SNOW = BLOCKS.register("crystalized_snow", CrystalizedSnow::new);
    public static final RegistryObject<Block> ICY_DOOR = BLOCKS.register("icy_door", IcyDoor::new);
    public static final RegistryObject<Block> ICY_TRAPDOR = BLOCKS.register("icy_trapdoor", IcyTrapdoor::new);
    public static final RegistryObject<Block> ICY_SLABS = BLOCKS.register("icy_slabs", IcySlab::new);
    public static final RegistryObject<Block> ICY_STAIRS = BLOCKS.register("icy_stairs", IcyStairs::new);
}
