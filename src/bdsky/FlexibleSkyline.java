package bdsky;

import beast.core.Input;
import beast.core.parameter.RealParameter;

import java.util.Arrays;

/**
 * Created by dlouis on 30/04/16.
 *
 * Skyline function for a parameter that allows flexible timelines and implements default values for times
 * - Time forward, relative (default)
 * - Time forward, absolute
 * - Time reverse, relative
 * - Time reverse, absolute
 */
public class FlexibleSkyline extends SimpleSkyline {


    public Input<Boolean> relativeTimesInput =
            new Input<>("relativeTimes", "True if skyline interval times specified relative to the tree origin", true);

    // Need to think more about how to implement this elegantly
    // public Input<Boolean> reverseTimesInput =
    //        new Input<>("reverseTimes", "True if the skyline interval times are measured backwards in time (present to origin), " +
    //                                    "False if the times are in forward time. NOTE that parameter input still given in FORWARD time (origin to tips)", false);

    public void initAndValidate() {

        // Set default times if not set
        if (timesInput.get() == null) {

            if (relativeTimesInput.get() == false) {
                throw new IllegalArgumentException("ERROR! If absolute times are used times need to be specified!");
            } else {
                int size = parameterInput.get().getDimension();
                double step = 1.0/size;
                Double [] times = new Double[size];

                for (int i = 0; i < size; i++) {
                    times[i] = i*step;
                }

                timesInput.setValue(new RealParameter(times), this);
            }

        }

        super.initAndValidate();
    }

}
