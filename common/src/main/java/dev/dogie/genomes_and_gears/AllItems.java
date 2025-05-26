package dev.dogie.genomes_and_gears;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class AllItems {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(Constants.MOD_ID);

    public static final ItemEntry<Item> TESTITEM = REGISTRATE.item("test", Item::new)
            .lang("test")
            .onRegister(i -> Constants.LOG.info("This never happens"))
            .register();

    // Load this class

    public static void register() {
        Constants.LOG.info("This happens");
    }
}
