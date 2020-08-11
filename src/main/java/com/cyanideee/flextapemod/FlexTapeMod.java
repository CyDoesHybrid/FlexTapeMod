package com.cyanideee.flextapemod;

import com.cyanideee.flextapemod.util.InitShiz;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("flexmod")
public class FlexTapeMod {

    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID ="flexmod";

    public FlexTapeMod(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientBase);
        MinecraftForge.EVENT_BUS.register(this);
        setCommon(modEventBus);

    }

    public void setCommon(IEventBus eventBus) {
        InitShiz.init();
    }

    private void setup(final FMLCommonSetupEvent event) {


    }

    private void clientBase(final FMLClientSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = FlexTapeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {}

    public static <T extends IForgeRegistryEntry<T>> T register(IForgeRegistry<T> registry, T entry, String registryKey)
    {
        entry.setRegistryName(new ResourceLocation(FlexTapeMod.MOD_ID, registryKey));
        registry.register(entry);
        return entry;
    }




}
