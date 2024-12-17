package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> RATATIN = ITEMS.register("ratatin",
            () -> new Item (new Item.Properties()));

    public static final RegistryObject<Item> SKIBIDI_TOILET = ITEMS.register("skibidi_toilet",
            () -> new Item (new Item.Properties()));

    public static final RegistryObject<Item> CHAINMAIL = ITEMS.register("chainmail",
            () -> new Item (new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
