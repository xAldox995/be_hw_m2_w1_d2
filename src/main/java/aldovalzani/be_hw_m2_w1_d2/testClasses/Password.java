package aldovalzani.be_hw_m2_w1_d2.testClasses;

public class Password {
    //La Password deve essere di almeno 8 caratteri ed avere dei caratteri speciali
    public boolean passwordValida(String pass) {
        //controllo sulla lunghezza della password
        if (pass.length() < 8) {
            return false;
        }

        //Definiamo di caratteri speciali
        String specialChars = "&/£$()+-";

        //Ora prendiamo la password e vediamo se ha i caratteri speciali
        for (char l : pass.toCharArray()) {
            //Verifico che nella password sia presente un carattere speciale
            if (specialChars.indexOf(l) != -1) return true;
        }
        return false;
    }
}
