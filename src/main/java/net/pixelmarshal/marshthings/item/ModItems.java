package net.pixelmarshal.marshthings.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pixelmarshal.marshthings.MarshThings;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MarshThings.MOD_ID);

    public static final DeferredItem<Item> TESTITEM = ITEMS.registerItem("testitem",
            Item::new,
            new Item.Properties());



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
