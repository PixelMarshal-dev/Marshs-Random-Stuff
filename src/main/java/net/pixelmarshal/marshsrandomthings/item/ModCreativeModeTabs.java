package net.pixelmarshal.marshsrandomthings.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pixelmarshal.marshsrandomthings.MarshThings;
import net.pixelmarshal.marshsrandomthings.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarshThings.MOD_ID);

    public static final Supplier<CreativeModeTab> MARSHS_RANDOM_THINGS_TAB = CREATIVE_MODE_TAB.register("marshs_random_things_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PINE_PLANKS.get()))
                    .title(Component.translatable("creativetab.marshsrandomthings.marsh_things"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TEST_ITEM);
                        output.accept(ModBlocks.PINE_PLANKS);

                    })

                    .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TAB.register(eventbus);
    }
}
