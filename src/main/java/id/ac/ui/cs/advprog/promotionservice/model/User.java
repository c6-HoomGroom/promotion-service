package id.ac.ui.cs.advprog.promotionservice.model;
import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;

import java.util.Date;
import lombok.Setter;
import lombok.Getter;

@Setter@Getter
public class User {
    private Long id;
    private String fullName;
    private Date birthDate;
    private String gender;
    private String username;
    private String email;
    private String password;
    private PromoCode coupons;
}
