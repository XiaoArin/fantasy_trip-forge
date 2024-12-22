package net.arin.fantasy_trip.item;

import net.arin.fantasy_trip.Fantasy_Trip;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Fantasy_Trip.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FANTASY_TAB = CREATIVE_MODE_TABS.register("fantasy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DREAMY_MEOW.get()))
                    .title(Component.translatable("creativetab.fantasy_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //自定义标签页物品添加
                        output.accept(ModItems.DREAMY_MEOW.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
