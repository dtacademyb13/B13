package day32;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        System.out.println("Enter a browser: ");

        String browserType = new Scanner(System.in).next();

        final Browser browser;

        switch (browserType){

            case "chrome":
                browser = new Chrome();
                break;

            case "edge":
                browser = new Edge();
                break;
            case "gpt":
                browser = new GPTBrowser();
                break;

            default:
                browser = new Chrome();
        }

        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();
        browser.open();



    }
}
