package net.boundeddev.ovens_dovens.common.data.providers;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.core.util.OvensDovensTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OvensDovensItemTagProvider extends ItemTagsProvider {

    public OvensDovensItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, OvensDovens.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /**
        tag(OvensDovensTags.Items.KNIVES)
        **/

        tag(OvensDovensTags.Items.KNIVEABLE)
                .add(Items.APPLE)
                .addOptional(ResourceLocation.parse("camped:orange"));
    }
}
