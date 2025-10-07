package demoqa;


import helpers.Drivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseTests {


    /**
     * Основная переменная для хранения драйвера
     */
    WebDriver driver;


    /**
     * Метод для инициализации драйвера из класса Drivers, максимизации окна и установки неявных ожиданий перед каждым тестом
     */
    @BeforeClass
    public void before(){

        driver = Drivers.Setdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
    }


//    /**
//     * Метод для закрытия браузера после каждого теста
//     */
//    @AfterClass
//    public void after(){
//        driver.quit();
//    }





}
