package net.londonunderground.packet;

import mtr.data.Depot;
import mtr.data.NameColorDataBase;
import mtr.gui.ClientData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.londonunderground.gui.EditSoundTimerScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class PacketTrainDataGuiClient extends PacketTrainDataBase {

    public static void sendSoundTimerC2S(BlockPos pos, String message) {
        final PacketByteBuf packet = PacketByteBufs.create();
        packet.writeBlockPos(pos);
        packet.writeString(message);
        ClientPlayNetworking.send(PACKET_SOUND_TIMER_UPDATE, packet);
    }
    public static void openSoundTimerScreenS2C(MinecraftClient minecraftClient, PacketByteBuf packet) {
        final BlockPos pos = packet.readBlockPos();
        minecraftClient.execute(() -> {
            if (!(minecraftClient.currentScreen instanceof EditSoundTimerScreen)) {
                minecraftClient.openScreen(new EditSoundTimerScreen(pos));
            }
        });
    }



}