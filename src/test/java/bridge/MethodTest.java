package bridge;

import bridge.model.bridgenumber.BridgeMap;
import bridge.model.bridgenumber.RandomBridgeNumber;
import bridge.model.validator.ValidateInput;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MethodTest {

    @Test
    void 잘못된_값이_입력되면_FALSE() {
        boolean b = new ValidateInput().validateLength("a");
        assertThat(b).isFalse();
    }

    @Test
    void 잘못된_값이_입력되면_예외() {
        assertThatThrownBy(() -> new ValidateInput().integerParsing("a")).isInstanceOf(IllegalArgumentException.class);
    }




    @Test
    void 숫자_생성_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        assertThat(list.size()).isEqualTo(3);
    }
    @Test
    void 숫자_삭제_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        list.delete();
        assertThat(list.size()).isEqualTo(2);
    }
    @Test
    void 숫자_가져오기_테스트() {
        RandomBridgeNumber randomBridgeNumber = new RandomBridgeNumber(3);
        BridgeMap list = randomBridgeNumber.bridgeNumberList();
        assertThat(list.find()).isGreaterThanOrEqualTo(0);
    }


}
