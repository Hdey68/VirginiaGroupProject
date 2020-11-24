package com.groupVirginia.project1Task5;

public class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate in Firefox");
    }
    @Override
    public void open() {
        System.out.println("Open Firefox");
    }
    @Override
    public void close() {
        System.out.println("Close Firefox");
    }
    @Override
    public String getTitle() {
        System.out.println("Gets Title from Firefox");
        return null;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Gets screenshot from Firefox");
    }
}
