package com.groupVirginia.project1Task5;

public class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate Safari");
    }
    @Override
    public void open() {
        System.out.println("Open Safari");
    }
    @Override
    public void close() {
        System.out.println("Close Safari");
    }
    @Override
    public String getTitle(){
        System.out.println("Get Title Safari");
        return null;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Get Screenshot Safari");
    }
}
