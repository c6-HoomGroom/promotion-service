package id.ac.ui.cs.advprog.promotionservice.repository;

import id.ac.ui.cs.advprog.promotionservice.model.PromoCode;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public interface PromoCodeRepository extends JpaRepository<PromoCode, String> {
}

