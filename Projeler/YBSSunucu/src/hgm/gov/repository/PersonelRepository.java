package hgm.gov.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hgm.gov.entities.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	public Optional<Personel> findByTcno(String tcNo);
}
