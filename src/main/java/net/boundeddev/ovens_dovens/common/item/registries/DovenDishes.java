package net.boundeddev.ovens_dovens.common.item.registries;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.properties.ModFoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.boundeddev.ovens_dovens.common.item.properties.DovenProperties.dishItem;

public class DovenDishes {
    public static final DeferredRegister.Items DOVENDISHES = DeferredRegister.createItems(OvensDovens.MOD_ID);

    public static final DeferredItem<Item> SOUR_PORK_AND_APPLE_SAUCE_DISH = DOVENDISHES.register(
            "sour_pork_and_apple_sauce_dish",
            () -> new Item(dishItem(ModFoodProperties.SOUR_PORK_AND_APPLE_SAUCE)));


    public static void register(IEventBus eventBus) {
        DOVENDISHES.register(eventBus);
    }
}
