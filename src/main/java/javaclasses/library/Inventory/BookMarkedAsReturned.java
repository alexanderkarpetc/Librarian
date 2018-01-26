package javaclasses.library.Inventory;

import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.InventoryId;

public class BookMarkedAsReturned {
    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;

    public BookMarkedAsReturned(InventoryId inventoryId, InventoryItemId inventoryItemId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }
}
