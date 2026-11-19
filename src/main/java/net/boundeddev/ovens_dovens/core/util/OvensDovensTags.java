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

        public static final TagKey<Block> BASE_STONE = createTag("base_stone");
        public static final TagKey<Block> BASE_COPPER = createTag("base_copper");
        public static final TagKey<Block> BASE_IRON = createTag("base_iron");

        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(OvensDovens.MOD_ID, name));
        }

        public static final TagKey<Item> KNIVES = createTag("knives");
        public static final TagKey<Item> CLEAVERS = createTag("cleavers");
        public static final TagKey<Item> KNIVEABLE = createTag("kniveable");
        public static final TagKey<Item> BASE_STONE = createTag("base_stone");
        public static final TagKey<Item> BASE_COPPER = createTag("base_copper");
        public static final TagKey<Item> BASE_IRON = createTag("base_iron");

    }
}
