package Question2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.*;

public class Util {

    public static WebDriver driver;

    public static void setup(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void dropDown(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ascending(By element) {
        List<WebElement> list = Util.driver.findElements(element);
        ArrayList<String> original = new ArrayList<String>();

        for (WebElement each : list) {
            original.add(each.getText());
        }
        ArrayList<String> sorted = new ArrayList<String>();
        for (WebElement each1 : list) {
            sorted.add(each1.getText());
        }
        Collections.sort(sorted);
        boolean asc = original.equals(original);

        if (asc == true) {
            System.out.println("Verification Succesfull!");
        } else
            System.out.println("Verification Failed!");

    }

    public static void hardWait(int wait) throws InterruptedException {
        Thread.sleep(wait * 1000);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void headers(By element) {
        List<WebElement> header = driver.findElements(element);

        ArrayList<String> original = new ArrayList<String>();
        for (WebElement each : header) {

            original.add(each.getText());
        }
        System.out.println(original);
    }

    public static void descending(By element) throws ParseException {

        List<WebElement> list = Util.driver.findElements(element);
        List<String> original = new ArrayList<>();

        for (WebElement each : list) {
            original.add(each.getText());
        }
        List<String> sorted = new ArrayList<>();
        for (WebElement each1 : list) {
            sorted.add(each1.getText());
        }

        Collections.sort(sorted, Collator.getInstance(Locale.US));
        Collections.reverse(sorted);

        boolean asc = original.equals(original);

        if (asc == true) {
            System.out.println("Verification Succesfull!");
        } else
            System.out.println("Verification Failed!");

    }
}

