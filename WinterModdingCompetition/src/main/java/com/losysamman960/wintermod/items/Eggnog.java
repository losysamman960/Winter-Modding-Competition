package com.losysamman960.wintermod.items;

import com.losysamman960.wintermod.TheWinteryYear;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

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
}
