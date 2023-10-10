package day_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c02_junitanitations {
    /*
     ******JUNIT*****
    Java ile en temel framework JUNit ile oluşturulabilir.
    * JUnit açık kaynaklı bir birim test aracıdır ve küçük/büyük kod birimlerini test etmek için kullanılır
    * JUnit testini çalıştırmak için bir sınıf nesnesi oluşturmanız veya main method tanımlamanız gerekmez.
    Developerlar da unit testleri calistirmak icin kullanirlar.
    Biz testlerimizi yapmak icin JUnit'in ileri sürümü olduğundan TestNG framework oluşturup kullanacagiz
    * JUnit ayrıca birden çok test senaryosuna sahip Otomasyon paketini çalıştırmak için kullanılır.
    *
    *
    * Test dediğimizde tek bir method veya içinde birçok class ve package barındıran bir yapı olabilir.
    *  Regression Test, Smoke Test vb.
    * Testmethod’u ise @Test notasyonu kullanılarak oluşturulan ve bağımsız olarak çalıştırabileceğimiz en küçük test yapısıdır.
    @Test annotation : Test methodu
     */

    @Test
    public void test01 (){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        String googletitle=driver.getTitle();

        System.out.println("googletitle = " + googletitle);


    }
    @Test
    public void test02 (){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        String facebooktitle=driver.getTitle();

        System.out.println("facebooktitle = " + facebooktitle);


    }
}
