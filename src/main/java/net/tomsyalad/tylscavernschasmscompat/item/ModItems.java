package net.tomsyalad.tylscavernschasmscompat.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylscavernschasmscompat.TYLsCavernsChasmsCompat;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TYLsCavernsChasmsCompat.MOD_ID);

    public static final RegistryObject<Item> CRUSHED_RAW_GALENA = ITEMS.register("crushed_raw_galena",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SODA_ASH = ITEMS.register("soda_ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLACEHOLDER_ITEM_ONE = ITEMS.register("placeholder_item_one",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_TWO = ITEMS.register("placeholder_item_two",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_THREE = ITEMS.register("placeholder_item_three",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_FOUR = ITEMS.register("placeholder_item_four",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_FIVE = ITEMS.register("placeholder_item_five",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_SIX = ITEMS.register("placeholder_item_six",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
