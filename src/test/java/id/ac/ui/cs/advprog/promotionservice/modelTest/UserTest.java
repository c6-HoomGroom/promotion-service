package id.ac.ui.cs.advprog.promotionservice.modelTest;

import id.ac.ui.cs.advprog.promotionservice.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testSettersAndGetters() {
        // Create a user object
        User user = new User();

        // Set values using setters
        user.setId(1L);
        user.setFullName("John Doe");
        user.setBirthDate(new Date());
        user.setGender("Male");
        user.setUsername("johndoe123");
        user.setEmail("johndoe@example.com");
        user.setPassword("password123");

        // Get values using getters and assert
        assertEquals(1L, user.getId());
        assertEquals("John Doe", user.getFullName());
        assertEquals("Male", user.getGender());
        assertEquals("johndoe123", user.getUsername());
        assertEquals("johndoe@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
    }
}