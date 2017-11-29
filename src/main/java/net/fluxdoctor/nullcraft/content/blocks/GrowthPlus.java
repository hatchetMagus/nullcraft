package net.fluxdoctor.nullcraft.content.blocks;

import net.fluxdoctor.nullcraft.content.base.NullBlock;
import net.fluxdoctor.nullcraft.content.tile.TileEffect;
import net.fluxdoctor.nullcraft.core.reference;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GrowthPlus extends NullBlock implements ITileEntityProvider
{

 private int cd;

 public GrowthPlus(Material material, String name, int cooldown)
 {
  super(material);
  this.setBlockName(name);
  this.cd = cooldown;

  this.setBlockTextureName(reference.MOD_ID + ":" + name);
 }


 @Override
 public TileEntity createNewTileEntity(World world, int meta) {
  return new TileEffect(true, cd);
 }
}
