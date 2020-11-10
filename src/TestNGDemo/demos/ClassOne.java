package TestNGDemo.demos;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    // the method written below the annoatation @BeforeTest
    // runs before the test tag <test> inside the testng.xml
    // the class wherein the Method with the annotation @BeforeTest is,
    // must be included in the test tag <test>
    public void beforeMyTestMethod()
    {
        System.out.println("BeforeMyTestMethod()");
    }

    @AfterTest
    // the method written below the annoatation @AfterTest
    // runs After the test tag <test> inside the testng.xml
    // the class wherein the Method with the annotation @AfterTest is,
    // must be included in the test tag <test>
    public void afterMyTestMethod()
    {
        System.out.println("AfterMyTestMethod()");
    }


    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1()");

        Assert.assertEquals(true,false, "this test is failed");
    }

    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2()");
    }



    @Parameters({"username","password"})
    @Test
    public void classOneTest3(String param1,String param2)
    {
        String user = param1;
        String pass = param2;
        System.out.println("user:"+user+" pass:"+pass);
        System.out.println("classOneTest3()");
    }

}
