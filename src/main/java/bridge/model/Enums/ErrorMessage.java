package bridge.model.Enums;

public enum ErrorMessage {
    ERROR_NOT_CORRECT("[ERROR] 올바른 입력이 아닙니다");
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
