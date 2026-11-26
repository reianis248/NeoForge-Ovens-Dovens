package net.boundeddev.ovens_dovens.common.block.registries.blockentity;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DovensBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCKENTITY =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, OvensDovens.MOD_ID);

    // Register your Oven Block Entity here
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OvenBlockEntity>> OVEN_BE =
            BLOCKENTITY.register("oven_be", () ->
                    BlockEntityType.Builder.of(OvenBlockEntity::new, ModBlocks.OVEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCKENTITY.register(eventBus);
    }
}