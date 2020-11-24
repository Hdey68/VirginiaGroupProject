package com.groupVirginia.project1Task5;


    import java.rmi.Remote;
    public class Tester {
        public static void main(String[] args) {
            RemoteWebDriver webDriver=new ChromeDriver();
            webDriver.open();
            webDriver.close();
            webDriver.getTitle();
            webDriver.navigate();
            webDriver.getScreenshot();
            System.out.println("______");
            RemoteWebDriver webDriver1=new FirefoxDriver();
            webDriver1.open();
            webDriver1.close();
            webDriver1.getTitle();
            webDriver1.navigate();
            webDriver1.getScreenshot();
            System.out.println("____________");
            RemoteWebDriver webDriver2=new SafariDriver();
            webDriver2.open();
            webDriver2.close();
            webDriver2.getTitle();
            webDriver2.navigate();
            webDriver2.getScreenshot();
        }
    }

