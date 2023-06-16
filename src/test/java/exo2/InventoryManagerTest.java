package exo2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    @Test
    public void testSufficientStock() {
        inventoryManager.addProduct("A123", 100);
        assertEquals(100, inventoryManager.getStockAvailability("A123"));
    }

    @Test
    public void testInsufficientStock() {
        inventoryManager.addProduct("B456", 5);
        assertEquals(5, inventoryManager.getStockAvailability("B456"));
    }

    @Test
    public void testOutOfStock() {
        inventoryManager.addProduct("C789", 0);
        assertEquals(0, inventoryManager.getStockAvailability("C789"));
    }

    @Test
    public void testNonExistingProduct() {
        assertEquals(0, inventoryManager.getStockAvailability("D123"));
    }
}

