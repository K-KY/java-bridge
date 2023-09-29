package bridge.model.bridgenumber;

import bridge.BridgeRandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class RandomBridgeNumber {
    private final List<BridgeNumber> bridgeNumberList = new ArrayList<>();
    public RandomBridgeNumber(int bridgeLength) {
        generateBridgeNumber(bridgeLength);
    }
    private void generateBridgeNumber(int bridgeLength) {
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        for (int i = 0; i < bridgeLength; i++) {
            int generatedBridgeNumber = bridgeRandomNumberGenerator.generate();
            BridgeNumber bridgeNumber = new BridgeNumber(generatedBridgeNumber);
            bridgeNumberList.add(bridgeNumber);
        }
    }
    public BridgeMap bridgeNumberList() {
        return new BridgeMap(bridgeNumberList);
    }
}


