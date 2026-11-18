package net.boundeddev.ovens_dovens.common.item.properties;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CUT_APPLE = (new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.18f)
            .fast()
            .alwaysEdible()
            .build());
    public static final FoodProperties SOUR_PORK_AND_APPLE_SAUCE = (new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build());
}
