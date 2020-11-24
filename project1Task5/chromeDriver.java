package com.groupVirginia.project1Task5;

import java.sql.SQLOutput;
class ChromeDriver implements RemoteWebDriver, TakesScreenshot {
    @Override
    public void navigate() {
        System.out.println("Navigate in Chrome");
    }
    @Override
    public void open() {
        System.out.println("Open in Chrome");
    }
    @Override
    public void close() {
        System.out.println("Close in Chrome");
    }
    @Override
    public String getTitle() {
        System.out.println("Get title from Chrome");
        return null;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Get Screenshot");
    }
}
