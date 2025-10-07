package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage {

    /**
     * Основная переменная для хранения драйвера
     */
    public WebDriver driver;

    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    /*
      Xpath
     */

    /**
     * Заголовок страницы
     */
    public static String title_path = "//h3";


    /**
     * Заголовок страницы
     */
    public static int duration_of_waiting_seconds = 10;

    /**
     * Метод для возвращения элемента и проверки того, что элемент видно
     */
    public WebElement set_element(String elementXpath)
    {

        return driver.findElement(By.xpath(elementXpath));
    }

    /**
     * Метод для возвращения элемента и проверки того, что элемент удовлетворяет условию
     * Условия: visible (элемент видно), clickable (элемент кликабелен)
     */
    public WebElement set_element_with_condition(String condition, String elementXpath)
    {

        try {

            if (condition.equals("visible")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            }




        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +elementXpath+  "\" не удовлетворяет условию "+condition);
        }


        return driver.findElement(By.xpath(elementXpath));
    }

    /**
     * Метод для возвращения элемента и проверки того, что элемент удовлетворяет условию с изменяющимся xpath
     * Условия: visible (элемент видно), clickable (элемент кликабелен)
     */
    public WebElement set_element_with_condition(String condition, String elementXpath, String ... xpathParameter)
    {

        try {

            if (condition.equals("visible")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(elementXpath,  xpathParameter))));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath(String.format(elementXpath,  xpathParameter))));
            }




        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +elementXpath+  "\" не удовлетворяет условию "+condition);
        }


        return driver.findElement(By.xpath(String.format(elementXpath, xpathParameter)));
    }


    /**
     * Метод для возвращения элементов и проверки того, что элементы удовлетворяют условию
     * Условия: visible (элемент видно), clickable (элемент кликабелен)
     */
    public List <WebElement> set_elements_with_condition(String condition, String elementXpath)
    {

        try {

            if (condition.equals("visible")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            }




        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +elementXpath+  "\" не удовлетворяет условию "+condition);
        }


        return driver.findElements(By.xpath(elementXpath));
    }

    /**
     * Метод для возвращения элементов и проверки того, что элементы удовлетворяют условию с изменяющимся xpath
     * Условия: visible (элемент видно), clickable (элемент кликабелен)
     */
    public List<WebElement> set_elements_with_condition(String condition, String elementXpath, String ... xpathParameter)
    {

        try {

            if (condition.equals("visible")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath(String.format(elementXpath,  xpathParameter))));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable
                        (By.xpath(String.format(elementXpath, xpathParameter))));
            }
            


        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +elementXpath+  "\" не удовлетворяет условию "+condition);
        }


        return driver.findElements(By.xpath(String.format(elementXpath, xpathParameter)));
    }




    /**
     * Метод для проверки того, что элемент удовлетворяет условию с изменяющимся xpath
     * Условия: visible (элемент видно), clickable (элемент кликабелен), invisible (элемент не видно),
     * alertIsPresent (алерт присутствует), alertIsNotPresent (алерт не присутствует)
     */
    public boolean element_have_condition (String condition, String elementXpath) {
        try {
            if (condition.equals("visible")) {
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
            }

            if (condition.equals("invisible")) {
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXpath)));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            }

            if (condition.equals("alertIsPresent")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.alertIsPresent());
            }

            if (condition.equals("alertIsNotPresent")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
            }


        } catch (Exception e) {
            System.out.println("Элемент с xpath = \"" +elementXpath+  "\" не удовлетворяет условию "+ condition);
            return false;
        }
        return true;
    }

    /**
     * Метод для проверки того, что элемент удовлетворяет условию с изменяющимся xpath
     * Условия: visible (элемент видно), clickable (элемент кликабелен), invisible (элемент не видно),
     * alertIsPresent (алерт присутствует), alertIsNotPresent (алерт не присутствует)
     */
    public boolean element_have_condition (String condition, String elementXpath, String ... xpathParameter) {
        try {
            if (condition.equals("visible")) {
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(elementXpath,  xpathParameter))));
            }

            if (condition.equals("invisible")) {
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(String.format(elementXpath,  xpathParameter))));
            }

            if (condition.equals("clickable")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath(String.format(elementXpath,  xpathParameter))));
            }

            if (condition.equals("alertIsPresent")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.alertIsPresent());
            }

            if (condition.equals("alertIsNotPresent")){
                new WebDriverWait(driver, Duration.ofSeconds(duration_of_waiting_seconds)).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
            }


        } catch (Exception e) {
            System.out.println("Элемент с xpath = \"" +elementXpath+  "\" не удовлетворяет условию "+ condition);
            return false;
        }
        return true;
    }




    /**
     * Метод для перемещения мышки к указанному элементу
     */
    public void moveTo (WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    /**
     * Метод для просмотра логов всех уровней
     */
    public void get_all_level_logs() {
        Set<String> logtyp = driver.manage().logs().getAvailableLogTypes();
        for (String s : logtyp) {
            System.out.println(s);
        }
        LogEntries logEntries = driver.manage().logs().get(LogType.PERFORMANCE);
        List<LogEntry> lg = logEntries.getAll();
        for (LogEntry logEntry : lg) {
            System.out.println(logEntry);

        }
    }





}
