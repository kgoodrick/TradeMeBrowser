package nz.co.trademe.trademebrowser.objects;

import junit.framework.TestCase;

/**
 * Created by kevin on 19/09/15.
 */
public class ReserveStateTest extends TestCase {

    public void testName() throws Exception {
        ReserveState res = ReserveState.NONE;
        assertTrue(res.name().equals("NONE"));
        assertFalse(res.name().equals("MET"));
        assertFalse(res.name().equals("NOTMET"));
        assertFalse(res.name().equals("NOTAPPLICABLE"));

        res = ReserveState.MET;
        assertTrue(res.name().equals("MET"));
        assertFalse(res.name().equals("NONE"));
        assertFalse(res.name().equals("NOTMET"));
        assertFalse(res.name().equals("NOTAPPLICABLE"));

        res = ReserveState.NOTMET;
        assertTrue(res.name().equals("NOTMET"));
        assertFalse(res.name().equals("MET"));
        assertFalse(res.name().equals("NONE"));
        assertFalse(res.name().equals("NOTAPPLICABLE"));

        res = ReserveState.NOTAPPLICABLE;
        assertTrue(res.name().equals("NOTAPPLICABLE"));
        assertFalse(res.name().equals("MET"));
        assertFalse(res.name().equals("NONE"));
        assertFalse(res.name().equals("NOTMET"));

    }

    public void testOrdinal() throws Exception {
        ReserveState res = ReserveState.NONE;
        assertTrue(res.ordinal() == 0);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 2);
        assertFalse(res.ordinal() == 3);

        res = ReserveState.MET;
        assertTrue(res.ordinal() == 1);
        assertFalse(res.ordinal() == 0);
        assertFalse(res.ordinal() == 2);
        assertFalse(res.ordinal() == 3);

        res = ReserveState.NOTMET;
        assertTrue(res.ordinal() == 2);
        assertFalse(res.ordinal() == 0);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 3);

        res = ReserveState.NOTAPPLICABLE;
        assertTrue(res.ordinal() == 3);
        assertFalse(res.ordinal() == 0);
        assertFalse(res.ordinal() == 1);
        assertFalse(res.ordinal() == 2);


    }

    public void testValue() throws Exception {

        ReserveState res = ReserveState.NONE;
        assertTrue(res.getValue() == 0);

        res = ReserveState.MET;
        assertTrue(res.getValue() == 1);

        res = ReserveState.NOTMET;
        assertTrue(res.getValue() == 2);

        res = ReserveState.NOTAPPLICABLE;
        assertTrue(res.getValue() == 3);
    }
}