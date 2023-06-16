package exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class InventoryManager.
 */
public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    /**
     * Initializing before each method
     */
    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    /**
     * Test if stock is sufficient for asked product
     *
     * @param productId
     * @param stockAmount
     */
    @ParameterizedTest
    @CsvSource({"A123, 100"})
    public void SufficientStock(String productId, int stockAmount) {
        inventoryManager.addProduct(productId, stockAmount);
        assertEquals(stockAmount, inventoryManager.getStockAvailability(productId));
    }

    /**
     * Test if stock is insufficient for asked product
     *
     * @param productId
     * @param stockAmount
     */
    @ParameterizedTest
    @CsvSource({"B456, 5"})
    public void InsufficientStock(String productId, int stockAmount) {
        inventoryManager.addProduct(productId, stockAmount);
        assertEquals(stockAmount, inventoryManager.getStockAvailability(productId));
    }

    /**
     * Test out of stock for product
     *
     * @param productId
     * @param stockAmount
     */
    @ParameterizedTest
    @CsvSource({"C789, 0"})
    public void OutOfStock(String productId, int stockAmount) {
        inventoryManager.addProduct(productId, stockAmount);
        assertEquals(stockAmount, inventoryManager.getStockAvailability(productId));
    }

    /**
     * Test if product exist in inventory
     *
     * @param productId
     */
    @ParameterizedTest
    @CsvSource({"D123"})
    public void NonExistingProduct(String productId) {
        assertEquals(0, inventoryManager.getStockAvailability(productId));
    }
    // commentaire à la con
}
