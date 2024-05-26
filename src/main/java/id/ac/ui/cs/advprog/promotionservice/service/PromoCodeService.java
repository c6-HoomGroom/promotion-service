package id.ac.ui.cs.advprog.promotionservice.service;

import id.ac.ui.cs.advprog.promotionservice.repository.PromoCodeRepository;
import id.ac.ui.cs.advprog.promotionservice.controller.PromoCodeController;
import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PromoCodeService {

    @Autowired
    private PromoCodeRepository promoCodeRepository;

    public PromoCode createPromoCode(PromoCode promoCode) {
        return promoCodeRepository.save(promoCode);
    }
}

