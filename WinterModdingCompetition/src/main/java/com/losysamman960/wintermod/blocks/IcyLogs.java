package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class IcyLogs extends LogBlock {

    public IcyLogs() {
        super(MaterialColor.ICE, Block.Properties.create(Material.ICE)
                .slipperiness(0.98F)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(2.0f, 3.0f)
                .harvestLevel(0));
    }
}
