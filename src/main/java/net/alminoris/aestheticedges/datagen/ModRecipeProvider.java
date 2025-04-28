package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES_INNER.get(name), block, 2);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES.get(name), block, 2);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES_INNER.get(name), block, 1);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS_OUTER.get(name), block, 8);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS_INNER.get(name), block, 2);
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES_INNER.get(name)).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_OUTER.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_INNER.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS_OUTER.get(name)).getPath(), "8");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS_INNER.get(name), block, 2);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }
    }
}