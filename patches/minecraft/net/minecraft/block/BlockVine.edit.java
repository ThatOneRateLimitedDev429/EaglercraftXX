
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 4

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ 

> CHANGE  146 : 150  @  146 : 147

~ 		BlockPos tmp = new BlockPos(0, 0, 0);
~ 		EnumFacing[] facings = EnumFacing.Plane.HORIZONTAL.facingsArray;
~ 		for (int i = 0; i < facings.length; ++i) {
~ 			EnumFacing enumfacing = facings[i];

> CHANGE  2 : 4  @  2 : 4

~ 					&& !this.canPlaceOn(worldIn.getBlockState(pos.offsetEvenFaster(enumfacing, tmp)).getBlock())) {
~ 				IBlockState iblockstate1 = worldIn.getBlockState(pos.offsetEvenFaster(EnumFacing.UP, tmp));

> CHANGE  38 : 39  @  38 : 39

~ 	public void updateTick(World world, BlockPos blockpos, IBlockState iblockstate, EaglercraftRandom random) {

> INSERT  22 : 23  @  22

+ 				BlockPos tmp = new BlockPos(0, 0, 0);

> CHANGE  4 : 9  @  4 : 7

~ 						EnumFacing[] facings = EnumFacing.Plane.HORIZONTAL.facingsArray;
~ 						for (int j = 0; j < facings.length; ++j) {
~ 							EnumFacing enumfacing3 = facings[j];
~ 							if (random.nextBoolean() || !this.canPlaceOn(
~ 									world.getBlockState(blockpos2.offsetEvenFaster(enumfacing3, tmp)).getBlock())) {

> CHANGE  33 : 35  @  33 : 35

~ 							} else if (flag1 && world.isAirBlock(blockpos5) && this.canPlaceOn(
~ 									world.getBlockState(blockpos.offsetEvenFaster(enumfacing2, tmp)).getBlock())) {

> CHANGE  2 : 4  @  2 : 4

~ 							} else if (flag2 && world.isAirBlock(blockpos1) && this.canPlaceOn(
~ 									world.getBlockState(blockpos.offsetEvenFaster(enumfacing4, tmp)).getBlock())) {

> INSERT  16 : 17  @  16

+ 						EnumFacing[] facings = EnumFacing.Plane.HORIZONTAL.facingsArray;

> CHANGE  3 : 4  @  3 : 4

~ 							for (int j = 0; j < facings.length; ++j) {

> CHANGE  1 : 2  @  1 : 2

~ 									iblockstate2 = iblockstate2.withProperty(getPropertyFor(facings[j]),

> CHANGE  13 : 15  @  13 : 15

~ 							for (int j = 0; j < facings.length; ++j) {
~ 								PropertyBool propertybool = getPropertyFor(facings[j]);

> DELETE  14  @  14 : 15

> CHANGE  15 : 16  @  15 : 16

~ 	public Item getItemDropped(IBlockState var1, EaglercraftRandom var2, int var3) {

> CHANGE  3 : 4  @  3 : 4

~ 	public int quantityDropped(EaglercraftRandom var1) {

> CHANGE  70 : 72  @  70 : 72

~ 		for (int j = 0; j < ALL_FACES.length; ++j) {
~ 			if (((Boolean) state.getValue(ALL_FACES[j])).booleanValue()) {

> EOF
