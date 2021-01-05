package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;

public class IcyLogs extends LogBlock {
    public IcyLogs() {
        super(MaterialColor.ICE, Block.Properties.from(Blocks.OAK_LOG));
    }

}
