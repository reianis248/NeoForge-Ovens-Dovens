package net.boundeddev.ovens_dovens.common.screen;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DovensMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, OvensDovens.MOD_ID);

    // Register the Oven Menu type using IMenuTypeExtension for container syncing
    public static final DeferredHolder<MenuType<?>, MenuType<OvenMenu>> OVEN_MENU =
            MENUS.register("oven_menu", () ->
                    IMenuTypeExtension.create(OvenMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
