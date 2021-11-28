package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edibles.EarOfCornTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CarrotPlantTest.class,
        CornStalkTest.class,
        PepperPlantTest.class,
        PotatoPlantTest.class,
        TomatoPlantTest.class
})

public class CropTestSuite {

}
