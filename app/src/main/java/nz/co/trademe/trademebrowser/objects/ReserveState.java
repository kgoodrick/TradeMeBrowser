package nz.co.trademe.trademebrowser.objects;

/**
 * Created by kevin on 19/09/15.
 */
public enum ReserveState {
    NONE(0), MET(1), NOTMET(2), NOTAPPLICABLE(3);
    private int value;

    ReserveState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
