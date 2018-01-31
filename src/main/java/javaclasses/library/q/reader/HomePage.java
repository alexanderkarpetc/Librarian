package javaclasses.library.q.reader;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookStatus;
import javaclasses.library.c.book.BookVO;
import javaclasses.library.c.book.Category;

import java.util.*;

/**
 * Represents home page. Books are sorted according to their status:
 * <li>
 * <ul>first overdue</ul>
 * <ul>second borrowed</ul>
 * <ul>third reserved</ul>
 * </li>
 * (or maybe some more sorting: for example for new hot books)
 */
public class HomePage {

    private List<BookView> books = new ArrayList<>();
    private Collection<Category> categories;

}
