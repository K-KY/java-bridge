package bridge.view;

import bridge.model.UserInput;
import bridge.model.validator.ValidateInput;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return new UserInput().inputLength(new ValidateInput());
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public int readMoving() {
        return new UserInput().inputDirection(new ValidateInput());
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return new UserInput().inputRetry(new ValidateInput());
    }
}
