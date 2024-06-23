package com.example.messageping;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.server.ServerTickCallback;
import net.minecraft.server.MinecraftServer;

public class MessagePingMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerTickCallback.EVENT.register(server -> {
            server.getPlayerManager().getPlayerList().forEach(player -> {
                // 播放声音命令
                server.getCommandManager().execute(server.getCommandSource(), "/playsound minecraft:block.note_block.pling master @a ~ ~ ~ 99999999999999999999999999999999999999 2");
            });
        });
    }
}
