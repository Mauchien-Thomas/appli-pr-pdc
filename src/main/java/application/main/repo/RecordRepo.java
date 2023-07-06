package application.main.repo;

import application.main.metier.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepo  extends JpaRepository<Record, Integer> {
}
