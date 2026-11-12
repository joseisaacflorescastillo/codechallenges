/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class EcommerceWorkflowTest {


    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        // Inicializar el navegador (Asegúrate de tener configurado tu WebDriverManager o ruta del driver)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Configurar espera explícita de 10 segundos
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testEndToEndShoppingWorkflow() {
        // 1. Abrir la aplicación de e-commerce
        driver.get("https://ejemplo-ecommerce.com");

        // 2. Iniciar sesión con credenciales válidas
        // (Los IDs o selectores dependen de la app, aquí usamos ejemplos estándar)
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-link")));
        loginButton.click();

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        usernameField.sendKeys("usuario_valido@test.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password123!");

        driver.findElement(By.id("login-submit-btn")).click();

        // Verificar que el login fue exitoso (ej. aparece el botón de perfil o cierre de sesión)
        WebElement userProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-profile")));
        Assert.assertTrue(userProfile.isDisplayed(), "El inicio de sesión falló.");

        // 3. Buscar un producto llamado "Laptop"
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.clear();
        searchBox.sendKeys("Laptop");

        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();

        // 4. Aplicar el filtro de categoría "Electronics"
        WebElement categoryElectronics = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[contains(text(), 'Electronics')]/input | //input[@value='electronics']")
        ));
        categoryElectronics.click();

        // 5. Verificar que los resultados de la búsqueda estén filtrados y muestren laptops
        // Esperamos a que los elementos de la lista de productos se actualicen
        List<WebElement> productList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector(".product-item")
        ));

        Assert.assertFalse(productList.isEmpty(), "No se encontraron productos después de aplicar los filtros.");

        // Validar que al menos el primer producto contenga "Laptop" en su título
        WebElement firstProductTitle = productList.get(0).findElement(By.cssSelector(".product-title"));
        String productName = firstProductTitle.getText();

        Assert.assertTrue(productName.toLowerCase().contains("laptop"),
                "El producto encontrado no coincide con la búsqueda. Título actual: " + productName);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Cierra el navegador y finaliza la sesión del driver
        }
    }

}

 */