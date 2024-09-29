package com.learn.basic_auth.repo;

import com.learn.basic_auth.entity.ArrangementDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrangementDetailRepo extends JpaRepository<ArrangementDetail,Long> {
}
