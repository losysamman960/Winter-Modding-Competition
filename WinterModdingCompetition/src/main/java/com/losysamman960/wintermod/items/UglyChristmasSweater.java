package com.losysamman960.wintermod.items;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.util.enums.ModArmorMaterial;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class UglyChristmasSweater extends ArmorItem {

    public UglyChristmasSweater() {
        super(ModArmorMaterial.UGLY_CHRISTMAS_SWEATER, EquipmentSlotType.CHEST, new Properties().group(TheWinteryYear.TAB));
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
                tooltip.add(new StringTextComponent("\u00A7c" + "This doesn't actually do anything"));
            }
            else
            {
                tooltip.add(new StringTextComponent("\u00A7c" + "This sweater keeps you warm in cold areas"));
                tooltip.add(new StringTextComponent("Hold Shift for more information"));
            }
    }
}
