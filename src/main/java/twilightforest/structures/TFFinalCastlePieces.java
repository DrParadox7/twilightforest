package twilightforest.structures;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleBellFoundation21;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleBellTower21;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleBossGazebo;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleBridge;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDamagedTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDungeonEntrance;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDungeonExit;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDungeonForgeRoom;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDungeonRoom31;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleDungeonSteps;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleEntranceBottomTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleEntranceSideTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleEntranceStairs;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleEntranceTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleFoundation13;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleFoundation13Thorns;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleFoundation48;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleLargeTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleMain;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleMazeTower13;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleMural;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleRoof13Conical;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleRoof13Crenellated;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleRoof13Peaked;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleRoof48Crenellated;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleRoof9Crenellated;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleStairTower;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleWreckedTower;

public class TFFinalCastlePieces {

    public static void registerFinalCastlePieces() {
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleMain.class, "TFFCMain");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleStairTower.class, "TFFCStTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleLargeTower.class, "TFFCLaTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleMural.class, "TFFCMur");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleFoundation48.class, "TFFCToF48");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleRoof48Crenellated.class, "TFFCRo48Cr");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleBossGazebo.class, "TFFCBoGaz");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleMazeTower13.class, "TFFCSiTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDungeonSteps.class, "TFFCDunSt");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDungeonEntrance.class, "TFFCDunEn");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDungeonRoom31.class, "TFFCDunR31");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDungeonExit.class, "TFFCDunEx");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDungeonForgeRoom.class, "TFFCDunBoR");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleRoof9Crenellated.class, "TFFCRo9Cr");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleRoof13Crenellated.class, "TFFCRo13Cr");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleRoof13Conical.class, "TFFCRo13Con");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleRoof13Peaked.class, "TFFCRo13Pk");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleEntranceTower.class, "TFFCEnTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleEntranceSideTower.class, "TFFCEnSiTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleEntranceBottomTower.class, "TFFCEnBoTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleEntranceStairs.class, "TFFCEnSt");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleBellTower21.class, "TFFCBelTo");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleBridge.class, "TFFCBri");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleFoundation13.class, "TFFCToF13");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleBellFoundation21.class, "TFFCBeF21");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleFoundation13Thorns.class, "TFFCFTh21");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleDamagedTower.class, "TFFCDamT");
        MapGenStructureIO.func_143031_a(ComponentTFFinalCastleWreckedTower.class, "TFFCWrT");
    }

}
