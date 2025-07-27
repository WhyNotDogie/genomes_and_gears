package dev.dogie.genomes_and_gears;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static dev.dogie.genomes_and_gears.CommonClass.REGISTRATE;

public class AllItems {
    // FIXME: Use Datagen
    public static final ItemEntry<Item> NEEDLE = ingredient("needle"),
            GLOWSTONE_ALLOY = ingredient("glowstone_alloy"),
            BRIGHT_ELECTRON_TUBE = ingredient("bright_electron_tube"),
            POLISHED_AMETHYST = ingredient("polished_amethyst"),
            STAINLESS_STEEL_INGOT = ingredient("stainless_steel_ingot"),
            STAINLESS_STEEL_NUGGET = ingredient("stainless_steel_nugget"),
            STAINLESS_STEEL_SHEET = ingredient("stainless_steel_sheet"),
            STAINLESS_STEEL_ROD = ingredient("stainless_steel_rod"),
            STEEL_INGOT = ingredient("steel_ingot"),
            ROUGH_STEEL = ingredient("rough_steel"),
            PIG_IRON = ingredient("pig_iron"),
            DIAMOND_DUST = ingredient("diamond_dust");

    // TODO: Add Functionality
    public static final ItemEntry<Item> SWAB = REGISTRATE.item("swab", Item::new)
            .properties(p -> p
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            )
            .register();

    // TODO: Add Functionality
    // TODO: Add 3D Model
    public static final ItemEntry<Item> SYRINGE = REGISTRATE.item("syringe", Item::new)
            .properties(p -> p
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .durability(2)
            )
            .lang("Syringe")
            .register();

    // TODO: Add Functionality
    public static final ItemEntry<Item> SKETCHBOOK = REGISTRATE.item("sketchbook", Item::new)
            .properties(p -> p
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            )
            .lang("Sketchbook")
            .register();

    private static ItemEntry<Item> ingredient(String name) {
        return ingredient(name, new Item.Properties());
    }

    private static ItemEntry<Item> ingredient(String name, Item.Properties prop) {
        return REGISTRATE.item(name, Item::new)
                .properties(p -> prop)
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
