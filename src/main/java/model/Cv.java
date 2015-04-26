package model.CV;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Lehamare on 16/04/15.
 */


@XmlRootElement(name = "CV.Cv")
public class Cv {

    private Integer id;
    private String firstName;
    private String lastName;
    private ArrayList<Langue>  langues;

    public Cv() {
        langues= new ArrayList<Langue>();
    }

    @XmlElement
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() { return id;}

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Langue> getLangues() {
        return langues;
    }

    @XmlElement
    public void setLangues(ArrayList<Langue> langues) {
        this.langues = langues;
    }

    public Cv(Integer id, String firstName, String lastName, ArrayList<Langue> langues) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.langues = langues;
    }
}
