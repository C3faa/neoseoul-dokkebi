package com.neoseoul.client;

import com.neoseoul.registry.NSRegistry;
import com.neoseoul.client.render.DokkebiRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class NeoSeoulClient implements ClientModInitializer {
    @Override public void onInitializeClient() {
        EntityRendererRegistry.register(NSRegistry.DOKKEBI, DokkebiRenderer::new);
    }
}
