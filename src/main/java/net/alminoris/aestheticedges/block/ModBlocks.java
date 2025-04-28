package net.alminoris.aestheticedges.block;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.custom.YAxisRotatedBlock;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.BlockShape;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> CURBSTONES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, Block> CURBSTONES_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_inner_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 8, 8), new BlockShape(8, 0, 0, 16, 8, 16))));
        }
    }};

    public static final Dictionary<String, Block> CURBSTONES_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_outer_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, Block> HIGH_CURBSTONES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 16, 8))));
        }
    }};

    public static final Dictionary<String, Block> HIGH_CURBSTONES_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_inner_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 16, 8), new BlockShape(8, 0, 0, 16, 16, 16))));
        }
    }};

    public static final Dictionary<String, Block> HIGH_CURBSTONES_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("curbstone_high_outer_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 16, 8))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CURBS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CURBS_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_inner_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(0, 0, 0, 8, 8, 8), new BlockShape(8, 0, 0, 16, 8, 16))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CURBS_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("simple_curb_outer_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.STONE),
                    new BlockShape(8, 0, 0, 16, 8, 8))));
        }
    }};

    public static final Dictionary<String, Block> BASEBOARDS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
                    new BlockShape(0, 0, 0, 16, 3, 3))));
        }
    }};

    public static final Dictionary<String, Block> BASEBOARDS_INNER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_inner_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
                    new BlockShape(0, 0, 0, 16, 3, 3), new BlockShape(13, 0, 0, 16, 3, 16))));
        }
    }};

    public static final Dictionary<String, Block> BASEBOARDS_OUTER = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("baseboard_outer_"+name, new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
                    new BlockShape(13, 0, 0, 16, 3, 3))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticEdges.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticEdges.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}