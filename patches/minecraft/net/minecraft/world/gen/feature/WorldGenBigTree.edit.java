
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  4 : 5  @  4 : 5

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> DELETE  9  @  9 : 10

> CHANGE  2 : 3  @  2 : 3

~ 	private EaglercraftRandom rand;

> CHANGE  37 : 39  @  37 : 39

~ 					double d0 = this.scaleWidth * (double) f * ((double) rand.nextFloat() + 0.328D);
~ 					double d1 = (double) (rand.nextFloat() * 2.0F) * 3.141592653589793D;

> CHANGE  111 : 113  @  111 : 113

~ 		for (int i = 0, l = this.field_175948_j.size(); i < l; ++i) {
~ 			this.generateLeafNode(this.field_175948_j.get(i));

> CHANGE  22 : 24  @  22 : 23

~ 		for (int j = 0, l = this.field_175948_j.size(); j < l; ++j) {
~ 			WorldGenBigTree.FoliageCoordinates worldgenbigtree$foliagecoordinates = this.field_175948_j.get(j);

> CHANGE  35 : 36  @  35 : 36

~ 	public boolean generate(World worldIn, EaglercraftRandom rand, BlockPos position) {

> CHANGE  2 : 3  @  2 : 3

~ 		this.rand = new EaglercraftRandom(rand.nextLong());

> EOF
