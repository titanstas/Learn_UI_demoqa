package demoqa;


import helpers.Drivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;


public class BaseTests {


    /**
     * Основная переменная для хранения драйвера
     */
    WebDriver driver;


    /**
     * Метод для инициализации драйвера из класса Drivers, максимизации окна и установки неявных ожиданий перед каждым тестом
     */
    @BeforeClass (alwaysRun = true)
    public void before(){

        driver = Drivers.Setdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
    }


//    /**
//     * Метод для закрытия браузера после каждого теста
//     */
//    @AfterClass(alwaysRun = true)
//    public void after(){
//        driver.quit();
//    }





}
