package stepDef;

import configFile.BaseClass;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class Hooks {
    @Before
    public void LaunchBrowser() throws IOException {
        BaseClass.setDriver();

    }
    @After
    public void tearDown(){
        // BaseClass.getDriver().quit();
    }

}




