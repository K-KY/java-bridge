package bridge;

import bridge.model.Enums.Commend;
import bridge.model.bridgenumber.BridgeMap;
import bridge.model.bridgenumber.RandomBridgeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    public List<String> makeBridge(int size) {
        List<String> bridgeList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bridgeList.add(commendConvert(bridgeNumberGenerator.generate()));
        }
        return bridgeList;
    }

    private String commendConvert(int number) {
        if (number == 1) {
            return "U";
        }
        if (number == 0) {
            return "D";
        }

        return "";
    }

    /*
 다리의 출력 형식은 "[" + up + "]\n" + "[" + down + "]"
 다리의 길이가 늘어날 때마다 up = up + "|   ", down = down + "|   "
 입력에 따라 공백의 중간에는 o 또는 x 가 들어간다.

         StringBuilder up = new StringBuilder("   ");
        StringBuilder down = new StringBuilder("   ");
        List<String> bridge = new ArrayList<>();
        String bridgePartUP;
        String bridgePartDown;
        for (int i = 1; i < size; i++) {
            up.append("|   ");
            down.append("|   ");
        }
        bridgePartUP = "[" + up +"]";
        bridgePartDown = "\n[" + down +"]";
        bridge.add(bridgePartUP + bridgePartDown);
        return bridge;

*/
}
