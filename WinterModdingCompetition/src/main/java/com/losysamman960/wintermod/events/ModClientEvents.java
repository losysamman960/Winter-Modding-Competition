package com.losysamman960.wintermod.events;

import com.losysamman960.wintermod.TheWinteryYear;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheWinteryYear.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    /*@SubscribeEvent
    public static void onItemRightClick( event) {
        if (event.getPlayer())
    }*/
}
