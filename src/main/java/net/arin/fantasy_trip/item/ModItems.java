package net.arin.fantasy_trip.item;

import net.arin.fantasy_trip.Fantasy_Trip;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fantasy_Trip.MOD_ID);

    //物品注册
    public static final RegistryObject<Item> DREAMY_MEOW = ITEMS.register("dreamy_meow",
            () -> new CustomShieldItem(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}



