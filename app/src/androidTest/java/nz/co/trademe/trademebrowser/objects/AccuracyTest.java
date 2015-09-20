package nz.co.trademe.trademebrowser.objects;

import junit.framework.TestCase;

/**
 * Created by kevin on 19/09/15.
 */
public class AccuracyTest extends TestCase {

    public void testName() throws Exception {
        Accuracy res = Accuracy.NONE;
        assertTrue(res.name().equals("NONE"));
        assertFalse(res.name().equals("ADDRESS"));
        assertFalse(res.name().equals("STREET"));
        assertFalse(res.name().equals("SUBURB"));

        res = Accuracy.ADDRESS;
        assertTrue(res.name().equals("ADDRESS"));
        assertFalse(res.name().equals("NONE"));
        assertFalse(res.name().equals("STREET"));
        assertFalse(res.name().equals("SUBURB"));

        res = Accuracy.STREET;
        assertTrue(res.name().equals("STREET"));
        assertFalse(res.name().equals("ADDRESS"));
        assertFalse(res.name().equals("NONE"));
        assertFalse(res.name().equals("SUBURB"));

        res = Accuracy.SUBURB;
        assertTrue(res.name().equals("SUBURB"));
        assertFalse(res.name().equals("ADDRESS"));
        assertFalse(res.name().equals("STREET"));
        assertFalse(res.name().equals("NONE"));
    }

    public void testOrdinal() throws Exception {

        Accuracy res = Accuracy.NONE;
        assertTrue(res.ordinal() == 0);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 2);
        assertFalse(res.ordinal() == 3);

        res = Accuracy.ADDRESS;
        assertTrue(res.ordinal() == 1);
        assertFalse(res.ordinal() == 0);
        assertFalse(res.ordinal() == 2);
        assertFalse(res.ordinal() == 3);

        res = Accuracy.STREET;
        assertTrue(res.ordinal() == 2);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 3);
        assertFalse(res.ordinal() == 0);

        res = Accuracy.SUBURB;
        assertTrue(res.ordinal() == 3);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 0);
        assertFalse(res.ordinal() == 2);

    }

    public void testValue() throws Exception {
        Accuracy res = Accuracy.NONE;
        assertTrue(res.getValue() == 0);

        res = Accuracy.ADDRESS;
        assertTrue(res.getValue() == 1);

        res = Accuracy.STREET;
        assertTrue(res.getValue() == 3);

        res = Accuracy.SUBURB;
        assertTrue(res.getValue() == 2);

    }
}