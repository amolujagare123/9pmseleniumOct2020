package TestNGDemo.demos;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
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


    @Parameters({"username","password"})
    @Test
    public void classThreeTest3(String param1,String param2)
    {
        String user = param1;
        String pass = param2;
        System.out.println("user:"+user+" pass:"+pass);
        System.out.println("classThreeTest3()");
    }
}
