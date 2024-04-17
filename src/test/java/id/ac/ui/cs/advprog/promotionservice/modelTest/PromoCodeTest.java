package id.ac.ui.cs.advprog.promotionservice.modelTest;

import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PromoCodeTest {

    @Test
    public void testCreatePromoCode() {
        // Arrange
        PromoCode promoCode = createPromoCode();

        // Act & Assert
        assertNotNull(promoCode.getId());
        assertEquals("BELANJAHEMAT20", promoCode.getName());
        assertEquals("Get 20% discount for total purchase", promoCode.getDescription());
        assertEquals(new Date(1653974400000L), promoCode.getExpiryDate());
        assertEquals(100.0, promoCode.getMinimumPurchaseAmount());
    }

    private PromoCode createPromoCode() {
        PromoCode promoCode = new PromoCode();
        promoCode.setId("123456789");
        promoCode.setName("BELANJAHEMAT20");
        promoCode.setDescription("Get 20% discount for total purchase");
        promoCode.setExpiryDate(new Date(1653974400000L));
        promoCode.setMinimumPurchaseAmount(100.0);
        return promoCode;
    }

    @Test
    public void testSettersAndGetters() {
        // Arrange
        PromoCode promoCode = createPromoCode();

        // Act & Assert
        assertEquals("123456789", promoCode.getId());
        assertEquals("BELANJAHEMAT20", promoCode.getName());
        assertEquals("Get 20% discount for total purchase", promoCode.getDescription());
        assertEquals(new Date(1653974400000L), promoCode.getExpiryDate());
        assertEquals(100.0, promoCode.getMinimumPurchaseAmount());
    }
}
