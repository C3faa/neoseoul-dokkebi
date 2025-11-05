package com.neoseoul;

import com.neoseoul.registry.NSRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeoSeoulMod implements ModInitializer {
    public static final String MODID = "neoseoul";
    public static final Logger LOG = LoggerFactory.getLogger("NeoSeoul");

    @Override public void onInitialize() {
        NSRegistry.init();
        LOG.info("[NeoSeoul] Dokkebi mod loaded");
    }
}
