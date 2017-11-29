package net.fluxdoctor.nullcraft.core;

import cpw.mods.fml.common.registry.GameRegistry;
import net.fluxdoctor.nullcraft.content.blocks.GrowthPlus;
import net.fluxdoctor.nullcraft.content.tile.TileEffect;
import net.minecraft.block.material.Material;
import scala.xml.Null;

public class GameObjects
{
 //Blocks
 public static GrowthPlus growthplus_mk1;

 //Items

 public static void initGameObjects()
 {
  NullCraft.logger.info("Initializing Content");
  growthplus_mk1 = new GrowthPlus(Material.ground, "growthplus_mk1", 60);


  GameRegistry.registerBlock(growthplus_mk1, "growthplus_mk1");


  GameRegistry.registerTileEntity(TileEffect.class, "TileEffect");
 }

}
