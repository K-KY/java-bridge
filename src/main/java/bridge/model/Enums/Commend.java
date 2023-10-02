package bridge.model.Enums;

public enum Commend {
    UP(1, "U"), DOWN(0, "D");
    private final int key;
    private final String cmd;
    Commend(int key, String cmd){
        this.key = key;
        this.cmd = cmd;
    }

    public int getKey() {
        return key;
    }

    public static Commend commend(String direction) {
        for (int i = 0; i < values().length; i++) {
            if (direction.equals(values()[i].cmd)) {
                return values()[i];
            }
        }
        throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_CORRECT.getMessage());
    }

}
