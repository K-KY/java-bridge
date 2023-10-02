package bridge.model;

import bridge.model.bridgenumber.BridgeMap;
import bridge.view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BridgeBuilder {
    List<String> up;
    List<String> down;
    HashMap<String, List<String>> builtBridge;

    public BridgeBuilder(HashMap<String, List<String>> builtBridge) {
        this.up = builtBridge.getOrDefault("up", new ArrayList<>());
        this.down = builtBridge.getOrDefault("down", new ArrayList<>());
        this.builtBridge = builtBridge;
    }

    public HashMap<String, List<String>> bridgeBuilder(BridgeMap bridgeMap, int userInput) {
        if (bridgeMap.find() != userInput) {
            return falseResult(userInput);
        }
        trueResult(bridgeMap, userInput);
        return builtBridge;
    }

    public HashMap<String, List<String>> bridgeBuilder() {
        return builtBridge;
    }

    private int trueResult(BridgeMap bridgeMap, int userInput) {
        int del = bridgeMap.find();
        bridgeTrueUp(bridgeMap, userInput);
        bridgeTrueDown(bridgeMap, userInput);
        builtBridge.put("up", up);
        builtBridge.put("down", down);
        return del;
    }

    private HashMap<String, List<String>> falseResult(int userInput) {
        HashMap<String, List<String>> falseResult = new HashMap<>();
        if (userInput == 0) {
            bridgeFalseDown(falseResult);
        }
        if (userInput == 1) {
            bridgeFalseUp(falseResult);
        }
        return falseResult;
    }

    private void bridgeTrueDown(BridgeMap bridgeMap, int userInput) {
        if (bridgeMap.find() == userInput && userInput == 0) {
            down.add(" O ");
            up.add("   ");
        }
    }

    private void bridgeTrueUp(BridgeMap bridgeMap, int userInput) {
        if (bridgeMap.find() == userInput && userInput == 1) {
            up.add(" O ");
            down.add("   ");
        }
    }

    private void bridgeFalseDown(HashMap<String, List<String>> hash) {
        List<String> newUp = new ArrayList<>(builtBridge.getOrDefault("up", new ArrayList<>()));
        List<String> newDown = new ArrayList<>(builtBridge.getOrDefault("down", new ArrayList<>()));
        newDown.add(" X ");
        newUp.add("   ");
        hash.put("up", newUp);
        hash.put("down", newDown);
    }

    private void bridgeFalseUp(HashMap<String, List<String>> hash) {
        List<String> newUp = new ArrayList<>(builtBridge.getOrDefault("up", new ArrayList<>()));
        List<String> newDown = new ArrayList<>(builtBridge.getOrDefault("down", new ArrayList<>()));
        newUp.add(" X ");
        newDown.add("   ");
        hash.put("up", newUp);
        hash.put("down", newDown);
    }

}
