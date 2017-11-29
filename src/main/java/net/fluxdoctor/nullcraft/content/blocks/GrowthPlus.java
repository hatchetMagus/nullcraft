package net.fluxdoctor.nullcraft.content.blocks;

import net.fluxdoctor.nullcraft.content.base.NullBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GrowthPlus extends NullBlock implements ITileEntityProvider
{

 private int BlockTier;

 public GrowthPlus(Material material, String name, int tier)
 {
  super(material);
  this.setBlockName(name);
  this.BlockTier = tier;
 }

 public int getBlockTier()
 {
  return this.BlockTier;
 }

 @Override
 public TileEntity createNewTileEntity(World world, int meta) {
  return null;
 }
}
