package net.fluxdoctor.nullcraft.core;

import java.io.File;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.MOD_VERSION)
public class NullCraft
{

 @Instance(reference.MOD_ID)
 public static NullCraft instance;

 @SidedProxy(clientSide = "net.fluxdoctor.nullcraft.core.ClientOnlyProxy", serverSide = "net.fluxdoctor.nullcraft.core.CommonProxy")
 public static CommonProxy proxy;

 //logger init
 public static Logger logger = LogManager.getLogger(reference.MOD_NAME);


 @EventHandler
 public void preInit(FMLPreInitializationEvent event)
 {
  logger.info("Hello! -- THIS IS PRE_INIT PHASE");
  //Load Config Stuff
  NullcraftConfig.init(new File(event.getModConfigurationDirectory(), "nullcraft.cfg"));

  proxy.proxyPreInit(event);
 }

 @EventHandler
 public void init(FMLInitializationEvent event)
 {
  logger.info("Hello! -- THIS IS INIT PHASE");
  proxy.proxyInit(event);
 }

 @EventHandler
 public void postInit(FMLPostInitializationEvent event)
 {
  logger.info("Hello! -- THIS IS POST_INIT PHASE");
  proxy.proxyPostInit(event);
 }


}
