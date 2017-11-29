package net.fluxdoctor.nullcraft.content.tile;

import net.fluxdoctor.nullcraft.content.base.NullTile;
import net.minecraft.world.World;

public class TileGrowthPlus extends NullTile
{

 private int EffectTier;

 //Constructor
 public TileGrowthPlus(int tier)
 {
  this.EffectTier = tier;
 }

 public int getZCoord()
 {
  return this.zCoord;
 }

 public int getYCoord()
 {
  return this.yCoord;
 }

 public int getXCoord()
 {
  return this.xCoord;
 }

 public World getWorld()
 {
  return this.worldObj;
 }

 public int getTier()
 {
  return this.EffectTier;
 }



}
