package com.losysamman960.wintermod.items;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.util.enums.ModItemTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class FrozenSword extends SwordItem {

    public FrozenSword() {
        super(ModItemTier.FROZEN_SWORD, 0, -2.5f, new Properties().group(TheWinteryYear.TAB));
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A7b" + "This sword gives slowness to any entity you hit"));
    }
}
