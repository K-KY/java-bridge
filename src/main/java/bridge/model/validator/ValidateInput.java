package bridge.model.validator;

import bridge.model.Enums.Commend;
import bridge.model.Enums.ErrorMessage;

public class ValidateInput {
    public boolean validateLength(String bridgeLength) {
        //try 에서 예외가 나오지 않으면 false 를 리턴한다.
        try{
            int n = integerParsing(bridgeLength);
            return validateRange(n);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private boolean validateRange(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_CORRECT.getMessage());
        }
        return true;
    }

    public int integerParsing(String bridgeLength) {
        try {
            Integer.parseInt(bridgeLength);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_CORRECT.getMessage());
        }
        return Integer.parseInt(bridgeLength);
    }

    public boolean validateDirection(String direction) {
        try {
            getDirectionKey(Commend.commend(direction.toUpperCase()));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public int getDirectionKey(Commend commend) {
        return commend.getKey();
    }

}
