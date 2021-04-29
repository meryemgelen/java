package hgm.gov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hgm.gov.entities.Isimler;

public interface IsimlerRepository extends JpaRepository<Isimler, Integer> {
	@Query(value = "SELECT isim, count(*) sayi FROM isimler group by isim order by 2 desc", nativeQuery = true)
	public List<Object[]> getIsimSayilari();
}
