package application.main.service;

import application.main.metier.Exercice;
import application.main.repo.ExerciceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExerciceService {
    @Autowired
    private ExerciceRepo exerciceRepo;

    public List<Exercice> getExercices() {
        List<Exercice> exercices = new ArrayList<>();
        exerciceRepo.findAll().forEach(exercice -> {
            exercices.add(exercice);
        });
        return exercices;
    }

    public void addExercice(Exercice exercice){
        exerciceRepo.save(exercice);
    }

    public void findById(Integer id){
         exerciceRepo.findById(id);
    }
}
