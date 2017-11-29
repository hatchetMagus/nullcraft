package net.fluxdoctor.nullcraft.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class NullcraftConfig
{

 public static Configuration config;

 public static void init(File configFile)
 {
  config = new Configuration(configFile);
  try
  {
   config.load();
  }catch (Exception e)
  {
   NullCraft.logger.error("Problems loading config, please delete old and restart Minecraft");
  }finally
  {
   config.save();
  }
 }

 public static void sync()
 {
  //Config File Controlled Fields


  //ClientSide Only Config Options
  Side side = FMLCommonHandler.instance().getSide();
  if(side == Side.CLIENT)
  {

  }

  //save config
  config.save();
 }

 public static void set(String category, String prop, String newVal)
 {
  config.load();
  if(config.getCategoryNames().contains(category))
  {
   if(config.getCategory(category).containsKey(prop))
   {
    config.getCategory(category).get(prop).set(newVal);
   }
  }
  config.save();
 }

}
