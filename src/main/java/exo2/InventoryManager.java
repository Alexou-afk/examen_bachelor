package exo2;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> stock;

    /**
     * Default constructor of InventoryManager
     * Initialize fake stocks
     */
    public InventoryManager() {
        stock = new HashMap<>();
    }

    /**
     * Add product with asked quantity to stocks
     *
     * @param productId
     * @param quantity
     */
    public void addProduct(String productId, int quantity) {
        int currentQuantity = stock.getOrDefault(productId, 0);
        stock.put(productId, currentQuantity + quantity);
    }

    /**
     * Remove a product with asked quantity
     *
     * @param productId
     * @param quantity
     * @throws IllegalArgumentException if product doesn't exits or quantity is too big
     */
    public void removeProduct(String productId, int quantity) throws IllegalArgumentException {
        if (!stock.containsKey(productId)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire.");
        }

        int currentQuantity = stock.get(productId);
        if (quantity > currentQuantity) {
            throw new IllegalArgumentException("La quantité demandée est supérieure à la quantité disponible.");
        }

        stock.put(productId, currentQuantity - quantity);
    }

    /**
     * Get available quantity for an asked product
     *
     * @param productId
     * @return available quantity
     */
    public int getStockAvailability(String productId) {
        return stock.getOrDefault(productId, 0);
    }
}


