package com.neoseoul.client.render;

import com.neoseoul.entity.DokkebiEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;

public class DokkebiRenderer extends MobEntityRenderer<DokkebiEntity, ZombieEntityModel<DokkebiEntity>> {
    private static final Identifier TEX = new Identifier("neoseoul", "textures/entity/dokkebi.png");
    public DokkebiRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ZombieEntityModel<>(ctx.getPart(EntityModelLayers.ZOMBIE)), 0.5f);
    }
    @Override public Identifier getTexture(DokkebiEntity entity) { return TEX; }
}
