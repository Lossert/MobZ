package net.mobz.Inits;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mobz.Entity.*;

//import net.minecraft.entity.EntityType.Builder;

public class Entityinit {

        public static final EntityType<TankEntity> TANK = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, TankEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<FastEntity> FAST = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, FastEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<TestEntity> TEST = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, TestEntity::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<ArmoredEntity> ARMORED = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, ArmoredEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<BossEntity> BOSS = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, BossEntity::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<CreepEntity> CREEP = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, CreepEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.7F)).build();
        public static final EntityType<CripEntity> CRIP = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, CripEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.7F)).build();
        public static final EntityType<EnderEntity> ENDER = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, EnderEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 2.9F)).build();
        public static final EntityType<EnderZombieEntity> ENDERZOMBIE = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, EnderZombieEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<SpiEntity> SPI = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, SpiEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.4F, 0.9F)).build();
        public static final EntityType<SpoEntity> SPO = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, SpoEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.4F, 0.9F)).build();
        public static final EntityType<PigmanEntity> PIG = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, PigmanEntity::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<LavaGolem> LAVAGOLEM = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, LavaGolem::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(1.4F, 2.7F)).build();
        public static final EntityType<IceGolem> ICEGOLEM = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IceGolem::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.54F, 3F)).build();
        public static final EntityType<skeli1> SKELI1 = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, skeli1::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.99F)).build();
        public static final EntityType<skeli2> SKELI2 = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, skeli2::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.99F)).build();
        public static final EntityType<skeli3> SKELI3 = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, skeli3::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.99F)).build();
        public static final EntityType<ArcherEntity> ARCHERENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, ArcherEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Archer2Entity> ARCHER2ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Archer2Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<BigBossEntity> BIGBOSSENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, BigBossEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.5F, 4.875F)).build();
        public static final EntityType<KnightEntity> KNIGHTENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, KnightEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Knight2Entity> KNIGHT2ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Knight2Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<MageEntity> MAGEENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, MageEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<Mage2Entity> MAGE2ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Mage2Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<SmallZombie> SMALLZOMBIE = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, SmallZombie::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.3F, 1.0F)).build();
        public static final EntityType<FullIronEntity> FULLIRONENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, FullIronEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<FrostEntity> FROSTENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, FrostEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Dog> DOG = FabricEntityTypeBuilder.create(EntityCategory.MONSTER, Dog::new)
                        .trackable(74, 2).fireImmune().dimensions(EntityDimensions.fixed(0.6F, 0.85F)).build();
        public static final EntityType<StoneGolem> STONEGOLEM = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, StoneGolem::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.4F, 2.7F)).build();
        public static final EntityType<Illusioner> ILLUSIONER = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Illusioner::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<DwarfEntity> DWARFENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, DwarfEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<SpiSmall> SPISMALL = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, SpiSmall::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.7F, 0.5F)).build();
        public static final EntityType<Blackbear> BLACKBEAR = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, Blackbear::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.25F, 1.3F)).build();
        public static final EntityType<Brownbear> BROWNBEAR = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, Brownbear::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.3F, 1.4F)).build();
        public static final EntityType<GChicken> GCHICKEN = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, GChicken::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.4F, 0.35F)).build();
        public static final EntityType<Boar> BOAR = FabricEntityTypeBuilder.create(EntityCategory.CREATURE, Boar::new)
                        .trackable(74, 2).dimensions(EntityDimensions.fixed(0.9F, 0.9F)).build();
        public static final EntityType<Boar2> BOAR2 = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, Boar2::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.9F, 0.9F)).build();
        public static final EntityType<Boar3> BOAR3 = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, Boar3::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.9F, 0.9F)).build();
        public static final EntityType<FriendEntity> FRIEND = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, FriendEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Knight3Entity> KNIGHT3ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Knight3Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Knight4Entity> KNIGHT4ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.CREATURE, Knight4Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<Knight5Entity> KNIGHT5ENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Knight5Entity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<WithEntity> WITHENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, WithEntity::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<skeli4> SKELI4 = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, skeli4::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.9F, 3.5F)).build();
        public static final EntityType<Withender> WITHENDER = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, Withender::new).trackable(74, 2).fireImmune()
                        .dimensions(EntityDimensions.fixed(0.6F, 1.95F)).build();
        public static final EntityType<Slimo> SLIMO = FabricEntityTypeBuilder.create(EntityCategory.MONSTER, Slimo::new)
                        .trackable(74, 2).dimensions(EntityDimensions.fixed(0.51F, 0.51F)).build();
        public static final EntityType<TSpider> TSPIDER = FabricEntityTypeBuilder
                        .create(EntityCategory.AMBIENT, TSpider::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.2F, 0.1F)).build();
        public static final EntityType<PillagerBoss> PILLAGERBOSS = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, PillagerBoss::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.78F, 2.675F)).build();
        public static final EntityType<BabyravagerEntity> BABYRAVAGERENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, BabyravagerEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.78F, 0.88F)).build();
        public static final EntityType<IslandKing> ISLANDKING = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IslandKing::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<IslandKnightNormal> ISLANDKNIGHTNORMAL = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IslandKnightNormal::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<IslandKnightSpecial> ISLANDKNIGHTSPECIAL = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IslandKnightSpecial::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<IslandKnightSpecial2> ISLANDKNIGHTSPECIAL2 = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IslandKnightSpecial2::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
        public static final EntityType<IslandVexEntity> ISLANDVEXENTITY = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, IslandVexEntity::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(0.4F, 0.8F)).build();
        public static final EntityType<MetalGolem> METALGOLEM = FabricEntityTypeBuilder
                        .create(EntityCategory.MONSTER, MetalGolem::new).trackable(74, 2)
                        .dimensions(EntityDimensions.fixed(1.59F, 3F)).build();

        public static void init() {

                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "tank_entity"), TANK);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "fast_entity"), FAST);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "test_entity"), TEST);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "armored_entity"), ARMORED);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "boss_entity"), BOSS);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "creep_entity"), CREEP);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "crip_entity"), CRIP);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "ender_entity"), ENDER);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "enderzombie_entity"), ENDERZOMBIE);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "spi_entity"), SPI);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "spo_entity"), SPO);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "pigman_entity"), PIG);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "lavagolem_entity"), LAVAGOLEM);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "icegolem_entity"), ICEGOLEM);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "skeli1_entity"), SKELI1);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "skeli2_entity"), SKELI2);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "skeli3_entity"), SKELI3);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "archer_entity"), ARCHERENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "archer2_entity"), ARCHER2ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "bigboss_entity"), BIGBOSSENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "knight_entity"), KNIGHTENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "knight2_entity"), KNIGHT2ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "mage_entity"), MAGEENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "mage2_entity"), MAGE2ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "smallzombie_entity"), SMALLZOMBIE);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "fulliron_entity"), FULLIRONENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "frost_entity"), FROSTENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "dog_entity"), DOG);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "stonegolem_entity"), STONEGOLEM);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "illusioner_entity"), ILLUSIONER);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "dwarf_entity"), DWARFENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "spismall_entity"), SPISMALL);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "blackbear_entity"), BLACKBEAR);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "brownbear_entity"), BROWNBEAR);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "gchicken_entity"), GCHICKEN);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "boar_entity"), BOAR);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "boar2_entity"), BOAR2);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "boar3_entity"), BOAR3);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "friend_entity"), FRIEND);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "knight3_entity"), KNIGHT3ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "knight4_entity"), KNIGHT4ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "knight5_entity"), KNIGHT5ENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "with_entity"), WITHENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "skeli4_entity"), SKELI4);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "slimo_entity"), SLIMO);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "withender_entity"), WITHENDER);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "tspider_entity"), TSPIDER);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "pillagerboss_entity"), PILLAGERBOSS);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "babyravager_entity"),
                                BABYRAVAGERENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "islandking_entity"), ISLANDKING);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "islandknightnormal_entity"),
                                ISLANDKNIGHTNORMAL);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "islandknightspecial_entity"),
                                ISLANDKNIGHTSPECIAL);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "islandknightspecial2_entity"),
                                ISLANDKNIGHTSPECIAL2);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "islandvex_entity"), ISLANDVEXENTITY);
                Registry.register(Registry.ENTITY_TYPE, new Identifier("mobz", "metalgolem_entity"), METALGOLEM);
                // A
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_friend"), new SpawnEggItem(FRIEND,
                                11123336, 15043903, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_islandknightspecial2"),
                                new SpawnEggItem(ISLANDKNIGHTSPECIAL2, 3882305, 3161413,
                                                new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_archer2"), new SpawnEggItem(
                                ARCHER2ENTITY, 2123813, 1117987, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_armored"), new SpawnEggItem(ARMORED,
                                1397590, 3165729, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // B
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_babyravager"),
                                new SpawnEggItem(BABYRAVAGERENTITY, 6315866, 4538432,
                                                new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_bigboss"), new SpawnEggItem(
                                BIGBOSSENTITY, 667182, 984607, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_blackbear"), new SpawnEggItem(BLACKBEAR,
                                657934, 2960685, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_spi"), new SpawnEggItem(SPI, 3291714,
                                960680, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_boar2"), new SpawnEggItem(BOAR2,
                                14601929, 2962756, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_skeli1"), new SpawnEggItem(SKELI1,
                                5066061, 3932162, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_boss"), new SpawnEggItem(BOSS, 1181988,
                                3560490, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_archer"), new SpawnEggItem(ARCHERENTITY,
                                2123875, 1117987, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_brownbear"), new SpawnEggItem(BROWNBEAR,
                                2169097, 4403731, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // C
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_crip"), new SpawnEggItem(CRIP, 10250793,
                                0, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // D
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_boar3"), new SpawnEggItem(BOAR3,
                                13284514, 2890508, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_dwarf"), new SpawnEggItem(DWARFENTITY,
                                8551531, 6755862, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // E
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_knight3"), new SpawnEggItem(
                                KNIGHT3ENTITY, 2303296, 11497623, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_ender"), new SpawnEggItem(ENDER, 7884109,
                                2167558, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_enderzombie"), new SpawnEggItem(
                                ENDERZOMBIE, 656405, 3876927, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // F
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_knight4"), new SpawnEggItem(
                                KNIGHT4ENTITY, 2120818, 12160610, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_frost"), new SpawnEggItem(FROSTENTITY,
                                8709375, 86111, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_creep"), new SpawnEggItem(CREEP, 4897722,
                                0, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // G
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_gchicken"), new SpawnEggItem(GCHICKEN,
                                13027014, 15315221, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_slimo"), new SpawnEggItem(SLIMO, 7121986,
                                7951674, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // H
                // I
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_icegolem"), new SpawnEggItem(ICEGOLEM,
                                7499112, 1572516, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_illusioner"), new SpawnEggItem(
                                ILLUSIONER, 6376248, 4344910, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // J
                // K
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_islandking"), new SpawnEggItem(
                                ISLANDKING, 4851200, 6176010, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_islandknightnormal"),
                                new SpawnEggItem(ISLANDKNIGHTNORMAL, 3815735, 723723,
                                                new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // L
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_lavagolem"), new SpawnEggItem(LAVAGOLEM,
                                7806478, 16652145, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_knight5"), new SpawnEggItem(
                                KNIGHT5ENTITY, 1118487, 5000017, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_skeli4"), new SpawnEggItem(SKELI4,
                                4079166, 11776947, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // M
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_metalgolem"), new SpawnEggItem(
                                METALGOLEM, 2930848, 5197390, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // N
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_skeli3"), new SpawnEggItem(SKELI3,
                                4801614, 5121582, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_dog"), new SpawnEggItem(DOG, 7734790,
                                12550144, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // O
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_skeli2"), new SpawnEggItem(SKELI2,
                                5263682, 11534, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // P
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_pig"), new SpawnEggItem(PIG, 9856837,
                                3169838, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_pillagerboss"), new SpawnEggItem(
                                PILLAGERBOSS, 4984603, 1453610, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_spo"), new SpawnEggItem(SPO, 4864065,
                                10817192, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_smallzombie"), new SpawnEggItem(
                                SMALLZOMBIE, 3222535, 1116191, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // Q
                // R
                // S
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_fast"), new SpawnEggItem(FAST, 6109639,
                                2968097, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_mage"), new SpawnEggItem(MAGEENTITY,
                                5128776, 12342593, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_islandvex"),
                                new SpawnEggItem(ISLANDVEXENTITY, 4200731, 12235160,
                                                new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_fulliron"), new SpawnEggItem(
                                FULLIRONENTITY, 888205, 4800672, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_stonegolem"), new SpawnEggItem(
                                STONEGOLEM, 10197915, 6654258, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // T
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_tank"), new SpawnEggItem(TANK, 5055902,
                                2507798, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_knight"), new SpawnEggItem(KNIGHTENTITY,
                                7165479, 7678221, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_spismall"), new SpawnEggItem(SPISMALL,
                                3806513, 146458, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // U
                // V
                // W
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_knight2"), new SpawnEggItem(
                                KNIGHT2ENTITY, 8881541, 4797474, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_boar"), new SpawnEggItem(BOAR, 3211264,
                                9984303, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_islandknightspecial"),
                                new SpawnEggItem(ISLANDKNIGHTSPECIAL, 2434859, 3481123,
                                                new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_withender"), new SpawnEggItem(WITHENDER,
                                11797152, 1710618, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_with"), new SpawnEggItem(WITHENTITY,
                                1841947, 8157561, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_mage2"), new SpawnEggItem(MAGE2ENTITY,
                                4211261, 2375449, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));
                // X
                // Y
                // Z
                Registry.register(Registry.ITEM, new Identifier("mobz", "spawn_test"), new SpawnEggItem(TEST, 2039583,
                                9109643, new Item.Settings().group(Itemgroupinit.EGGZ_GROUP)));

        }

}
