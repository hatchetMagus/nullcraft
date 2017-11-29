package net.fluxdoctor.nullcraft.core.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.fluxdoctor.nullcraft.core.GameObjects;

public class CommonProxy implements IProxy {
 @Override
 public void preInit(FMLPreInitializationEvent event) {
  GameObjects.initGameObjects();
 }

 @Override
 public void init(FMLInitializationEvent event) {

 }

 @Override
 public void postInit(FMLPostInitializationEvent event) {

 }

 @Override
 public void registerRenderers() {

 }
}
