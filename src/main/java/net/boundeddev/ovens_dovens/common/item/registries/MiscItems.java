package net.boundeddev.ovens_dovens.common.item.registries;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.properties.ModFoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CutFruits {
    public static final DeferredRegister.Items MISCITEM = DeferredRegister.createItems(OvensDovens.MOD_ID);

    public static final DeferredItem<Item> COPPER_NUGGET = MISCITEM.register(
            "copper_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        MISCITEM.register(eventBus);
    }
}
