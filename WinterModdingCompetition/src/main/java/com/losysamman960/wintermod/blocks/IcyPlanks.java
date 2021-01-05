package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class IcyPlanks extends Block {
    public IcyPlanks() {
        super(Block.Properties.create(Material.PACKED_ICE)
                .hardnessAndResistance(2.0f, 3.0f)
                .sound(SoundType.GLASS)
                .harvestTool(ToolType.AXE));
    }
}
