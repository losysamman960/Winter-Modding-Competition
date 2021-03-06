package com.losysamman960.wintermod.util;

import com.losysamman960.wintermod.TheWinteryYear;
import com.losysamman960.wintermod.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = TheWinteryYear.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.ICY_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICY_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICY_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOW_GLOBE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTALIZED_SNOW.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICY_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICY_TRAPDOR.get(), RenderType.getCutout());
    }
}
