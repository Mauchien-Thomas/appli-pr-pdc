package application.main.repo;

import application.main.metier.Exercice;
import application.main.metier.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecordRepo  extends JpaRepository<Record, Integer> {
    @Query(value = "SELECT * FROM record where id_exo=?#{#exercice.id_exo}",nativeQuery = true)
    List<Record> findRecordByExo(@Param("exercice") Exercice exercice);


}
