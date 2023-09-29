package bridge.model.bridgenumber;

import java.util.List;

public class BridgeMap{
    private final List<BridgeNumber> bridgeMap;

    public BridgeMap(List<BridgeNumber> bridgeMap) {
        this.bridgeMap = bridgeMap;
    }

    public int find() {
        return bridgeMap.get(0).getNumbers();
    }

    public BridgeNumber delete() {
       return bridgeMap.remove(0);
    }
    public int size() {
        return this.bridgeMap.size();
    }
}
