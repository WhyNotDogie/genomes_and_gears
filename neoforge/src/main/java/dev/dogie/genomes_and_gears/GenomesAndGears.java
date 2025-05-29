package dev.dogie.genomes_and_gears;


import dev.dogie.genomes_and_gears.neoforge.NeoForgeCreativeTabs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static dev.dogie.genomes_and_gears.CommonClass.REGISTRATE;

@Mod(Constants.MOD_ID)
public class GenomesAndGears {

    public GenomesAndGears(IEventBus eventBus) {
        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");

        REGISTRATE.defaultCreativeTab(NeoForgeCreativeTabs.MAIN_TAB, "base");
        REGISTRATE.registerEventListeners(eventBus);

        CommonClass.init();
        NeoForgeCreativeTabs.register(eventBus);
    }
}