import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Application {

    private static String Path_GecoDriver= "C:\\astha\\tools";

    public static void main(String[] args) {
        System.out.println("Before Chrome call");

        System.setProperty("webdriver.gecko.driver", Path_GecoDriver+"/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


//
//
//        ProfilesIni profile = new ProfilesIni();
//
//        FirefoxProfile myProfile = profile.getProfile("profileToolsQA");
//

//       // EdgeDriver driver = new EdgeDriver();

//        ChromeDriver driver = new ChromeDriver();


        driver.get("http://google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Hello World !!!");
        driver.quit();
        System.out.println("After Chrome call");

    }
}
