package id.ac.ui.cs.advprog.promotionservice.controller;

import id.ac.ui.cs.advprog.promotionservice.service.PromoCodeService;
import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/promocodes")
public class PromoCodeController {
    /*
    @Autowired
    private PromoCodeService promoCodeService;

    @GetMapping
    public List<PromoCode> getAllPromoCodes() {
        return promoCodeService.getAllPromoCodes();
    }

    @GetMapping("/{id}")
    public PromoCode getPromoCodeById(@PathVariable String id) {
        return promoCodeService.getPromoCodeById(id);
    }

    @PostMapping
    public PromoCode createPromoCode(@RequestBody PromoCode promoCode) {
        return promoCodeService.createPromoCode(promoCode);
    }

    @PutMapping("/{id}")
    public PromoCode updatePromoCode(@PathVariable String id, @RequestBody PromoCode promoCode) {
        return promoCodeService.updatePromoCode(id, promoCode);
    }

    @DeleteMapping("/{id}")
    public void deletePromoCode(@PathVariable String id) {
        promoCodeService.deletePromoCode(id);
    }

     */
}

