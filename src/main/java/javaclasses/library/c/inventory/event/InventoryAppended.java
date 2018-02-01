package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryAppended {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date whenAppended;

    public InventoryAppended(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId, Date whenAppended) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.whenAppended = whenAppended;
    }
}
