import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programm\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        Username.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password.sendKeys("secret_sauce");
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        Login.click();

    }
}
