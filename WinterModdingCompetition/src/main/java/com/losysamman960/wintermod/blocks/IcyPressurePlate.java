package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class IcyPressurePlate extends PressurePlateBlock {

    public IcyPressurePlate() {
        super(Sensitivity.EVERYTHING, Block.Properties.create(Material.ICE, MaterialColor.ICE));
    }
}
