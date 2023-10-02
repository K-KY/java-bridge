package bridge.view;

import bridge.model.BridgeBuilder;
import bridge.model.bridgenumber.BridgeMap;

import java.util.HashMap;
import java.util.List;

public class SystemMessage {
    public void start() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void inputDirection() {
        System.out.println("\n이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }

    public void inputRetry() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }

    public void gameResult(HashMap<String, List<String>> hash, int trial) {
        System.out.println("\n최종 게임 결과");
        new OutputView().printMapFalse(hash);
        System.out.println("게임 성공 여부: 실패");
        System.out.println("총 시도한 횟수: " + trial);

    }
    public void gameResult(BridgeBuilder bridgeBuilder, int trial) {
        System.out.println("\n최종 게임 결과");
        new OutputView().printResult(bridgeBuilder.bridgeBuilder());
        System.out.println("\n게임 성공 여부: 성공");
        System.out.println("총 시도한 횟수: " + trial);

    }
}
