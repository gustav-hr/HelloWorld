package StuderendeOpgave;
import java.util.ArrayList;

public class Hold {

    private ArrayList<Studerende> holdListe = new ArrayList();

    public void tilføjStuderende (Studerende studerende) {
        holdListe.add(studerende);
    }
        // Dette er metoden til at søge efter en studerende.
public Studerende søgStuderende (String navn) {
    for (Studerende studerende : holdListe) {
        if (studerende.getNavn().equalsIgnoreCase(navn)) {
            return studerende;
        }
    }
    return null;
        }
    }




