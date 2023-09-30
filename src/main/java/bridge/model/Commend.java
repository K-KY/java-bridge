package bridge.model;


public enum Commend {
    UP(1, "U"), DOWN(0, "D");
    private final int key;
    private final String cmd;
    Commend(int key, String cmd){
        this.key = key;
        this.cmd = cmd;
    }
    public String getCmd() {
        return cmd;
    }

    public int getKey() {
        return key;
    }


}
