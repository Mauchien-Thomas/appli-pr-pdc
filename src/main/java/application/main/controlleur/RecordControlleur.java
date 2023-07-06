package application.main.controlleur;

import application.main.metier.Record;
import application.main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordControlleur {
    @Autowired
    private RecordService recordService;

    @GetMapping(value="/record")
    public List<Record> getRecord(){
        return recordService.getRecord();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public void addRecord(@RequestBody Record record){
        System.out.println(record.toString());
        recordService.addRecord(record);
    }
}
