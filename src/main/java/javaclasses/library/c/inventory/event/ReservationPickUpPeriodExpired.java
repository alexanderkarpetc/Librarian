package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event when user had 2 days to take the book but he didn't.
 */
public class ReservationPickUpPeriodExpired {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date whenExpired;

    public ReservationPickUpPeriodExpired(InventoryId inventoryId, UserId userId, Date whenExpired) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.whenExpired = whenExpired;
    }

}
