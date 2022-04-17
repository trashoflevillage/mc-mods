package net.trashoflevillage.villagersouls.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.trashoflevillage.villagersouls.VillagerSouls;

public class ModItems {

    // Essentially creates a list of items in my mod.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VillagerSouls.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Define items below!

    public static final RegistryObject<Item> ILLSOUL = ITEMS.register("ill_soul", () -> new IllSoulItem());

    public static final RegistryObject<Item> PURESOUL = ITEMS.register("pure_soul", () -> new PureSoulItem());

}
