package net.fluxdoctor.nullcraft.content.tile;

import net.fluxdoctor.nullcraft.content.base.NullTile;
import net.fluxdoctor.nullcraft.core.NullCraft;
import net.minecraft.world.World;

public class TileEffect extends NullTile
{

 private boolean ACTIVE;
 private int cooldown;
 public int runTime;
 //Constructor
 public TileEffect(boolean isOn, int cd)
 {
  ACTIVE = isOn;
  cooldown = cd;
  runTime = 0;
 }



 //Primary Entity Update Loop, Called at least 20/second
 @Override
 public void updateEntity()
 {
  World world = getWorld();
  if(world.isRemote) { return; }

  if(world.getChunkFromBlockCoords(xCoord, zCoord).isChunkLoaded)
  {
   if(!ACTIVE) { return; }
   if(ACTIVE) {
    int time = (int) (worldObj.getWorldTime() % 24000);
    if (time % getCooldown() == 0)
    {
     int out = time;
     NullCraft.logger.info("We have reached our objective: out contains: " + out);
    }
   }
  }






 }

 public void performEffect()
 {
  NullCraft.logger.info("Effects Are Being Called... CODE TODO");
 }

 public int getZCoord()
 {
  return zCoord;
 }

 public int getYCoord()
 {
  return yCoord;
 }

 public int getXCoord()
 {
  return xCoord;
 }

 public World getWorld()
 {
  return this.worldObj;
 }

 public int getCooldown()
 {
  return this.cooldown;
 }




}
