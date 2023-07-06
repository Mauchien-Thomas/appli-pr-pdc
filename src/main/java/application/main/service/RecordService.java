package application.main.service;

import application.main.metier.Record;
import application.main.repo.RecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepo recordRepo;

    public List<Record> getRecord() {
        List<Record> records = new ArrayList<>();
        recordRepo.findAll().forEach(record -> {
            records.add(record);
        });
        return records;
    }

    public void addRecord(Record record){
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        record.setPr_date(date);
        System.out.println("2001 tata: "+record.getExercice());
        recordRepo.save(record);
    }
}
