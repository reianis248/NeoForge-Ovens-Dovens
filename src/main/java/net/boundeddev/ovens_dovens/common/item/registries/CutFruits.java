package net.boundeddev.ovens_dovens.common.item.registries;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.properties.ModFoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.boundeddev.ovens_dovens.common.item.properties.ItemProperties.cutFood;

public class CutFruits {
    public static final DeferredRegister.Items CUTFRUIT = DeferredRegister.createItems(OvensDovens.MOD_ID);

    public static final DeferredItem<Item> CUT_APPLE = CUTFRUIT.register(
            "cut_apple",
            () -> new Item(cutFood(ModFoodProperties.CUT_APPLE)));

    public static void register(IEventBus eventBus) {
        CUTFRUIT.register(eventBus);
    }
}
