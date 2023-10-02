package bridge.model;

import bridge.model.Enums.Commend;
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
    public int inputDirection(ValidateInput validateInput) {
        String input = Console.readLine().toUpperCase();
        while (!validateInput.validateDirection(input)) {
            input = Console.readLine().toUpperCase();
        }
        return validateInput.getDirectionKey(Commend.commend(input));
    }

    public String inputRetry(ValidateInput validateInput) {
        String input = Console.readLine().toUpperCase();
        while (!validateInput.validateRetry(input)) {
            input = Console.readLine().toUpperCase();
        }
        return input;
    }
}
