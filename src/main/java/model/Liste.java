package model.CV;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


/**
 * Created by Lehamare on 16/04/15.
 */

@XmlRootElement(name = "CV.Liste")
public class Liste {

    private ArrayList<Cv> cvList;

    public ArrayList<Cv> getCvList() {
        return cvList;
    }

    @XmlElement
    public void setCvList(ArrayList<Cv> cvList) {
        this.cvList = cvList;
    }


    public void add(Cv nouveauCV){

        this.cvList.add(nouveauCV);
    }


    public Cv getById(Integer i){

        for(Cv el : cvList){
            if(el.getId() == i ) return el;
        }
        return null;
    }


    public Liste() {
        cvList = new ArrayList<Cv>();
    }

    public Liste(ArrayList<Cv> cvList) {
        this.cvList = cvList;
    }
}
