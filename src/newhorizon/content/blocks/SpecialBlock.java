package newhorizon.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.storage.StorageBlock;
import mindustry.world.meta.BuildVisibility;
import newhorizon.content.NHItems;
import newhorizon.expand.block.special.AssignedBeacon;
import newhorizon.expand.block.special.DeviceBase;
import newhorizon.expand.block.special.NexusCore;
import newhorizon.expand.block.special.RemoteStorage;

import static mindustry.type.ItemStack.with;

public class SpecialBlock {
    public static Block
            standardStorage, heavyStorage, nexusCore, juniorModuleBeacon, seniorModuleBeacon, deviceTest;

    public static void load() {
        nexusCore = new NexusCore();

        standardStorage = new RemoteStorage("standard-storage") {{
            requirements(Category.effect, with(NHItems.presstanium, 80, NHItems.juniorProcessor, 40));
            size = 2;
            health = 1200;

            unloaderEfficiency = 0.25f;
        }};

        heavyStorage = new RemoteStorage("heavy-storage") {{
            requirements(Category.effect, with(NHItems.seniorProcessor, 120, NHItems.metalOxhydrigen, 100, Items.carbide, 100));
            size = 3;
            health = 4000;

            unloaderEfficiency = 0.5f;
        }};

        juniorModuleBeacon = new AssignedBeacon("junior-module-beacon") {{
            requirements(Category.effect, BuildVisibility.shown, ItemStack.with(NHItems.juniorProcessor, 120, NHItems.presstanium, 160, Items.carbide, 80));
            maxLink = 4;
            range = 60f;

            maxBoostScl = 2f;
            maxProductivity = 1f;
            consumePower(600 / 60f);
        }};

        seniorModuleBeacon = new AssignedBeacon("senior-module-beacon") {{
            requirements(Category.effect, BuildVisibility.shown, ItemStack.with(NHItems.multipleSteel, 100, Items.surgeAlloy, 200, Items.phaseFabric, 150));
            maxLink = 10;
            range = 80f;

            maxBoostScl = 4f;
            maxProductivity = 2f;
            consumePower(1200 / 60f);
        }};

        //deviceTest = new DeviceBase("device-test") {{
        //    requirements(Category.effect, BuildVisibility.shown, ItemStack.with(NHItems.multipleSteel, 100, Items.surgeAlloy, 200, Items.phaseFabric, 150));
        //}};
    }
}
