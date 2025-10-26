package newhorizon.content.blocks;

import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;
import newhorizon.content.NHBlocks;
import newhorizon.content.NHColor;
import newhorizon.content.NHItems;
import newhorizon.expand.block.env.*;

public class EnvironmentBlock {
    public static Atlas_4_12_Floor metalFloorGroove, metalFloorGrooveDeep, metalFloorRidge, metalFloorRidgeHigh;
    public static Atlas_4_4_Floor armorAncient, armorAncientSub, armorQuantum;

    public static Atlas_4_12_Wall armorWall;
    public static TiledFloor metalFloorPlain, labFloorLight, labFloorDark;
    public static DataFloor lineMarkingFloor, lineMarkingFloorQuantum, lineMarkingFloorQuantumDark, lineMarkingFloorAncient, lineMarkingFloorAncientDark;

    public static Floor patternPlate0, patternPlate1;
    public static Floor armorClear;
    public static OreBlock oreZeta, oreSilicon, oreSilicar;

    public static void load() {
        oreZeta = new OreBlock("ore-zeta") {{
            oreDefault = true;
            variants = 3;
            oreThreshold = 0.95F;
            oreScale = 20.380953F;
            itemDrop = NHItems.zeta;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        oreSilicon = new OreBlock("ore-silicon") {{
            oreDefault = true;
            variants = 3;
            oreThreshold = 0.95F;
            oreScale = 20.380953F;
            itemDrop = NHItems.silicon;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};
        
        oreSilicar = new OreBlock("ore-silicar") {{
            oreDefault = true;
            variants = 3;
            oreThreshold = 0.95F;
            oreScale = 20.380953F;
            itemDrop = NHItems.silicar;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};        

        metalFloorGroove = new Atlas_4_12_Floor("metal-floor-groove", true);
        metalFloorGrooveDeep = new Atlas_4_12_Floor("metal-floor-deep-groove", true);
        metalFloorRidge = new Atlas_4_12_Floor("metal-floor-ridge");
        metalFloorRidgeHigh = new Atlas_4_12_Floor("metal-floor-high-ridge");

        armorWall = new Atlas_4_12_Wall("armor-wall");

        armorAncient = new Atlas_4_4_Floor("armor-ancient") {{
            lightColor = NHColor.ancient.cpy().a(0.7f);
            lightRadius = 15f;
            emitLight = true;
        }};
        armorAncientSub = new Atlas_4_4_Floor("armor-ancient-sub") {{
            lightColor = NHColor.ancient.cpy().a(0.7f);
            lightRadius = 15f;
            emitLight = true;
        }};
        armorQuantum = new Atlas_4_4_Floor("armor-quantum") {{
            lightColor = NHColor.darkEnrColor.cpy().a(0.7f);
            lightRadius = 15f;
            emitLight = true;
        }};

        metalFloorPlain = new TiledFloor("plating-metal-floor");
        labFloorLight = new TiledFloor("lab-floor-light", 8, 1);
        labFloorDark = new TiledFloor("lab-floor-dark", 8, 1);

        lineMarkingFloor = new DataFloor("line-marking-floor");
        lineMarkingFloorQuantum = new DataFloor("line-marking-floor-quantum");
        lineMarkingFloorQuantumDark = new DataFloor("line-marking-floor-quantum-dark");
        lineMarkingFloorAncient = new DataFloor("line-marking-floor-ancient");
        lineMarkingFloorAncientDark = new DataFloor("line-marking-floor-ancient-dark");

        patternPlate0 = new MaskFloor("pattern-plate-0");
        patternPlate1 = new MaskFloor("pattern-plate-1");

        //armorClear = new Floor("armor-clear", 0) {{
        //    tilingVariants = 512 / 32;
        //}};

        metalFloorGroove.baseFloor = metalFloorPlain;
        metalFloorGrooveDeep.baseFloor = metalFloorPlain;
        metalFloorRidge.baseFloor = metalFloorPlain;
        metalFloorRidgeHigh.baseFloor = metalFloorPlain;

        armorAncient.blendFloors.add(armorAncientSub);
        armorAncientSub.blendFloors.add(armorAncient);

        armorWall.baseBlock = NHBlocks.metalWallQuantum;
    }
}
