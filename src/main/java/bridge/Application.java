package bridge;

import bridge.controller.BridgeGame;
import bridge.model.BridgeBuilder;
import bridge.model.UserInput;
import bridge.model.bridgenumber.BridgeMap;
import bridge.model.bridgenumber.RandomBridgeNumber;
import bridge.model.validator.ValidateInput;
import bridge.view.OutputView;

import java.util.HashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BridgeGame bridgeGame = new BridgeGame();
        bridgeGame.gameStart();
    }
}
