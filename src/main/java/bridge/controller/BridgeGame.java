package bridge.controller;

import bridge.model.BridgeBuilder;
import bridge.model.UserInput;
import bridge.model.bridgenumber.BridgeMap;
import bridge.model.bridgenumber.RandomBridgeNumber;
import bridge.model.validator.ValidateInput;
import bridge.view.OutputView;
import bridge.view.SystemMessage;

import java.util.HashMap;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    BridgeMap bridgeMap;
    BridgeBuilder bridgeBuilder = new BridgeBuilder(new HashMap<>());
    int trial = 1;
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move(BridgeBuilder bridgeBuilder) {
        new SystemMessage().inputDirection();
        int input = new UserInput().inputDirection(new ValidateInput());
        HashMap<String, List<String>> hash = bridgeBuilder.bridgeBuilder(bridgeMap, input);
        printOutput(hash, input);
    }

    public void printOutput(HashMap<String, List<String>> hash, int input) {
        if (bridgeMap.find() != input) {
            new OutputView().printMapFalse(hash);
            retry(hash);
        }
        if (bridgeMap.find() == input) {
            new OutputView().printMap(hash);
            bridgeMap.delete();
        }
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry(HashMap<String, List<String>> hash) {
        String input = new UserInput().inputRetry(new ValidateInput());
        if (input.equals("R")) {
            trial++;
            return;
        }
        if (input.equals("Q")) {
            bridgeMap.destroy();
            new SystemMessage().gameResult(hash, trial);
        }
    }
    public void gameStart() {
        new SystemMessage().start();
        int length = new UserInput().inputLength(new ValidateInput());
        bridgeMap = new RandomBridgeNumber(length).bridgeNumberList();
        for (int i = 0; i < bridgeMap.size(); i++) {
            System.out.println(bridgeMap.find(i));
        }
        while(bridgeMap.size() > 0) {
            move(bridgeBuilder);
        }
        new SystemMessage().gameResult(bridgeBuilder, trial);

    }
}
