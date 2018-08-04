package driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.Date;

@Slf4j
public class Driver {
    public static void main(String[] args) {
        LocalWebDriver localWebDriver = new LocalWebDriver();
        localWebDriver.init();

        DriverManager driverManager = new DriverManager();
        driverManager.downloadChrome();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://vk.com//");

        LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            //do something useful with the data
        }
    }
}
