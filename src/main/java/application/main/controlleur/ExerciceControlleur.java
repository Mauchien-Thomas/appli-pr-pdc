package application.main.controlleur;

import application.main.metier.Exercice;
import application.main.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ExerciceControlleur {

    @Autowired
    private ExerciceService exerciceService;

    @GetMapping(value="/exo")
    public List<Exercice> getExercice(){
        return exerciceService.getExercices();
    }
}
