package bridge.model;

import bridge.model.validator.ValidateInput;
import camp.nextstep.edu.missionutils.Console;

public class UserInput {
    public int inputLength(ValidateInput validateInput) {
        String input = Console.readLine();
        while (!validateInput.validateLength(input)) {
            input = Console.readLine();
        }
        return validateInput.integerParsing(input);
    }
}
