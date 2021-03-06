package Question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;

public class TC {

    public static void main(String[] args) throws InterruptedException, ParseException {

        Util.setup("https://common.olemiss.edu/_js/datatables/examples/data_sources/js_array.html");

        WebElement dropdown = Util.driver.findElement(By.xpath("//select[@name='example_length']"));
        Util.dropDown(dropdown, "100");

        System.out.println("Ascending Verification");
        Util.headers(By.xpath("//th[.='Engine']"));
        Util.ascending(By.className("sorting_1"));
        Util.headers(By.xpath("//th[.='Browser']"));
        Util.ascending(By.xpath("//td[@class='sorting_1']/following-sibling::td[1]"));
        Util.headers(By.xpath("//th[.='Platform']"));
        Util.ascending(By.xpath("//td[@class='sorting_1']/following-sibling::td[2]"));
        Util.headers(By.xpath("//th[.='Version']"));
        Util.ascending(By.xpath("//td[@class='sorting_1']/following-sibling::td[3]"));
        Util.headers(By.xpath("//th[.='Grade']"));
        Util.ascending(By.xpath("//td[@class='sorting_1']/following-sibling::td[4]"));

        System.out.println("\n");

        System.out.println("Descending Verification");
        Util.headers(By.xpath("//th[.='Engine']"));
        Util.descending(By.className("sorting_1"));
        Util.hardWait(1);
        Util.headers(By.xpath("//th[.='Browser']"));
        Util.descending(By.xpath("//td[@class='sorting_1']/following-sibling::td[1]"));
        Util.headers(By.xpath("//th[.='Platform']"));
        Util.descending(By.xpath("//td[@class='sorting_1']/following-sibling::td[2]"));
        Util.headers(By.xpath("//th[.='Version']"));
        Util.descending(By.xpath("//td[@class='sorting_1']/following-sibling::td[3]"));
        Util.headers(By.xpath("//th[.='Grade']"));
        Util.descending(By.xpath("//td[@class='sorting_1']/following-sibling::td[4]"));

        Util.hardWait(2);
        Util.closeBrowser();


    }

}
