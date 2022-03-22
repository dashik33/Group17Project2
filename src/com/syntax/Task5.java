package com.syntax;

public class Task5 {
    public static void main(String[] args) {
RemoteWebDriver[] array={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
for (RemoteWebDriver elements: array){
    elements.open();
    elements.close();
    elements.navigate();
    elements.getScreenshot();
    System.out.println(elements.getTitle());
}
    }
}
interface WebDriver {
    String getTitle();
    void open();
    void close();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public String getTitle() {
        return "Getting ChromeDriver Title";
    }

    @Override
    public void open() {
        System.out.println("Opening ChromeDriver");

    }

    @Override
    public void close() {
        System.out.println("Closing ChromeDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to ChromeDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking Screenshots in ChromeDriver");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public String getTitle() {
        return "Getting FirefoxDriver Title";
    }

    @Override
    public void open() {
        System.out.println("Opening FirefoxDriver");

    }

    @Override
    public void close() {
        System.out.println("Closing FirefoxDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to FirefoxDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking Screenshots in FirefoxDriver");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public String getTitle() {
        return "Getting SafariDriver Title";
    }

    @Override
    public void open() {
        System.out.println("Opening SafariDriver");

    }

    @Override
    public void close() {
        System.out.println("Closing SafariDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to SafariDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking Screenshots in SafariDriver");
    }
}