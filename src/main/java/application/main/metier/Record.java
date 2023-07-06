package application.main.metier;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_record;

    @ManyToOne
    @Nonnull
    @JoinColumn(name = "id_exo")
    private Exercice exercice;

    @Column
    @Nonnull
    private int pr_record;

    @Column
    private Date pr_date;

    public Record() {
    }

    public Record(Integer id_record, Exercice exercice, int pr_record, Date pr_date) {
        this.id_record = id_record;
        this.exercice = exercice;
        this.pr_record = pr_record;
        this.pr_date = pr_date;
    }

    public Integer getId_record() {
        return id_record;
    }

    public void setId_record(Integer id_record) {
        this.id_record = id_record;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    public int getPr_record() {
        return pr_record;
    }

    public void setPr_record(int pr_record) {
        this.pr_record = pr_record;
    }

    public Date getPr_date() {
        return pr_date;
    }

    public void setPr_date(Date pr_date) {
        this.pr_date = pr_date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id_record=" + id_record +
                ", exercice=" + exercice +
                ", pr_record=" + pr_record +
                ", pr_date=" + pr_date +
                '}';
    }
}
