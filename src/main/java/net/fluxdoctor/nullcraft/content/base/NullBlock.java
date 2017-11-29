package net.fluxdoctor.nullcraft.content.base;

import net.fluxdoctor.nullcraft.core.NullCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NullBlock extends Block
{

 public NullBlock(Material material)
 {
  super(material);
  this.setCreativeTab(NullCraft.tabNullcraft);
 }

}
