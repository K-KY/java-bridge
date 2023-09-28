package bridge.model.validator;

import bridge.view.ErrorMessage;

public class ValidateInput {
    public boolean validateLength(String userInput) {
        //try 에서 예외가 나오지 않으면 false 를 리턴한다.
        try{
            int n = integerParsing(userInput);
            return validateRange(n);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private boolean validateRange(int n) {
        return n > 0;
    }

    public int integerParsing(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_CORRECT.getMessage());
        }
        return Integer.parseInt(userInput);
    }
}
