package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModItems;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.obj.ObjMaterialLibrary;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);


    public static final RegistryObject<Block> ARROBA_BLOCK = registerBlock("arroba_block",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> DOS_BLOCK = registerBlock("dos_block",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .sound(SoundType.ANVIL).friction(2f)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}
