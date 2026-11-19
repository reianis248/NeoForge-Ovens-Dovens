package net.boundeddev.ovens_dovens.common.item.properties;

import net.boundeddev.ovens_dovens.core.util.OvensDovensTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class DovenKnifeTiers {
    public static final Tier STONE = new SimpleTier(BlockTags.INCORRECT_FOR_STONE_TOOL,
            100,
            0.2f,
            0.14f,
            0,
            () -> Ingredient.of(OvensDovensTags.Items.BASE_STONE));
    public static final Tier COPPER = new SimpleTier(OvensDovensTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            250,
            0.4f,
            0.17f,
            0,
            () -> Ingredient.of(OvensDovensTags.Items.BASE_COPPER));
    public static final Tier IRON = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            525,
            0.2f,
            0.24f,
            0,
            () -> Ingredient.of(OvensDovensTags.Items.BASE_IRON));
}