package aldovalzani.be_hw_m2_w1_d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tavolo {
    private int idTavolo;
    private int maxNumCoperti;
    private StatoTavolo stato;

    public Tavolo(int idTavolo, int maxNumCoperti, StatoTavolo stato) {
        this.idTavolo = idTavolo;
        this.maxNumCoperti = maxNumCoperti;
        this.stato = stato;
    }
}
