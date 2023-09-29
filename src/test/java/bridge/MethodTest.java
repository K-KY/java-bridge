package bridge;

import bridge.model.bridgenumber.BridgeMap;
import bridge.model.bridgenumber.RandomBridgeNumber;
import bridge.model.validator.ValidateInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MethodTest {

    @Test
    @DisplayName("숫자가 아닌 값이 입력되면 false를 리턴한다.")
    void 잘못된_값이_입력되면_FALSE() {
        boolean b = new ValidateInput().validateLength("a");
        assertThat(b).isFalse();
    }

    @Test
    @DisplayName("숫자가 아닌 값이 입력되면 예외를 발생시킨다.")
    void 잘못된_값이_입력되면_예외() {
        assertThatThrownBy(() -> new ValidateInput().integerParsing("a")).isInstanceOf(IllegalArgumentException.class);
    }




    @Test
    @DisplayName("입력된 숫자만큼 숫자를 생성한다.")
    void 숫자_생성_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        assertThat(list.size()).isEqualTo(3);
    }
    @Test
    @DisplayName("숫자를 삭제한다.")
    void 숫자_삭제_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        list.delete();
        assertThat(list.size()).isEqualTo(2);
    }
    @Test
    @DisplayName("숫자를 가져오고 값이 0또는 1인지 확인한다.")
    void 숫자_크기_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        for (int i = 0; i < list.size(); i++) {
            int number = list.delete().getNumbers();
            assertThat(number).isIn(0,1);
        }

    }


}
