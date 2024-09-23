package StuderendeOpgave;

public class Studerende {
    private String navn;
    private String email;

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    // Dette er vores toSrtring metode. Det ender med at være det vi udskriver til sidst.
    @Override
    public String toString() {
        return "Navn: " +navn+". " +"Og dette er "+navn+"s mail: " +email;
    }
}
