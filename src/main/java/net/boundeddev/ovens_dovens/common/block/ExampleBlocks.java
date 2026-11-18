package net.boundeddev.ovens_dovens.common.block;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.registries.CutFruits;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleBlocks {
    public static final DeferredRegister.Blocks BLOCK = DeferredRegister.createBlocks(OvensDovens.MOD_ID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock(
            "example_block",
            () -> new Block(BlockBehaviour.Properties.of()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCK.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        CutFruits.CUTFRUIT.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCK.register(eventBus);
    }
}
