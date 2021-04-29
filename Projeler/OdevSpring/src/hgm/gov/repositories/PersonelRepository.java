package hgm.gov.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hgm.gov.entities.Birlik;
import hgm.gov.entities.Personel;

@Repository
public interface PersonelRepository extends JpaRepository<Birlik, Integer> {
	public List<Personel> findByAdi(String adi);

	// @Query("SELECT new
	// com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto(d.adi,
	// d.mevcut, d.sehir) " + "FROM Birlik d LEFT JOIN d.personel e")
	@Query("Select * from birlik br left join personel as p on br.id = p.birlik_id ")

	List<Birlik> fetchEmpDeptDataLeftJoin();

}
