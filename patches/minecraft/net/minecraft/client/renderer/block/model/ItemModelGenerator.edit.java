
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 4

> CHANGE  3 : 9  @  3 : 9

~ 
~ import com.google.common.collect.Lists;
~ import com.google.common.collect.Maps;
~ 
~ import net.lax1dude.eaglercraft.v1_8.minecraft.EaglerTextureAtlasSprite;
~ import net.lax1dude.eaglercraft.v1_8.vector.Vector3f;

> DELETE  3  @  3 : 4

> CHANGE  17 : 19  @  17 : 18

~ 			EaglerTextureAtlasSprite textureatlassprite = textureMapIn
~ 					.getAtlasSprite((new ResourceLocation(s1)).toString());

> CHANGE  12 : 14  @  12 : 13

~ 	private List<BlockPart> func_178394_a(int parInt1, String parString1,
~ 			EaglerTextureAtlasSprite parTextureAtlasSprite) {

> CHANGE  12 : 14  @  12 : 13

~ 	private List<BlockPart> func_178397_a(EaglerTextureAtlasSprite parTextureAtlasSprite, String parString1,
~ 			int parInt1) {

> CHANGE  4 : 7  @  4 : 5

~ 		List<ItemModelGenerator.Span> lst = this.func_178393_a(parTextureAtlasSprite);
~ 		for (int i = 0, l = lst.size(); i < l; ++i) {
~ 			ItemModelGenerator.Span itemmodelgenerator$span = lst.get(i);

> CHANGE  97 : 98  @  97 : 98

~ 	private List<ItemModelGenerator.Span> func_178393_a(EaglerTextureAtlasSprite parTextureAtlasSprite) {

> CHANGE  35 : 37  @  35 : 36

~ 		for (int j = 0, l = parList.size(); j < l; ++j) {
~ 			ItemModelGenerator.Span itemmodelgenerator$span1 = parList.get(j);

> EOF
