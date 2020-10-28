package TestNGDemo.demos;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void myBeforeSuiteMethod()
    {
        System.out.println("myBeforeSuiteMethod()");
    }

    @AfterSuite
    public void myAfterSuiteMethod()
    {
        System.out.println("myAfterSuiteMethod()");
    }


    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1()");
    }

    @Test (groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2()");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3()");
    }
}
