package id.ac.ui.cs.advprog.promotionservice.service;

import id.ac.ui.cs.advprog.promotionservice.repository.PromoCodeRepository;
import id.ac.ui.cs.advprog.promotionservice.controller.PromoCodeController;
import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromoCodeService {
    /*
    @Autowired
    private PromoCodeRepository promoCodeRepository;

    public List<PromoCode> getAllPromoCodes() {
        return promoCodeRepository.findAll();
    }

    public PromoCode getPromoCodeById(String id) {
        return promoCodeRepository.findById(id).orElse(null);
    }

    public PromoCode createPromoCode(PromoCode promoCode) {
        return promoCodeRepository.save(promoCode);
    }

    public PromoCode updatePromoCode(String id, PromoCode promoCode) {
        promoCode.setId(id);
        return promoCodeRepository.save(promoCode);
    }

    public void deletePromoCode(String id) {
        promoCodeRepository.deleteById(id);
    }
    */

}

