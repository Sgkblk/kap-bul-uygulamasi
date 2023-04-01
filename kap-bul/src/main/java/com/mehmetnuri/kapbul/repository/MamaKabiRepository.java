package com.mehmetnuri.kapbul.repository;

import com.mehmetnuri.kapbul.entity.MamaKabi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MamaKabiRepository extends JpaRepository<MamaKabi, Long> {
}
