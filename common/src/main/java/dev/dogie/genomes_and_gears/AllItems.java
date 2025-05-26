package dev.dogie.genomes_and_gears;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class AllItems {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(Constants.MOD_ID);

    public static final ItemEntry<Item> NEEDLE = ingredient("needle"),
            GLOWSTONE_ALLOY = ingredient("glowstone_alloy"),
            BRIGHT_ELECTRON_TUBE = ingredient("bright_electron_tube"),
            POLISHED_AMETHYST = ingredient("polished_amethyst"),
            STAINLESS_STEEL_INGOT = ingredient("stainless_steel_ingot");

    private static ItemEntry<Item> ingredient(String name) {
        return REGISTRATE.item(name, Item::new)
                .register();
    }

    private static ItemEntry<SequencedAssemblyItem> sequencedIngredient(String name) {
        return REGISTRATE.item(name, SequencedAssemblyItem::new)
                .register();
    }

    // Load this class
    public static void register() {
    }
}
