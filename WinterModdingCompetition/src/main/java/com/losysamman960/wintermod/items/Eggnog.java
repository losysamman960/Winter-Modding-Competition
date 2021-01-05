package com.losysamman960.wintermod.items;

import com.losysamman960.wintermod.TheWinteryYear;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;

public class Eggnog extends Item {

    public Eggnog() {
        super(new Item.Properties()
                .group(TheWinteryYear.TAB)
                .food(new Food.Builder()
                        .saturation(6)
                        .hunger(2)
                        .effect(() -> new EffectInstance(Effects.RESISTANCE, 20 * 120, 1), 1.0f)
                        .build()));
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return 16;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.getFluidState(this.onItemRightClick()))
    }*/
}
