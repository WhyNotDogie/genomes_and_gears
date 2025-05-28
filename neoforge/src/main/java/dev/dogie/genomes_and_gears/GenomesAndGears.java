package dev.dogie.genomes_and_gears;


import dev.dogie.genomes_and_gears.neoforge.NeoForgeCreativeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GenomesAndGears {

    public GenomesAndGears(IEventBus eventBus) {
        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");

        AllItems.REGISTRATE.setCreativeTab(null);
        AllItems.REGISTRATE.registerEventListeners(eventBus);

        CommonClass.init();
//        Uncomment to watch death and destruction unfold
//        NeoForgeCreativeTabs.register(eventBus);
    }
}