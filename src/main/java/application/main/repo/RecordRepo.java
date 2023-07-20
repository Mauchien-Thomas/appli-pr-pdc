package application.main.repo;

import application.main.metier.Exercice;
import application.main.metier.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordRepo  extends JpaRepository<Record, Integer> {

    List<Record> findRecordByExo(Exercice exercice);
}
