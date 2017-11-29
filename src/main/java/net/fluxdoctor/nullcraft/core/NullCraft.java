package net.fluxdoctor.nullcraft.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.MOD_VERSION)
public class NullCraft
{

 @Instance(reference.MOD_ID)
 public static NullCraft instance;

 @SidedProxy(clientSide = "net.fluxdoctor.nullcraft.core.ClientOnlyProxy", serverSide = "net.fluxdoctor.nullcraft.core.CommonProxy")
 public static CommonProxy proxy;

 @EventHandler
 public void preInit(FMLPreInitializationEvent event)
 {

 }

 @EventHandler
 public void init(FMLInitializationEvent event)
 {

 }

 @EventHandler
 public void postInit(FMLPostInitializationEvent event)
 {

 }


}
