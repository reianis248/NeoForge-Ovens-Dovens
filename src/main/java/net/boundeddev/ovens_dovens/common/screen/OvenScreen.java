package net.boundeddev.ovens_dovens.common.screen;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmokingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class OvenScreen extends AbstractFurnaceScreen<OvenMenu> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("ovens_dovens", "textures/gui/container/oven.png");
    private static final ResourceLocation LIT_PROGRESS_SPRITE = ResourceLocation.withDefaultNamespace("container/smoker/lit_progress");
    private static final ResourceLocation BURN_PROGRESS_SPRITE = ResourceLocation.withDefaultNamespace("container/smoker/burn_progress");

    public OvenScreen(OvenMenu menu, Inventory playerInventory, Component title) {
        super(menu, new SmokingRecipeBookComponent(), playerInventory, title, TEXTURE, LIT_PROGRESS_SPRITE, BURN_PROGRESS_SPRITE);
    }
}