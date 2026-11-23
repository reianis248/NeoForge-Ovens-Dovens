package net.boundeddev.ovens_dovens.common.data.providers;

import net.boundeddev.ovens_dovens.OvensDovens;
import net.boundeddev.ovens_dovens.common.item.registries.CutFruits;
import net.boundeddev.ovens_dovens.common.item.registries.DovenCookingTools;
import net.boundeddev.ovens_dovens.common.item.registries.DovenDishes;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class OvensDovensItemModelProvider extends ItemModelProvider {
    public OvensDovensItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OvensDovens.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        basicItem(CutFruits.CUT_APPLE.get());
//        basicItem(DovenDishes.SOUR_PORK_AND_APPLE_SAUCE_DISH.get());

//        handheldItem(DovenCookingTools.STONE_KNIFE.get());
//        handheldItem(DovenCookingTools.STONE_CLEAVER.get());

//        handheldItem(DovenCookingTools.COPPER_KNIFE.get());
//        handheldItem(DovenCookingTools.COPPER_CLEAVER.get());

//        handheldItem(DovenCookingTools.IRON_KNIFE.get());
//        handheldItem(DovenCookingTools.IRON_CLEAVER.get());
        
        basicItem(MiscItems.COPPER_NUGGET.get());
    }
}
