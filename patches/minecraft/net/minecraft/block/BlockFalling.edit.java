
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 4

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> CHANGE  28 : 29  @  28 : 29

~ 	public void updateTick(World world, BlockPos blockpos, IBlockState var3, EaglercraftRandom var4) {

> DELETE  3  @  3 : 4

> CHANGE  6 : 10  @  6 : 12

~ 				EntityFallingBlock entityfallingblock = new EntityFallingBlock(worldIn, (double) pos.getX() + 0.5D,
~ 						(double) pos.getY(), (double) pos.getZ() + 0.5D, worldIn.getBlockState(pos));
~ 				this.onStartFalling(entityfallingblock);
~ 				worldIn.spawnEntityInWorld(entityfallingblock);

> EOF
