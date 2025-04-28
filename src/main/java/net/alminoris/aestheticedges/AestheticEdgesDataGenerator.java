package net.alminoris.aestheticedges;

import net.alminoris.aestheticedges.datagen.ModBlockTagProvider;
import net.alminoris.aestheticedges.datagen.ModLootTableProvider;
import net.alminoris.aestheticedges.datagen.ModModelProvider;
import net.alminoris.aestheticedges.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticEdgesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}