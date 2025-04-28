package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "minecraft");
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "aestheticedges");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "minecraft");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }
    }

    public final void registerEdge(BlockStateModelGenerator blockStateModelGenerator, String jsonContext, Block curbstone, String name, String modId)
    {
        ModJsonHelper.createBlockModel(jsonContext, Registries.BLOCK.getId(curbstone).getPath(),modId+":block/"+name);
        ModJsonHelper.createYAxisRotatedBlockState(Registries.BLOCK.getId(curbstone).getPath());
        blockStateModelGenerator.registerParentedItemModel(curbstone, Identifier.of(AestheticEdges.MOD_ID, "block/"+Registries.BLOCK.getId(curbstone).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}