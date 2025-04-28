package net.alminoris.aestheticedges;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItemGroups;
import net.alminoris.aestheticedges.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticEdges implements ModInitializer
{
	public static final String MOD_ID = "aestheticedges";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
	}
}