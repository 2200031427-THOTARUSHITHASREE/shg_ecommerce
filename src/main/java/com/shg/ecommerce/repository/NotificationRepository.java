package com.shg.ecommerce.repository;
import com.shg.ecommerce.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findBySellerId(Long sellerId);
}
