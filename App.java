
package com.sg.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//saviorv//Downloads//Selinium//chromedriver//chromedriver.exe");
			System.out.println("Hello World!");

			WebDriver webDriver = new ChromeDriver();

			webDriver.get("Hello World");

		} catch (Exception e) {

		}
	}
}
