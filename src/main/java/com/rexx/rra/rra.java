package com.rexx.rra;

import com.rexx.rra.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class rra implements ModInitializer {

    public static final String MOD_ID = "rra81206";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
