package net.mobz.Inits;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.mobz.Config.configz;

public class SpawnInit {

    private static void normalspawn(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND
                && biome.getCategory() != Biome.Category.ICY && biome.getCategory() != Biome.Category.OCEAN
                && biome.getCategory() != Biome.Category.MUSHROOM && biome.getCategory() != Biome.Category.EXTREME_HILLS
                && biome.getCategory() != Biome.Category.MESA)

            biome.getEntitySpawnList(Entityinit.ARCHERENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ARCHERENTITY, Configinit.CONFIGZ.BowmanSpawnRate, 1, 2));
        biome.getEntitySpawnList(Entityinit.ARMORED.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.ARMORED, Configinit.CONFIGZ.ArmoredZombieSpawnRate, 1, 2));
        biome.getEntitySpawnList(Entityinit.DWARFENTITY.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.DWARFENTITY, Configinit.CONFIGZ.DwarfSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.FAST.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.FAST, Configinit.CONFIGZ.SpeedyZombieSpawnRate, 2, 3));
        biome.getEntitySpawnList(Entityinit.FULLIRONENTITY.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.FULLIRONENTITY, Configinit.CONFIGZ.SteveSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.KNIGHT2ENTITY.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.KNIGHT2ENTITY, Configinit.CONFIGZ.WarriorSpawnRate, 1, 2));
        biome.getEntitySpawnList(Entityinit.KNIGHTENTITY.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.KNIGHTENTITY, Configinit.CONFIGZ.TemplarSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.MAGE2ENTITY.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.MAGE2ENTITY, Configinit.CONFIGZ.ZombieMageSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.SKELI2.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.SKELI2, Configinit.CONFIGZ.OvergrownSkeletonSpawnRate, 2, 4));
        biome.getEntitySpawnList(Entityinit.SKELI4.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.SKELI4, Configinit.CONFIGZ.LostSkeletonSpawnRate, 2, 2));
        biome.getEntitySpawnList(Entityinit.SLIMO.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.SLIMO, Configinit.CONFIGZ.GrassSlimeSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.SPI.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.SPI, Configinit.CONFIGZ.BlueSpiderSpawnRate, 2, 3));
        biome.getEntitySpawnList(Entityinit.SPO.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.SPO, Configinit.CONFIGZ.PurpleSpiderSpawnRate, 1, 4));
        biome.getEntitySpawnList(Entityinit.TSPIDER.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.TSPIDER, Configinit.CONFIGZ.TinySpiderSpawnRate, 1, 1));
        biome.getEntitySpawnList(Entityinit.TANK.getCategory())
                .add(new Biome.SpawnEntry(Entityinit.TANK, Configinit.CONFIGZ.TankSpawnRate, 1, 2));

        if (AutoConfig.getConfigHolder(configz.class).getConfig().WildBoarSpawn) {
            biome.getEntitySpawnList(Entityinit.BOAR.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.BOAR, Configinit.CONFIGZ.WildBoarSpawnRate, 2, 4));
        }
        if (AutoConfig.getConfigHolder(configz.class).getConfig().DirtyBoarSpawn) {
            biome.getEntitySpawnList(Entityinit.BOAR3.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.BOAR3, Configinit.CONFIGZ.DirtyBoarSpawnRate, 1, 3));
        }
        if (AutoConfig.getConfigHolder(configz.class).getConfig().BrownBearSpawn) {
            biome.getEntitySpawnList(Entityinit.BROWNBEAR.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.BROWNBEAR, Configinit.CONFIGZ.BrownBearSpawnRate, 2, 3));
        }
        if (AutoConfig.getConfigHolder(configz.class).getConfig().AlexSpawn) {
            biome.getEntitySpawnList(Entityinit.FRIEND.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.FRIEND, Configinit.CONFIGZ.AlexSpawnRate, 1, 1));
        }
        if (AutoConfig.getConfigHolder(configz.class).getConfig().GoldenChickenSpawn) {
            biome.getEntitySpawnList(Entityinit.GCHICKEN.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.GCHICKEN, Configinit.CONFIGZ.GoldenChickenSpawnRate, 1, 2));
        }
        if (AutoConfig.getConfigHolder(configz.class).getConfig().FioraSpawn) {
            biome.getEntitySpawnList(Entityinit.KNIGHT4ENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.KNIGHT4ENTITY, Configinit.CONFIGZ.FioraSpawnRate, 1, 1));
        }

    }

    private static void icespawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.ICY) {
            biome.getEntitySpawnList(Entityinit.CREEP.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.CREEP, Configinit.CONFIGZ.FrostCreeperSpawnRate, 1, 3));
            biome.getEntitySpawnList(Entityinit.FROSTENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.FROSTENTITY, Configinit.CONFIGZ.FrostBlazeSpawnRate, 1, 3));
            biome.getEntitySpawnList(Entityinit.ICEGOLEM.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ICEGOLEM, Configinit.CONFIGZ.IceGolemSpawnRate, 1, 1));
            if (AutoConfig.getConfigHolder(configz.class).getConfig().BoarSpawn) {
                biome.getEntitySpawnList(Entityinit.BOAR2.getCategory())
                        .add(new Biome.SpawnEntry(Entityinit.BOAR2, Configinit.CONFIGZ.BoarSpawnRate, 2, 3));
            }
            if (AutoConfig.getConfigHolder(configz.class).getConfig().BlackBearSpawn) {
                biome.getEntitySpawnList(Entityinit.BLACKBEAR.getCategory())
                        .add(new Biome.SpawnEntry(Entityinit.BLACKBEAR, Configinit.CONFIGZ.BlackBearSpawnRate, 1, 2));
            }
        }
    }

    private static void netherspawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.NETHER) {
            biome.getEntitySpawnList(Entityinit.DOG.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.DOG, Configinit.CONFIGZ.NetherWolfSpawnRate, 1, 3));
            biome.getEntitySpawnList(Entityinit.LAVAGOLEM.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.LAVAGOLEM, Configinit.CONFIGZ.LavaGolemSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.PIG.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.PIG, Configinit.CONFIGZ.PigmanSpawnRate, 2, 3));
            biome.getEntitySpawnList(Entityinit.SKELI3.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.SKELI3, Configinit.CONFIGZ.NetherSkeletonSpawnRate, 1, 2));
            biome.getEntitySpawnList(Entityinit.WITHENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.WITHENTITY, Configinit.CONFIGZ.WitherBlazeSpawnRate, 1, 3));
        }
    }

    private static void endspawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.THEEND) {
            biome.getEntitySpawnList(Entityinit.ENDER.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ENDER, Configinit.CONFIGZ.EndermanSpawnRate, 1, 3));
            biome.getEntitySpawnList(Entityinit.ENDERZOMBIE.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ENDERZOMBIE, Configinit.CONFIGZ.EnderzombieSpawnRate, 1, 3));
            biome.getEntitySpawnList(Entityinit.KNIGHT3ENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.KNIGHT3ENTITY, Configinit.CONFIGZ.EnderKnightSpawnRate, 1, 1));
        }
    }

    private static void bossspawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.MESA) {
            biome.getEntitySpawnList(Entityinit.BIGBOSSENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.BIGBOSSENTITY, Configinit.CONFIGZ.BigBossSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.ARCHER2ENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ARCHER2ENTITY, Configinit.CONFIGZ.ArcherSpawnRate, 1, 2));
            biome.getEntitySpawnList(Entityinit.BOSS.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.BOSS, Configinit.CONFIGZ.BossZombieSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.ILLUSIONER.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.ILLUSIONER, Configinit.CONFIGZ.IllusionerSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.KNIGHT5ENTITY.getCategory()).add(
                    new Biome.SpawnEntry(Entityinit.KNIGHT5ENTITY, Configinit.CONFIGZ.LordofDarknessSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.MAGEENTITY.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.MAGEENTITY, Configinit.CONFIGZ.SpiderMageSpawnRate, 1, 1));
            biome.getEntitySpawnList(Entityinit.SKELI1.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.SKELI1, Configinit.CONFIGZ.BossSkeletonSpawnRate, 1, 1));
        }
    }

    private static void rockyspawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.EXTREME_HILLS) {
            biome.getEntitySpawnList(Entityinit.STONEGOLEM.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.STONEGOLEM, Configinit.CONFIGZ.StoneGolemSpawnRate, 1, 1));
        }
    }

    private static void junglespawn(Biome biome) {
        if (biome.getCategory() == Biome.Category.JUNGLE) {
            biome.getEntitySpawnList(Entityinit.CRIP.getCategory())
                    .add(new Biome.SpawnEntry(Entityinit.CRIP, Configinit.CONFIGZ.CookieCreeperSpawnRate, 1, 2));
        }
    }

    public static void init() {

        Registry.BIOME.forEach(SpawnInit::normalspawn);
        Registry.BIOME.forEach(SpawnInit::icespawn);
        Registry.BIOME.forEach(SpawnInit::netherspawn);
        Registry.BIOME.forEach(SpawnInit::endspawn);
        Registry.BIOME.forEach(SpawnInit::bossspawn);
        Registry.BIOME.forEach(SpawnInit::rockyspawn);
        Registry.BIOME.forEach(SpawnInit::junglespawn);

        // Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME)
                .register((i, identifier, biome) -> SpawnInit.normalspawn(biome));
    }

}
// -692144143445259 Seed for Plains Spawn

// How to add to all Biomes
// Registry.BIOME.forEach(biome ->
// biome.getEntitySpawnList(Entityinit.FAST.getCategory())
// .add(new Biome.SpawnEntry(Entityinit.FAST, 200, 1, 3)));

// How to add to a specific Biome
// Biomes.RIVER.getEntitySpawnList(TANK.getCategory()).add(new
// Biome.SpawnEntry(TANK, 3, 1, 3));