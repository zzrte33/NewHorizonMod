package newhorizon.expand.cutscene.action;

import arc.scene.actions.Actions;
import arc.util.Time;
import newhorizon.expand.cutscene.components.Action;
import newhorizon.util.func.NHInterp;

import static mindustry.Vars.headless;
import static newhorizon.NHVars.cutsceneUI;

public class InfoFadeInAction extends Action {

    public InfoFadeInAction() {
        super(15);
    }

    @Override
    public void begin() {
        if (headless) return;
        cutsceneUI.infoTable.actions(Actions.fadeIn(maxTimer / Time.toSeconds, NHInterp.bounce5Out));
    }
}
