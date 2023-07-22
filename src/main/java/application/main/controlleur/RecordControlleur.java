package application.main.controlleur;

import application.main.metier.Exercice;
import application.main.metier.Record;
import application.main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordControlleur {
    @Autowired
    private RecordService recordService;

    private Exercice exercice;
    @GetMapping(value="/record")
    public List<Record> getRecord(){
        return recordService.getRecord();
    }

 @GetMapping(value="/record/{id_exo}")
    public List<Record> getRecordByExo(@PathVariable (value = "id_exo") Integer id_exo){
        exercice = new Exercice(id_exo);
        return recordService.getRecordByExo(exercice);
    }



    @PostMapping("/record/save/{id_exo}")
    public void addRecord(@PathVariable (value = "id_exo") Integer id_exo,
                          @RequestBody Record record){
        exercice = new Exercice(id_exo);
        record.setExercice(exercice);

        recordService.addRecord(record);
    }
}
