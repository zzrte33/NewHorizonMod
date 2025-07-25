package newhorizon.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.type.Item;

public class NHItems {

    //Modded Item
    public static Item
            presstanium, juniorProcessor, metalOxhydrigen, zeta, multipleSteel, seniorProcessor,
            irayrondPanel, setonAlloy, nodexPlate, ancimembrane, hadronicomp, hyperProcessor,
            fusionEnergy, thermoCorePositive, thermoCoreNegative, darkEnergy;

    //Vanilla Item, for namespace use
    public static Item
            scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium,
            phaseFabric, surgeAlloy, sporePod, sand, blastCompound, pyratite, metaglass,
            beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst;


    public static void load() {
        presstanium = new Item("presstanium", Color.valueOf("90a0e4")) {{
            cost = 1.5f;
        }};
        juniorProcessor = new Item("processor-junior", Color.valueOf("a8bdff"));
        metalOxhydrigen = new Item("metal-oxhydrigen", Color.valueOf("cbc2f1"));
        zeta = new Item("zeta", Color.valueOf("ffb380")) {{
            hardness = 8;
            radioactivity = 1.5f;
            charge = 1f;
        }};
        multipleSteel = new Item("multiple-steel", Color.valueOf("ccd3dc")) {{
            cost = 2f;
        }};
        seniorProcessor = new Item("processor-senior", Color.valueOf("f3d259"));

        irayrondPanel = new Item("irayrond-panel", Color.valueOf("afc1e8")) {{
            cost = 2.5f;
        }};
        setonAlloy = new Item("seton-alloy", Color.valueOf("919dab")) {{
            cost = 2.5f;
        }};
        nodexPlate = new Item("nodex-plate", Color.valueOf("6e7080")) {{
            cost = 3f;
        }};
        ancimembrane = new Item("ancimembrane", Color.valueOf("e3ae6f")) {{
            cost = 3;
        }};
        hadronicomp = new Item("hadronicomp", Color.valueOf("dfb5b3"));
        hyperProcessor = new Item("processor-hyper", Color.valueOf("ffb380"));

        fusionEnergy = new Item("fusion-core-energy", Color.valueOf("fff3e6")) {{
            explosiveness = 0.7f;
            radioactivity = 1f;
            charge = 5f;
        }};
        thermoCorePositive = new Item("thermo-core-positive", Color.valueOf("f9ffc9")) {{
            explosiveness = 1f;
            radioactivity = 2.5f;
            charge = 15f;
        }};
        thermoCoreNegative = new Item("thermo-core-negative", Color.valueOf("deedff")) {{
            explosiveness = 1f;
            radioactivity = 2.5f;
            charge = 15f;
        }};
        darkEnergy = new Item("dark-energy", Color.valueOf("cba3ff")) {{
            radioactivity = 5f;
            explosiveness = 5f;
            charge = 25f;
        }};

        scrap = Items.scrap;
        copper = Items.copper;
        lead = Items.lead;
        graphite = Items.graphite;
        coal = Items.coal;
        titanium = Items.titanium;
        thorium = Items.thorium;
        silicon = Items.silicon;
        plastanium = Items.plastanium;
        phaseFabric = Items.phaseFabric;
        surgeAlloy = Items.surgeAlloy;
        sporePod = Items.sporePod;
        sand = Items.sand;
        blastCompound = Items.blastCompound;
        pyratite = Items.pyratite;
        metaglass = Items.metaglass;
        beryllium = Items.beryllium;
        tungsten = Items.tungsten;
        oxide = Items.oxide;
        carbide = Items.carbide;
        fissileMatter = Items.fissileMatter;
        dormantCyst = Items.dormantCyst;

        Items.serpuloItems.add(Items.tungsten, Items.carbide);
        Items.erekirItems.add(Items.titanium);
        Items.erekirOnlyItems.clear();
    }
}










