package hgm.gov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hgm.gov.beans.entity.Personel;

public interface PersonelRespository extends JpaRepository<Personel, Integer> {

}
