package net.boundeddev.ovens_dovens.common.item.registries;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.properties.DovenKnifeTiers;
import net.boundeddev.ovens_dovens.common.item.properties.KnifeItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DovenCookingTools {
    public static final DeferredRegister.Items COOKINGTOOL = DeferredRegister.createItems(OvensDovens.MOD_ID);

    public static final DeferredItem<KnifeItem> STONE_KNIFE = COOKINGTOOL.register(
            "stone_knife",
            () -> new KnifeItem(DovenKnifeTiers.STONE, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.STONE,
                            1.2f,
                            0.2f))));
    public static final DeferredItem<KnifeItem> STONE_CLEAVER = COOKINGTOOL.register(
            "stone_cleaver",
            () -> new KnifeItem(DovenKnifeTiers.STONE, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.STONE,
                            1.8f,
                            0.2f))));

    public static final DeferredItem<KnifeItem> COPPER_KNIFE = COOKINGTOOL.register(
            "copper_knife",
            () -> new KnifeItem(DovenKnifeTiers.COPPER, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.COPPER,
                            1.2f,
                            0.2f))));
    public static final DeferredItem<KnifeItem> COPPER_CLEAVER = COOKINGTOOL.register(
            "copper_cleaver",
            () -> new KnifeItem(DovenKnifeTiers.COPPER, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.COPPER,
                            1.8f,
                            0.2f))));

    public static final DeferredItem<KnifeItem> IRON_KNIFE = COOKINGTOOL.register(
            "iron_knife",
            () -> new KnifeItem(DovenKnifeTiers.IRON, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.IRON,
                            1.2f,
                            0.2f))));
    public static final DeferredItem<KnifeItem> IRON_CLEAVER = COOKINGTOOL.register(
            "iron_cleaver",
            () -> new KnifeItem(DovenKnifeTiers.IRON, new Item.Properties()
                    .attributes(KnifeItem.createAttributes(
                            DovenKnifeTiers.IRON,
                            1.8f,
                            0.2f))));


    public static void register(IEventBus eventBus) {
        COOKINGTOOL.register(eventBus);
    }
}
