package model.CV;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lehamare on 16/04/15.
 */
@XmlRootElement(name = "CV.Langue")
public class Langue {

    private String libelle;
    private int niveau;

    public Langue() {
    }

    public String getLibelle() {
        return libelle;
    }

    @XmlElement
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNiveau() {
        return niveau;
    }

    @XmlElement
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Langue(String libelle, int niveau) {
        this.libelle = libelle;
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "CV.Langue{" +
                "libelle='" + libelle + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}
