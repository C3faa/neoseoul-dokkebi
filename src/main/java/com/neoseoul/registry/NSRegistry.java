package com.neoseoul.registry;

import com.neoseoul.NeoSeoulMod;
import com.neoseoul.entity.DokkebiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NSRegistry {
    public static final Identifier DOKKEBI_ID = new Identifier(NeoSeoulMod.MODID, "dokkebi");

    public static final net.minecraft.entity.EntityType<DokkebiEntity> DOKKEBI =
            Registry.register(Registries.ENTITY_TYPE, DOKKEBI_ID,
                FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DokkebiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f))
                    .trackRangeBlocks(64)
                    .build()
            );

    public static final Item DOKKEBI_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            new Identifier(NeoSeoulMod.MODID, "dokkebi_spawn_egg"),
            new SpawnEggItem(DOKKEBI, 0x332244, 0x00e6ff, new Item.Settings())
    );

    public static void init() {
        DefaultAttributeContainer attrs = HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 32.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.35D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0D)
                .build();
        FabricDefaultAttributeRegistry.register(DOKKEBI, attrs);
    }
}
