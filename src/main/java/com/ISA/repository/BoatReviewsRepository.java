package com.ISA.repository;

import com.ISA.domain.model.BoatReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoatReviewsRepository extends JpaRepository<BoatReviews, Long> {
}
