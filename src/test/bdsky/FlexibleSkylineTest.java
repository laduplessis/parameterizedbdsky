package test.bdsky;

import bdsky.FlexibleSkyline;
import beast.core.parameter.RealParameter;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by dlouis on 30/04/16.
 */
public class FlexibleSkylineTest {

    @Test
    public void testGetValue() throws Exception {

        FlexibleSkyline skyline = new FlexibleSkyline();
        skyline.setInputValue("parameter", new RealParameter("-1 4 5 2 2 21 1 2"));

        skyline.initAndValidate();

        //System.out.println(Arrays.toString(skyline.getTimes()));

        /*
        assertEquals(-1, skyline.getValue(0)[0], 0);
        assertEquals(-1, skyline.getValue(0.5)[0], 0);

        assertEquals(3, skyline.getValue(1)[0], 0);
        assertEquals(3, skyline.getValue(1.5)[0], 0);

        assertEquals(4, skyline.getValue(2)[0], 0);
        assertEquals(4, skyline.getValue(2.5)[0], 0);

        assertEquals(-1.5, skyline.getValue(3)[0], 0);
        assertEquals(-1.5, skyline.getValue(3.5)[0], 0);
        */
    }

}
