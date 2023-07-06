package application.main.repo;

import application.main.metier.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciceRepo extends JpaRepository<Exercice, Integer> {
}
