package net.trashoflevillage.villagersouls.items;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class IllSoulItem extends Item {
    public IllSoulItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    public InteractionResult use(UseOnContext pContext) {
        return super.useOn(pContext);

    }
}
