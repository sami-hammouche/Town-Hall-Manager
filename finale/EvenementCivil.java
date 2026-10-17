package modele;

import java.util.Date;

public class EvenementCivil {

    public Date dateEvent;
    public String lieu;

    public EvenementCivil(Date dateE, String l) {
        this.dateEvent = dateE;
        this.lieu = l;
    }
}
