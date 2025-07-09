package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.PageMethod;

public class TestTech extends BaseTest {

    @Test
    public void Testrun() throws InterruptedException {
        PageMethod page = new PageMethod(driver); 
        page.firstName("nikhil");
        page.lastName("Kalb");
}}
