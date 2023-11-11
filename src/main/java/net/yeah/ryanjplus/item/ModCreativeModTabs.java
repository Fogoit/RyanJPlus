package net.yeah.ryanjplus.item;

import com.zepsun.rdworskymod.RDworskyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yeah.ryanjplus.RyanJPlus;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RyanJPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RYAN_J_PLUS = CREATIVE_MODE_TABS.register("ryan_j_plus",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(RDworskyMod.RYAN_DWORSKY_BLOCK_ITEM.get()))
                    .title(Component.translatable("creativetab.ryan_j_plus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RYAN_HELMET.get());
                        pOutput.accept(ModItems.RYAN_CHESTPLATE.get());
                        pOutput.accept(ModItems.RYAN_LEGGINGS.get());
                        pOutput.accept(ModItems.RYAN_BOOTS.get());
                        pOutput.accept(ModItems.COOL_GLASSES.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
