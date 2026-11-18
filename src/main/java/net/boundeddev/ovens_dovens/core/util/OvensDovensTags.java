package net.boundeddev.ovens_dovens.core.util;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class OvensDovensTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OvensDovens.MOD_ID, name));
        }

    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(OvensDovens.MOD_ID, name));
        }

        public static final TagKey<Item> KNIVES = createTag("knives");
        public static final TagKey<Item> KNIVEABLE = createTag("kniveable");
    }
}
