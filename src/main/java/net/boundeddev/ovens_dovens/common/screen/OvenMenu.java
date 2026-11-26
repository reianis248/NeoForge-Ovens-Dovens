package net.boundeddev.ovens_dovens.common.screen;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipeType;

public class OvenMenu extends AbstractFurnaceMenu {
    // Client constructor (used by IMenuTypeExtension)
    public OvenMenu(int containerId, Inventory playerInventory) {
        super(DovensMenuTypes.OVEN_MENU.get(), RecipeType.SMOKING, RecipeBookType.SMOKER, containerId, playerInventory);
    }

    // Server constructor (used by OvenBlockEntity)
    public OvenMenu(int containerId, Inventory playerInventory, Container container, ContainerData data) {
        super(DovensMenuTypes.OVEN_MENU.get(), RecipeType.SMOKING, RecipeBookType.SMOKER, containerId, playerInventory, container, data);
    }
}