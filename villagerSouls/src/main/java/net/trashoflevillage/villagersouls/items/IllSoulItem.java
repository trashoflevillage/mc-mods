package net.trashoflevillage.villagersouls.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public class IllSoulItem extends Item {
    public IllSoulItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    // @Nullable means that the parameter might be null.

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("item.villagersouls.ill_soul.desc"));
    }

}
