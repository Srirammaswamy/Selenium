package selenium_webdriver;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_webdriver {

	public void firefox_driver() {
		WebDriver firefoxDriver = new FirefoxDriver();
		String baseURL = "https://www.fifa.com/worldcup/players/player/201200/profile";
		firefoxDriver.get(baseURL);
		int age;
		String name, dob, details, s;
		name = firefoxDriver.findElement(By.className("fi-ph__player__name")).getText();
		s = firefoxDriver.findElement(By.className("fi-p__profile-number__number")).getText();
		age = Integer.parseInt(s);
		dob = firefoxDriver.findElement(By.className("fi-p__profile-text")).getText();
		details = firefoxDriver.findElement(By.className("fi-article__body")).getText();
		System.out.println("Name : "+name);
		System.out.println();
		System.out.println("Age : "+age);
		System.out.println();
		System.out.println(dob);
		System.out.println();
		System.out.println("Details :-"+"\n"+"----------"+"\n\t"+details);
		
		firefoxDriver.close();
	}

	public void chrome_driver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sriram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		String baseURL = "https://www.fifa.com/worldcup/players/player/201200/profile";
		FileWriter fw = new FileWriter("output.txt");
		chromeDriver.get(baseURL);
		int age;
		String name, dob, details, s;
		name = chromeDriver.findElement(By.className("fi-ph__player__name")).getText();
		s = chromeDriver.findElement(By.className("fi-p__profile-number__number")).getText();
		age = Integer.parseInt(s);
		dob = chromeDriver.findElement(By.className("fi-p__profile-text")).getText();
		details = chromeDriver.findElement(By.className("fi-article__body")).getText();
		System.out.println("Name : "+name);
		System.out.println();
		System.out.println("Age : "+age);
		System.out.println();
		System.out.println(dob);
		System.out.println();
		System.out.println("Details :-"+"\n"+"----------"+"\n\t"+details);
		
		fw.write("Name : "+name);
		fw.write("Age : "+age);
		fw.write(dob);
		fw.write("Details : "+details);
		fw.close();

		chromeDriver.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Selenium_webdriver driver = new Selenium_webdriver();
	//	driver.firefox_driver();		
		driver.chrome_driver();

	}

}
