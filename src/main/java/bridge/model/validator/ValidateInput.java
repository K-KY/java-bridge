package bridge.model.validator;

import bridge.view.ErrorMessage;

public class ValidateInput {
    public boolean validateUserInput(String userInput) {
        try{
            integerParsing(userInput);
            return false;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    private void integerParsing(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_CORRECT.getMessage());
        }
    }
}
