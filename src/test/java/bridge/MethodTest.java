package bridge;

import bridge.model.validator.ValidateInput;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodTest {

    @Test
    void 잘못된_값이_입력되면_True() {
        boolean b = new ValidateInput().validateUserInput("a");
        assertThat(b).isTrue();
    }

}
