package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class IcyButton extends WoodButtonBlock {

    public IcyButton() {
        super(Block.Properties.create(Material.ICE, MaterialColor.ICE));
    }
}
