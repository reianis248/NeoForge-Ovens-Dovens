package net.boundeddev.ovens_dovens.common.item.properties;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ItemProperties {
    public static Item.Properties cutFood(FoodProperties foodProperties) {
        return new Item.Properties()
                .food(foodProperties);
    }
    public static Item.Properties dishItem (FoodProperties foodProperties) {
        return new Item.Properties()
                .food(foodProperties);
    }
}
