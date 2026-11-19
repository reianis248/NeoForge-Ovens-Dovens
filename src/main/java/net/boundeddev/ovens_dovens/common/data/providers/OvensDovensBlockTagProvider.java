package net.boundeddev.ovens_dovens.common.data.providers;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.core.util.OvensDovensTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OvensDovensBlockTagProvider extends BlockTagsProvider {
    public OvensDovensBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OvensDovens.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(OvensDovensTags.Blocks.BASE_STONE)
                .add(Blocks.STONE)
                .add(Blocks.COBBLESTONE);

        tag(OvensDovensTags.Blocks.BASE_COPPER)
                .add(Blocks.COPPER_BLOCK);

        tag(OvensDovensTags.Blocks.BASE_IRON)
                .add(Blocks.IRON_BLOCK);
    }
}
