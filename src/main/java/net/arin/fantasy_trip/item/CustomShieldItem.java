package net.arin.fantasy_trip.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;

import java.util.UUID;

public class CustomShieldItem extends ShieldItem {

    private static final UUID ATTACK_DAMAGE_UUID = UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff");

    public CustomShieldItem(Item.Properties settings) {
        super(settings);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1; // 设置最大堆叠数量为1
    }
}

