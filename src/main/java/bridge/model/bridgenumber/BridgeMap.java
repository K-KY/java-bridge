package bridge.model.bridgenumber;

import java.util.List;

public class BridgeMap{
    private final List<Integer> bridgeMap;

    public BridgeMap(List<Integer> bridgeMap) {
        this.bridgeMap = bridgeMap;
    }

    public int find() {
        int get = -1;
        if (bridgeMap.size() > 0) {
            get = bridgeMap.get(0);
        }
        return get;
    }
    public int find(int i) {
        return bridgeMap.get(i);
    }

    public int delete() {
        int del = -1;
        if (bridgeMap.size() > 0) {
            del = bridgeMap.remove(0);
        }
        return del;
    }
    public void destroy() {
        bridgeMap.clear();
    }
    public int size() {
        return this.bridgeMap.size();
    }
}
