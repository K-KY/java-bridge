package bridge.model.bridgenumber;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.model.Enums.Commend;

import java.util.ArrayList;
import java.util.List;

public class RandomBridgeNumber {
    private final List<Integer> bridgeNumberList = new ArrayList<>();

    public RandomBridgeNumber(int bridgeLength) {
        generateBridgeNumber(bridgeLength);
    }

    private void generateBridgeNumber(int bridgeLength) {
        List<String> bridge = new BridgeMaker(new BridgeRandomNumberGenerator()).makeBridge(bridgeLength);
        for (int i = 0; i < bridgeLength; i++) {
            int bridgeNumber = Commend.commend(bridge.get(i)).getKey();
            bridgeNumberList.add(bridgeNumber);
        }
    }

    public BridgeMap bridgeNumberList() {
        return new BridgeMap(bridgeNumberList);
    }
}


