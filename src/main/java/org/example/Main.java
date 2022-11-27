package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static javax.swing.text.html.CSS.getAttribute;

public class Main {

    public String baseUrl = "https://www.okg.se/en";
    String driverPath = "driver//chromedriver.exe";
    public WebDriver driver ;

    public static void main(String[] args) throws IOException {
        System.out.println("Task 3");
        Document doc = (Document) Jsoup.connect("https://www.okg.se/en").get();

        Elements curent_value = doc.getElementsByClass("list-text list-text--larger");
        String curent_value_desc =curent_value.text();
//        String link = doc.select("the-gauge").text();
//        String atr = link.attr("href");
        System.out.println("Value is "+curent_value_desc);

//        String url = "http://en.wikipedia.org/wiki/Potato";
//        Document doc1 = Jsoup.connect(url).get();
//        Elements paragraphs = (Elements) doc1.select(".mw-content-ltr p");
//        String firstParagraph = paragraphs.first().text();

//        Document doc2 = Jsoup.connect("http://stackoverflow.com/questions/12439078/jtidy-or-jsoup-for-java").get();
//        String question = doc2.select("#question-header").text(); // JTidy or Jsoup for Java
//        System.out.println(question);


//        ---------------Selenium--------


//        WebDriverWait wait = new WebDriverWait(webDriver, 20);
//        WebElement td =driver.findElement(By.xpath("//*table/tr/td[1]"));
//        String oldText = td.getText();
//        driver.findElement(By.id("change")).click();
//        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*table/tr/td[1]"), oldText)));
//        System.out.println(td.getText());

    }

    @Test
    public void test() {
        // set the system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // scroll down by 1000 pixels with Javascript Executor
        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("window.scrollBy(0,1200)");
        // scroll down to visibly element on page with Javascript Executor
        WebElement scroll_Element = driver.findElement(By.className("value-text"));
        j.executeScript("arguments[0].scrollIntoView();",scroll_Element );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

//        // get the current URL of the page
//        String URL= driver.getCurrentUrl();
//        System.out.print(URL);
//        //get the title of the page
//        String title = driver.getTitle();
//        System.out.println(title);

        WebElement attributeValue = driver.findElement(By.className("value-text"));
//        WebElement attributeValue = driver.findElement(new By.ByCssSelector("//h1[@class=intro-title mb-4]"));
//        String atr_tmp = attributeValue.getAttribute("class");
        String atr_tmp = attributeValue.getText();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date date = new Date();
        System.out.println("Task 3, LSEG");
        System.out.println("value:"+atr_tmp+", time:"+formatter.format(date));

    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
        System.out.println("\nafter test");
    }

}