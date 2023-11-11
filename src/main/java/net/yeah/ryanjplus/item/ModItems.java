package net.yeah.ryanjplus.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yeah.ryanjplus.RyanJPlus;
import net.yeah.ryanjplus.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RyanJPlus.MOD_ID);

    public static final RegistryObject<Item> RYAN_HELMET = ITEMS.register("ryan_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RYAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RYAN_CHESTPLATE = ITEMS.register("ryan_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RYAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RYAN_LEGGINGS = ITEMS.register("ryan_leggings",
            () -> new ArmorItem(ModArmorMaterials.RYAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RYAN_BOOTS = ITEMS.register("ryan_boots",
            () -> new ArmorItem(ModArmorMaterials.RYAN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> COOL_GLASSES = ITEMS.register("cool_glasses",
            () -> new ModArmorItem(ModArmorMaterials.COOL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
