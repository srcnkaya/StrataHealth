package CheckBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {

        public static WebDriver driver;
        public static void setup(String url) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
        }

        public static void checkBox(String text) {

            List<WebElement> checkBoxes = driver.findElements(By.xpath(text));
            int size = checkBoxes.size();
            for (int i=0; i<size; i++){
                checkBoxes.get(i).click();
            }

            boolean verify = driver.findElement(By.xpath(text)).isSelected();
            if (verify){
                System.out.println("AllBoxes are selected");
            }else{
                System.out.println("Boxes are not selected");
            }
        }

    public static void main(String[] args) throws InterruptedException {
        setup("https://demo.guru99.com/test/radio.html");
        checkBox("//input[@type='checkbox']");
        Thread.sleep(3000);
        driver.quit();
    }


}


