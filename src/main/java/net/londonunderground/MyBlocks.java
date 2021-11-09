package net.londonunderground;

import mtr.Blocks;
import mtr.block.BlockPlatform;
import net.londonunderground.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public interface MyBlocks extends Blocks {
    Block PLATFORM_TFL_1 = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), true);
    Block PLATFORM_TFL_GAP = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), true);
    Block PLATFORM_BLOCK = new TFLBlock(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2));
    Block TUNNEL_DARKNESS = new TunnelDarknessBlock(FabricBlockSettings.of(Material.STONE, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TFL_BLOCK = new TFLBlock(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2));
    //Block SOUND_TIMER = new SoundTimer(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.SMOOTH_STONE));
    Block SOUND_OUTSIDE_AMBIENCE = new SoundOutsideAmbience(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2));
    Block TUBE_STATION_AMBIENCE1 = new SoundTubeStationAmbience1(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2));
    Block SOUND_SEE_IT_SAY_IT_SORTED = new SoundSeeItSayItSorted(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2));
    Block STATION_LIGHT = new StationLight(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).luminance(15).nonOpaque());
    Block EXIT_SIGN = new ExitSign(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).luminance(15));
    Block TUNNEL_ENTRANCE_1 = new TunnelEntrance1(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_0 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().noCollision().nonOpaque());
    Block TUNNEL_BLOCK_1 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_1_DUEL = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_2 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_2_SIGNAL = new BlockTunnelSignal(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_2_DUEL = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_3 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_3_DUEL = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_4 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUNNEL_BLOCK_5 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TUBE_0 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).hardness(2).nonOpaque());
    Block TUBE_1 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).luminance(0).hardness(2).nonOpaque());
    Block TUBE_2 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).luminance(0).requiresTool().hardness(2).nonOpaque());
    Block TUBE_3 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).luminance(0).requiresTool().hardness(2).nonOpaque());
    Block NORTHERN_PIDS = new NorthernLinePIDS();
    Block TRACK_1 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block TRACK_2 = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block MORDEN_STAIRS = new StairBlockExtends(TFL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block MORDEN_STONE = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    SlabBlock MORDEN_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block MORDEN_COBBLESTONE = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block MORDEN_ARCH = new BlockTunnel(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block MORDEN_SIGN = new MordenSign(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).luminance(10).hardness(2).nonOpaque());
    Block MORDEN_STEPS = new StairBlockExtends(TFL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block LU_POLE = new TFLBlock(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
    Block LU_CROSSBAR = new TFLBlock(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
}
