package dev.dogie.genomes_and_gears.neoforge;

import dev.dogie.genomes_and_gears.AllItems;
import dev.dogie.genomes_and_gears.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.core.registries.Registries;

public class NeoForgeCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            TABS.register("base", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID))
                    .icon(AllItems.NEEDLE::asStack)
                    .displayItems((parameters, output) -> {
                        Constants.LOG.info("chat");
                        output.accept(AllItems.NEEDLE);
                        output.accept(AllItems.GLOWSTONE_ALLOY);
                        output.accept(AllItems.BRIGHT_ELECTRON_TUBE);
                        output.accept(AllItems.POLISHED_AMETHYST);
                        output.accept(AllItems.STAINLESS_STEEL_INGOT);
                        output.accept(AllItems.STAINLESS_STEEL_NUGGET);
                        output.accept(AllItems.STAINLESS_STEEL_ROD);
                    })
                    .build()
            );

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
