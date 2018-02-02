package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event when user reserve the book.
 * <p>
 * If a queue on book exists then reader will be added to the queue.
 * Else if book is available then reader has 2 days to borrow book.
 */
public class ReservationAdded {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date whenCreated;

    public ReservationAdded(InventoryId inventoryId, UserId userId, Date whenCreated) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.whenCreated = whenCreated;
    }
}