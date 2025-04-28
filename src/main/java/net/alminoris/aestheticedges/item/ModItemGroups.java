package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup AEDGS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticEdges.MOD_ID, "aedgstab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aedgstab"))
                    .icon(() -> new ItemStack(Blocks.RED_CARPET)).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.CURBSTONES.get(name));
                            entries.add(ModBlocks.CURBSTONES_INNER.get(name));
                            entries.add(ModBlocks.CURBSTONES_OUTER.get(name));
                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.CURBSTONES.get(name));
                                entries.add(ModBlocks.CURBSTONES_INNER.get(name));
                                entries.add(ModBlocks.CURBSTONES_OUTER.get(name));
                            }
                        }
                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.HIGH_CURBSTONES.get(name));
                            entries.add(ModBlocks.HIGH_CURBSTONES_INNER.get(name));
                            entries.add(ModBlocks.HIGH_CURBSTONES_OUTER.get(name));
                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.HIGH_CURBSTONES.get(name));
                                entries.add(ModBlocks.HIGH_CURBSTONES_INNER.get(name));
                                entries.add(ModBlocks.HIGH_CURBSTONES_OUTER.get(name));
                            }
                        }
                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.SIMPLE_CURBS.get(name));
                            entries.add(ModBlocks.SIMPLE_CURBS_INNER.get(name));
                            entries.add(ModBlocks.SIMPLE_CURBS_OUTER.get(name));
                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.SIMPLE_CURBS.get(name));
                                entries.add(ModBlocks.SIMPLE_CURBS_INNER.get(name));
                                entries.add(ModBlocks.SIMPLE_CURBS_OUTER.get(name));
                            }
                        }
                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.BASEBOARDS.get(name));
                            entries.add(ModBlocks.BASEBOARDS_INNER.get(name));
                            entries.add(ModBlocks.BASEBOARDS_OUTER.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.BASEBOARDS.get(name));
                                entries.add(ModBlocks.BASEBOARDS_INNER.get(name));
                                entries.add(ModBlocks.BASEBOARDS_OUTER.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.BASEBOARDS.get(name));
                                entries.add(ModBlocks.BASEBOARDS_INNER.get(name));
                                entries.add(ModBlocks.BASEBOARDS_OUTER.get(name));
                            }
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}