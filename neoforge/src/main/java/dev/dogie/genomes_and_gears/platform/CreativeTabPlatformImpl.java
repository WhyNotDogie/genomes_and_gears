package dev.dogie.genomes_and_gears.platform;

import dev.dogie.genomes_and_gears.neoforge.NeoForgeCreativeTabs;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeTabPlatformImpl implements CreativeTabPlatform {
    @Override
    public CreativeModeTab getMainTab() {
        return NeoForgeCreativeTabs.MAIN_TAB.get();
    }
}
