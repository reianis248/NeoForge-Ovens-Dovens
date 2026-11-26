package net.boundeddev.ovens_dovens.common.block.registries.blockentity;

import net.boundeddev.ovens_dovens.common.screen.OvenMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OvenBlockEntity extends AbstractFurnaceBlockEntity {
    public OvenBlockEntity(BlockPos pos, BlockState state) {
        // Use RecipeType.SMOKING for food-only, or replace with your custom RecipeType
        super(DovensBlockEntities.OVEN_BE.get(), pos, state, RecipeType.SMOKING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.ovens_dovens.oven");
    }

    @Override
    protected int getBurnDuration(ItemStack fuel) {
        // Optional: divide by 2 to burn fuel twice as fast as a regular furnace
        return super.getBurnDuration(fuel) / 2;
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory playerInventory) {
        return new OvenMenu(containerId, playerInventory, this, this.dataAccess);
    }
}