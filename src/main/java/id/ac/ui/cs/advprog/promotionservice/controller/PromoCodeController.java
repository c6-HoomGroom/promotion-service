package id.ac.ui.cs.advprog.promotionservice.controller;

import id.ac.ui.cs.advprog.promotionservice.service.PromoCodeService;
import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/promo-codes")
public class PromoCodeController {

    @Autowired
    private PromoCodeService promoCodeService;

    @PostMapping
    public ResponseEntity<PromoCode> createPromoCode(@RequestBody PromoCode promoCode) {
        PromoCode createdPromoCode = promoCodeService.createPromoCode(promoCode);
        return new ResponseEntity<>(createdPromoCode, HttpStatus.CREATED);
    }
}


