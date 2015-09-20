package nz.co.trademe.trademebrowser.objects;

/**
 * Created by kevin on 19/09/15.
 */
public enum Accuracy {
    NONE(0), ADDRESS(1), STREET(3), SUBURB(2);

    private int value;

    private Accuracy(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
