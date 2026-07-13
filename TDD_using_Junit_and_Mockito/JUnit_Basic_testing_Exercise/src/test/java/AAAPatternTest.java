import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AAAPatternTest {
    private List<String> cartItems;

    @Before
    public void setUp() {
        cartItems = new ArrayList<>();
        cartItems.add("Laptop");
        cartItems.add("Mouse");
    }

    @After
    public void tearDown() {
        cartItems.clear();
    }

    @Test
    public void testAddingItemToCart() {
        String newItem = "Keyboard";

        cartItems.add(newItem);

        assertEquals(3, cartItems.size());
        assertTrue(cartItems.contains("Keyboard"));
    }

    @Test
    public void testRemovingItemFromCart() {
        String itemToRemove = "Mouse";

        cartItems.remove(itemToRemove);

        assertEquals(1, cartItems.size());
        assertTrue(cartItems.contains("Laptop"));
    }
}
