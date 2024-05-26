package id.ac.ui.cs.advprog.promotionservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

import java.util.Date;

@Setter@Getter@Entity
public class PromoCode {
    @Id
    private String id;

    private String name;
    private String description;
    private Date expiryDate;
    private Double minimumPurchaseAmount;
}
