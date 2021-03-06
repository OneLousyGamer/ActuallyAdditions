package de.ellpeck.actuallyadditions.common.items;

import de.ellpeck.actuallyadditions.common.items.base.ItemBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemLaserRelayUpgrade extends ItemBase {

    public ItemLaserRelayUpgrade(String name) {
        super(name);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.UNCOMMON;
    }
}
