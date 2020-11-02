package TestNGDemo.demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1()");
    }

    @Test (groups = "email")//(enabled=false)
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2()");
    }


    @Parameters({"username","password"})
    @Test
    public void classTwoTest3(String param1,String param2)
    {
       String user = param1;
       String pass = param2;
       System.out.println("user:"+user+" pass:"+pass);

        System.out.println("classTwoTest3()");
    }
}
