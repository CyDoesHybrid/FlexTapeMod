package com.cyanideee.flextapemod.util;

import com.cyanideee.flextapemod.FlexTapeMod;
import com.cyanideee.flextapemod.items.BlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.Items.BUCKET;

public class InitShiz {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FlexTapeMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FlexTapeMod.MOD_ID);

    public static void init() {

        ITEMS.register((FMLJavaModLoadingContext.get().getModEventBus()));
        BLOCKS.register((FMLJavaModLoadingContext.get().getModEventBus()));

    }

    private BlockState defaultState;

    public final BlockState getDefaultState() {
        return this.defaultState;
    }


    public static final RegistryObject<Item> EDIBLE_FLEX_TAPE = ITEMS.register("edible_flex_tape", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.POISONOUS_POTATO)));
    public static final RegistryObject<Item> FLEX_GLUE = ITEMS.register("flex_glue", () -> new MilkBucketItem(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Block> FLEX_SEAL_BLOCK = BLOCKS.register("flex_seal_block", () -> new Block(Block.Properties.create(Material.CLAY, MaterialColor.CLAY).hardnessAndResistance(100F).sound(SoundType.SLIME)));

    public static final RegistryObject<Item> FLEX_SEAL_ITEM = ITEMS.register("flex_seal_item", () -> new BlockItemBase(FLEX_SEAL_BLOCK.get()));


}
