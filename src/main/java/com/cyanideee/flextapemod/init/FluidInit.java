package com.cyanideee.flextapemod.init;

import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.util.registry.Registry;

public class FluidInit {

    public static final FlowingFluid FLOWING_FLEX_SEAL = register("flowing_flex_seal", new WaterFluid.Flowing());
    public static final FlowingFluid FLEX_SEAL = register("flex_seal", new WaterFluid.Source());

    private static <T extends Fluid> T register(String key, T p_215710_1_) {
        return (T)(Registry.register(Registry.FLUID, key, p_215710_1_));
    }

    static {
        for(Fluid fluid : Registry.FLUID) {
            for(IFluidState ifluidstate : fluid.getStateContainer().getValidStates()) {
                Fluid.STATE_REGISTRY.add(ifluidstate);
            }
        }

    }

}
