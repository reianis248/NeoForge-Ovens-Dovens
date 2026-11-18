package net.boundeddev.ovens_dovens.common.data;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.data.providers.OvensDovensBlockTagProvider;
import net.boundeddev.ovens_dovens.common.data.providers.OvensDovensItemModelProvider;
import net.boundeddev.ovens_dovens.common.data.providers.OvensDovensItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = OvensDovens.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

//        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
//                List.of(new LootTableProvider.SubProviderEntry(OvensDovensBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
//        generator.addProvider(event.includeServer(), new OvensDovensRecipeProvider(packOutput, lookupProvider));

//        generator.addProvider(event.includeClient(), new OvensDovensEnglishLanguageProvider(packOutput, "en_us"));

        BlockTagsProvider blockTagsProvider = new OvensDovensBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new OvensDovensItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new OvensDovensItemModelProvider(packOutput, existingFileHelper));
//        generator.addProvider(event.includeClient(), new OvensDovensBlockStateProvider(packOutput, existingFileHelper));
    }
}
