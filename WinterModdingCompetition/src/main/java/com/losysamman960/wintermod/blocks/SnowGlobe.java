package com.losysamman960.wintermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class SnowGlobe extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 12, 1, 12), Block.makeCuboidShape(2, 0, 4, 4, 1, 12), Block.makeCuboidShape(4, 0, 2, 12, 1, 4), Block.makeCuboidShape(12, 0, 4, 14, 1, 12), Block.makeCuboidShape(4, 0, 12, 12, 1, 14), Block.makeCuboidShape(3, 0, 3, 4, 1, 4), Block.makeCuboidShape(12, 0, 3, 13, 1, 4),
            Block.makeCuboidShape(3, 0, 12, 4, 1, 13), Block.makeCuboidShape(12, 0, 12, 13, 1, 13), Block.makeCuboidShape(4, 1, 4, 12, 2, 12), Block.makeCuboidShape(4, 1, 3, 12, 2, 4), Block.makeCuboidShape(4, 1, 12, 12, 2, 13), Block.makeCuboidShape(12, 1, 4, 13, 2, 12), Block.makeCuboidShape(3, 1, 4, 4, 2, 12), Block.makeCuboidShape(6, 2, 6, 10, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 6), Block.makeCuboidShape(10, 2, 6, 12, 3, 10), Block.makeCuboidShape(6, 2, 10, 10, 3, 12), Block.makeCuboidShape(4, 2, 6, 6, 3, 10), Block.makeCuboidShape(5, 2, 5, 6, 3, 6), Block.makeCuboidShape(5, 2, 10, 6, 3, 11), Block.makeCuboidShape(10, 2, 5, 11, 3, 6), Block.makeCuboidShape(5, 3, 3, 11, 4, 5),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11), Block.makeCuboidShape(3, 3, 5, 5, 4, 11), Block.makeCuboidShape(5, 3, 11, 11, 4, 13), Block.makeCuboidShape(11, 3, 5, 13, 4, 11), Block.makeCuboidShape(4, 3, 4, 5, 4, 5), Block.makeCuboidShape(4, 3, 11, 5, 4, 12), Block.makeCuboidShape(11, 3, 4, 12, 4, 5), Block.makeCuboidShape(11, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 4, 2, 12, 5, 4), Block.makeCuboidShape(2, 4, 4, 4, 5, 12), Block.makeCuboidShape(12, 4, 4, 14, 5, 12), Block.makeCuboidShape(4, 4, 12, 12, 5, 14), Block.makeCuboidShape(3, 4, 3, 4, 5, 4), Block.makeCuboidShape(3, 4, 12, 4, 5, 13), Block.makeCuboidShape(12, 4, 12, 13, 5, 13), Block.makeCuboidShape(12, 4, 3, 13, 5, 4),
            Block.makeCuboidShape(3, 5, 1, 13, 14, 3), Block.makeCuboidShape(1, 5, 3, 3, 14, 13), Block.makeCuboidShape(3, 5, 13, 13, 14, 15), Block.makeCuboidShape(13, 5, 3, 15, 14, 13), Block.makeCuboidShape(13, 5, 2, 14, 14, 3), Block.makeCuboidShape(2, 5, 13, 3, 14, 14), Block.makeCuboidShape(13, 5, 13, 14, 14, 14), Block.makeCuboidShape(2, 5, 2, 3, 14, 3),
            Block.makeCuboidShape(3, 14, 3, 4, 15, 4), Block.makeCuboidShape(2, 14, 4, 4, 15, 12), Block.makeCuboidShape(3, 14, 12, 4, 15, 13), Block.makeCuboidShape(4, 14, 2, 12, 15, 4), Block.makeCuboidShape(12, 14, 3, 13, 15, 4), Block.makeCuboidShape(12, 14, 4, 14, 15, 12), Block.makeCuboidShape(12, 14, 12, 13, 15, 13), Block.makeCuboidShape(4, 14, 12, 12, 15, 14),
            Block.makeCuboidShape(4, 15, 4, 5, 16, 5), Block.makeCuboidShape(5, 15, 3, 11, 16, 5), Block.makeCuboidShape(11, 15, 4, 12, 16, 5), Block.makeCuboidShape(11, 15, 5, 13, 16, 11), Block.makeCuboidShape(11, 15, 11, 12, 16, 12), Block.makeCuboidShape(3, 15, 5, 5, 16, 11), Block.makeCuboidShape(4, 15, 11, 5, 16, 12), Block.makeCuboidShape(5, 15, 11, 11, 16, 13),
            Block.makeCuboidShape(10, 16, 6, 12, 17, 10), Block.makeCuboidShape(6, 16, 10, 10, 17, 12), Block.makeCuboidShape(4, 16, 6, 6, 17, 10), Block.makeCuboidShape(6, 16, 4, 10, 17, 6), Block.makeCuboidShape(5, 16, 5, 6, 17, 6), Block.makeCuboidShape(10, 16, 5, 11, 17, 6), Block.makeCuboidShape(10, 16, 10, 11, 17, 11), Block.makeCuboidShape(6, 17, 6, 10, 18, 10),
            Block.makeCuboidShape(5, 16, 10, 6, 17, 11), Block.makeCuboidShape(5, 3, 5, 11, 4, 11), Block.makeCuboidShape(7, 4, 8, 8, 5, 9), Block.makeCuboidShape(7, 6, 8, 8, 7, 9), Block.makeCuboidShape(7, 7, 8, 8, 8, 9), Block.makeCuboidShape(8, 8, 8, 9, 9, 9), Block.makeCuboidShape(7, 5, 8, 8, 6, 9), Block.makeCuboidShape(9, 7, 8, 10, 8, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 12, 1, 12), Block.makeCuboidShape(4, 0, 2, 12, 1, 4), Block.makeCuboidShape(12, 0, 4, 14, 1, 12), Block.makeCuboidShape(4, 0, 12, 12, 1, 14), Block.makeCuboidShape(2, 0, 4, 4, 1, 12), Block.makeCuboidShape(12, 0, 3, 13, 1, 4), Block.makeCuboidShape(12, 0, 12, 13, 1, 13), Block.makeCuboidShape(3, 0, 3, 4, 1, 4),
            Block.makeCuboidShape(3, 0, 12, 4, 1, 13), Block.makeCuboidShape(4, 1, 4, 12, 2, 12), Block.makeCuboidShape(12, 1, 4, 13, 2, 12), Block.makeCuboidShape(3, 1, 4, 4, 2, 12), Block.makeCuboidShape(4, 1, 12, 12, 2, 13), Block.makeCuboidShape(4, 1, 3, 12, 2, 4), Block.makeCuboidShape(6, 2, 6, 10, 3, 10), Block.makeCuboidShape(10, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 10, 10, 3, 12), Block.makeCuboidShape(4, 2, 6, 6, 3, 10), Block.makeCuboidShape(6, 2, 4, 10, 3, 6), Block.makeCuboidShape(10, 2, 5, 11, 3, 6), Block.makeCuboidShape(5, 2, 5, 6, 3, 6), Block.makeCuboidShape(10, 2, 10, 11, 3, 11), Block.makeCuboidShape(11, 3, 5, 13, 4, 11), Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(5, 3, 3, 11, 4, 5), Block.makeCuboidShape(3, 3, 5, 5, 4, 11), Block.makeCuboidShape(5, 3, 11, 11, 4, 13), Block.makeCuboidShape(11, 3, 4, 12, 4, 5), Block.makeCuboidShape(4, 3, 4, 5, 4, 5), Block.makeCuboidShape(11, 3, 11, 12, 4, 12), Block.makeCuboidShape(4, 3, 11, 5, 4, 12), Block.makeCuboidShape(12, 4, 4, 14, 5, 12), Block.makeCuboidShape(4, 4, 2, 12, 5, 4),
            Block.makeCuboidShape(4, 4, 12, 12, 5, 14), Block.makeCuboidShape(2, 4, 4, 4, 5, 12), Block.makeCuboidShape(12, 4, 3, 13, 5, 4), Block.makeCuboidShape(3, 4, 3, 4, 5, 4), Block.makeCuboidShape(3, 4, 12, 4, 5, 13), Block.makeCuboidShape(12, 4, 12, 13, 5, 13), Block.makeCuboidShape(13, 5, 3, 15, 14, 13), Block.makeCuboidShape(3, 5, 1, 13, 14, 3),
            Block.makeCuboidShape(1, 5, 3, 3, 14, 13), Block.makeCuboidShape(3, 5, 13, 13, 14, 15), Block.makeCuboidShape(13, 5, 13, 14, 14, 14), Block.makeCuboidShape(2, 5, 2, 3, 14, 3), Block.makeCuboidShape(2, 5, 13, 3, 14, 14), Block.makeCuboidShape(13, 5, 2, 14, 14, 3), Block.makeCuboidShape(12, 14, 3, 13, 15, 4), Block.makeCuboidShape(4, 14, 2, 12, 15, 4),
            Block.makeCuboidShape(3, 14, 3, 4, 15, 4), Block.makeCuboidShape(12, 14, 4, 14, 15, 12), Block.makeCuboidShape(12, 14, 12, 13, 15, 13), Block.makeCuboidShape(4, 14, 12, 12, 15, 14), Block.makeCuboidShape(3, 14, 12, 4, 15, 13), Block.makeCuboidShape(2, 14, 4, 4, 15, 12), Block.makeCuboidShape(11, 15, 4, 12, 16, 5), Block.makeCuboidShape(11, 15, 5, 13, 16, 11), Block.makeCuboidShape(11, 15, 11, 12, 16, 12), Block.makeCuboidShape(5, 15, 11, 11, 16, 13), Block.makeCuboidShape(4, 15, 11, 5, 16, 12), Block.makeCuboidShape(5, 15, 3, 11, 16, 5), Block.makeCuboidShape(4, 15, 4, 5, 16, 5), Block.makeCuboidShape(3, 15, 5, 5, 16, 11),
            Block.makeCuboidShape(6, 16, 10, 10, 17, 12), Block.makeCuboidShape(4, 16, 6, 6, 17, 10), Block.makeCuboidShape(6, 16, 4, 10, 17, 6), Block.makeCuboidShape(10, 16, 6, 12, 17, 10), Block.makeCuboidShape(10, 16, 5, 11, 17, 6), Block.makeCuboidShape(10, 16, 10, 11, 17, 11), Block.makeCuboidShape(5, 16, 10, 6, 17, 11), Block.makeCuboidShape(6, 17, 6, 10, 18, 10),
            Block.makeCuboidShape(5, 16, 5, 6, 17, 6), Block.makeCuboidShape(5, 3, 5, 11, 4, 11), Block.makeCuboidShape(7, 4, 7, 8, 5, 8), Block.makeCuboidShape(7, 6, 7, 8, 7, 8), Block.makeCuboidShape(7, 7, 7, 8, 8, 8), Block.makeCuboidShape(7, 8, 8, 8, 9, 9), Block.makeCuboidShape(7, 5, 7, 8, 6, 8), Block.makeCuboidShape(7, 7, 9, 8, 8, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 12, 1, 12), Block.makeCuboidShape(12, 0, 4, 14, 1, 12), Block.makeCuboidShape(4, 0, 12, 12, 1, 14), Block.makeCuboidShape(2, 0, 4, 4, 1, 12), Block.makeCuboidShape(4, 0, 2, 12, 1, 4), Block.makeCuboidShape(12, 0, 12, 13, 1, 13),
            Block.makeCuboidShape(3, 0, 12, 4, 1, 13), Block.makeCuboidShape(12, 0, 3, 13, 1, 4), Block.makeCuboidShape(3, 0, 3, 4, 1, 4), Block.makeCuboidShape(4, 1, 4, 12, 2, 12), Block.makeCuboidShape(4, 1, 12, 12, 2, 13), Block.makeCuboidShape(4, 1, 3, 12, 2, 4), Block.makeCuboidShape(3, 1, 4, 4, 2, 12), Block.makeCuboidShape(12, 1, 4, 13, 2, 12),
            Block.makeCuboidShape(6, 2, 6, 10, 3, 10), Block.makeCuboidShape(6, 2, 10, 10, 3, 12), Block.makeCuboidShape(4, 2, 6, 6, 3, 10), Block.makeCuboidShape(6, 2, 4, 10, 3, 6), Block.makeCuboidShape(10, 2, 6, 12, 3, 10), Block.makeCuboidShape(10, 2, 10, 11, 3, 11), Block.makeCuboidShape(10, 2, 5, 11, 3, 6), Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(5, 3, 11, 11, 4, 13),Block.makeCuboidShape(5, 2, 5, 6, 3, 6), Block.makeCuboidShape(11, 3, 5, 13, 4, 11), Block.makeCuboidShape(5, 3, 3, 11, 4, 5), Block.makeCuboidShape(3, 3, 5, 5, 4, 11),
            Block.makeCuboidShape(11, 3, 11, 12, 4, 12), Block.makeCuboidShape(11, 3, 4, 12, 4, 5), Block.makeCuboidShape(4, 3, 11, 5, 4, 12), Block.makeCuboidShape(4, 3, 4, 5, 4, 5), Block.makeCuboidShape(4, 4, 12, 12, 5, 14), Block.makeCuboidShape(12, 4, 4, 14, 5, 12), Block.makeCuboidShape(2, 4, 4, 4, 5, 12), Block.makeCuboidShape(4, 4, 2, 12, 5, 4), Block.makeCuboidShape(12, 4, 12, 13, 5, 13), Block.makeCuboidShape(12, 4, 3, 13, 5, 4), Block.makeCuboidShape(3, 4, 3, 4, 5, 4),
            Block.makeCuboidShape(3, 4, 12, 4, 5, 13), Block.makeCuboidShape(3, 5, 13, 13, 14, 15), Block.makeCuboidShape(13, 5, 3, 15, 14, 13), Block.makeCuboidShape(3, 5, 1, 13, 14, 3), Block.makeCuboidShape(1, 5, 3, 3, 14, 13), Block.makeCuboidShape(2, 5, 13, 3, 14, 14), Block.makeCuboidShape(13, 5, 2, 14, 14, 3), Block.makeCuboidShape(2, 5, 2, 3, 14, 3),
            Block.makeCuboidShape(13, 5, 13, 14, 14, 14), Block.makeCuboidShape(12, 14, 12, 13, 15, 13), Block.makeCuboidShape(12, 14, 4, 14, 15, 12), Block.makeCuboidShape(12, 14, 3, 13, 15, 4), Block.makeCuboidShape(4, 14, 12, 12, 15, 14), Block.makeCuboidShape(3, 14, 12, 4, 15, 13), Block.makeCuboidShape(2, 14, 4, 4, 15, 12), Block.makeCuboidShape(3, 14, 3, 4, 15, 4), Block.makeCuboidShape(4, 14, 2, 12, 15, 4),
            Block.makeCuboidShape(11, 15, 11, 12, 16, 12), Block.makeCuboidShape(5, 15, 11, 11, 16, 13), Block.makeCuboidShape(4, 15, 11, 5, 16, 12), Block.makeCuboidShape(3, 15, 5, 5, 16, 11), Block.makeCuboidShape(4, 15, 4, 5, 16, 5), Block.makeCuboidShape(11, 15, 5, 13, 16, 11), Block.makeCuboidShape(11, 15, 4, 12, 16, 5), Block.makeCuboidShape(5, 15, 3, 11, 16, 5), Block.makeCuboidShape(4, 16, 6, 6, 17, 10), Block.makeCuboidShape(6, 16, 4, 10, 17, 6), Block.makeCuboidShape(10, 16, 6, 12, 17, 10), Block.makeCuboidShape(6, 16, 10, 10, 17, 12), Block.makeCuboidShape(10, 16, 10, 11, 17, 11), Block.makeCuboidShape(5, 16, 10, 6, 17, 11), Block.makeCuboidShape(5, 16, 5, 6, 17, 6), Block.makeCuboidShape(6, 17, 6, 10, 18, 10),
            Block.makeCuboidShape(10, 16, 5, 11, 17, 6), Block.makeCuboidShape(5, 3, 5, 11, 4, 11), Block.makeCuboidShape(8, 4, 7, 9, 5, 8), Block.makeCuboidShape(8, 6, 7, 9, 7, 8), Block.makeCuboidShape(8, 7, 7, 9, 8, 8), Block.makeCuboidShape(7, 8, 7, 8, 9, 8), Block.makeCuboidShape(8, 5, 7, 9, 6, 8), Block.makeCuboidShape(6, 7, 7, 7, 8, 8)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 12, 1, 12), Block.makeCuboidShape(4, 0, 12, 12, 1, 14), Block.makeCuboidShape(2, 0, 4, 4, 1, 12), Block.makeCuboidShape(4, 0, 2, 12, 1, 4), Block.makeCuboidShape(12, 0, 4, 14, 1, 12), Block.makeCuboidShape(3, 0, 12, 4, 1, 13), Block.makeCuboidShape(3, 0, 3, 4, 1, 4),
            Block.makeCuboidShape(12, 0, 12, 13, 1, 13), Block.makeCuboidShape(12, 0, 3, 13, 1, 4), Block.makeCuboidShape(4, 1, 4, 12, 2, 12), Block.makeCuboidShape(3, 1, 4, 4, 2, 12), Block.makeCuboidShape(12, 1, 4, 13, 2, 12), Block.makeCuboidShape(4, 1, 3, 12, 2, 4), Block.makeCuboidShape(4, 1, 12, 12, 2, 13), Block.makeCuboidShape(6, 2, 6, 10, 3, 10),
            Block.makeCuboidShape(4, 2, 6, 6, 3, 10), Block.makeCuboidShape(6, 2, 4, 10, 3, 6), Block.makeCuboidShape(10, 2, 6, 12, 3, 10), Block.makeCuboidShape(6, 2, 10, 10, 3, 12), Block.makeCuboidShape(5, 2, 10, 6, 3, 11), Block.makeCuboidShape(10, 2, 10, 11, 3, 11), Block.makeCuboidShape(5, 2, 5, 6, 3, 6), Block.makeCuboidShape(3, 3, 5, 5, 4, 11),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6), Block.makeCuboidShape(5, 3, 11, 11, 4, 13), Block.makeCuboidShape(11, 3, 5, 13, 4, 11), Block.makeCuboidShape(5, 3, 3, 11, 4, 5), Block.makeCuboidShape(4, 3, 11, 5, 4, 12), Block.makeCuboidShape(11, 3, 11, 12, 4, 12), Block.makeCuboidShape(4, 3, 4, 5, 4, 5), Block.makeCuboidShape(11, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(2, 4, 4, 4, 5, 12), Block.makeCuboidShape(4, 4, 12, 12, 5, 14), Block.makeCuboidShape(4, 4, 2, 12, 5, 4), Block.makeCuboidShape(12, 4, 4, 14, 5, 12), Block.makeCuboidShape(3, 4, 12, 4, 5, 13), Block.makeCuboidShape(12, 4, 12, 13, 5, 13), Block.makeCuboidShape(12, 4, 3, 13, 5, 4), Block.makeCuboidShape(3, 4, 3, 4, 5, 4),
            Block.makeCuboidShape(1, 5, 3, 3, 14, 13), Block.makeCuboidShape(3, 5, 13, 13, 14, 15), Block.makeCuboidShape(13, 5, 3, 15, 14, 13), Block.makeCuboidShape(3, 5, 1, 13, 14, 3), Block.makeCuboidShape(2, 5, 2, 3, 14, 3), Block.makeCuboidShape(13, 5, 13, 14, 14, 14), Block.makeCuboidShape(13, 5, 2, 14, 14, 3), Block.makeCuboidShape(2, 5, 13, 3, 14, 14),
            Block.makeCuboidShape(3, 14, 12, 4, 15, 13), Block.makeCuboidShape(4, 14, 12, 12, 15, 14), Block.makeCuboidShape(12, 14, 12, 13, 15, 13), Block.makeCuboidShape(2, 14, 4, 4, 15, 12), Block.makeCuboidShape(3, 14, 3, 4, 15, 4), Block.makeCuboidShape(4, 14, 2, 12, 15, 4), Block.makeCuboidShape(12, 14, 3, 13, 15, 4), Block.makeCuboidShape(12, 14, 4, 14, 15, 12),
            Block.makeCuboidShape(4, 15, 11, 5, 16, 12), Block.makeCuboidShape(3, 15, 5, 5, 16, 11), Block.makeCuboidShape(4, 15, 4, 5, 16, 5), Block.makeCuboidShape(5, 15, 3, 11, 16, 5), Block.makeCuboidShape(11, 15, 4, 12, 16, 5), Block.makeCuboidShape(5, 15, 11, 11, 16, 13), Block.makeCuboidShape(11, 15, 11, 12, 16, 12), Block.makeCuboidShape(11, 15, 5, 13, 16, 11),
            Block.makeCuboidShape(6, 16, 4, 10, 17, 6), Block.makeCuboidShape(10, 16, 6, 12, 17, 10), Block.makeCuboidShape(6, 16, 10, 10, 17, 12), Block.makeCuboidShape(4, 16, 6, 6, 17, 10), Block.makeCuboidShape(5, 16, 10, 6, 17, 11), Block.makeCuboidShape(5, 16, 5, 6, 17, 6), Block.makeCuboidShape(10, 16, 5, 11, 17, 6), Block.makeCuboidShape(6, 17, 6, 10, 18, 10),
            Block.makeCuboidShape(10, 16, 10, 11, 17, 11), Block.makeCuboidShape(5, 3, 5, 11, 4, 11), Block.makeCuboidShape(8, 4, 8, 9, 5, 9), Block.makeCuboidShape(8, 6, 8, 9, 7, 9), Block.makeCuboidShape(8, 7, 8, 9, 8, 9), Block.makeCuboidShape(8, 8, 7, 9, 9, 8), Block.makeCuboidShape(8, 5, 8, 9, 6, 9), Block.makeCuboidShape(8, 7, 6, 9, 8, 7)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public SnowGlobe() {
        super(Block.Properties.create(Material.GLASS)
            .hardnessAndResistance(0.3f)
            .harvestLevel(0)
            .sound(SoundType.GLASS)
            .lightValue(7)
            .tickRandomly());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
