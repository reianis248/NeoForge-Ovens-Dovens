package net.boundeddev.ovens_dovens.core;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.block.FruitBlocks;
import net.boundeddev.ovens_dovens.common.item.registries.CutFruits;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class OvensDovensCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OvensDovens.MOD_ID);

    public static final Supplier<CreativeModeTab> OVENS_DOVENS = CREATIVE_MODE_TABS.register("examplemod",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.ovens_dovens"))
                    .icon(() -> new ItemStack(CutFruits.CUT_APPLE.get()))
                    .displayItems(((parameters, output) -> {
                        output.accept(CutFruits.CUT_APPLE.get());
                        output.accept(FruitBlocks.EXAMPLE_BLOCK.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
