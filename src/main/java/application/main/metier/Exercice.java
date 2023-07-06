package application.main.metier;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
public class Exercice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_exo;
    @Column
    @Nonnull
    private String nom_exo;

    public Exercice() {
    }

    public Exercice(Integer id_exo, String nom) {
        this.id_exo = id_exo;
        this.nom_exo = nom;
    }

    public Integer getId_exo() {
        return id_exo;
    }

    public void setId_exo(Integer id_exo) {
        this.id_exo = id_exo;
    }

    public String getNom() {
        return nom_exo;
    }

    public void setNom(String nom) {
        this.nom_exo = nom;
    }

    @Override
    public String toString() {
        return "Exercice{" +
                "id_exo=" + id_exo +
                ", nom_exo='" + nom_exo + '\'' +
                '}';
    }
}
