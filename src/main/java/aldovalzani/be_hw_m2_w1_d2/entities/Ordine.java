package aldovalzani.be_hw_m2_w1_d2.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private List<Alimento> alimentoList;
    private StatoOrdine statusOrdine;
    @Setter(AccessLevel.NONE)
    private double totOrdine;
    private LocalDateTime oraAcquisizioneOrdine;
    private Tavolo tavolo;
    private int numCoperti;

    public Ordine(List<Alimento> alimentoList, Tavolo tavolo, int numCoperti, double costoCoperto) {
        this.alimentoList = alimentoList;
        this.numCoperti = numCoperti;
        this.oraAcquisizioneOrdine = LocalDateTime.now();
        this.statusOrdine = StatoOrdine.INCORSO;
        this.tavolo = tavolo;
        this.totOrdine = setTotOrdine(costoCoperto);

        this.tavolo.setStato(StatoTavolo.LIBERO.OCCUPATO);
    }

    private double setTotOrdine(double costoCoperto) {
        double totElementi = alimentoList.stream().mapToDouble(Alimento::getPrice).sum();
        return totElementi + (costoCoperto * numCoperti);
    }

    private void cambiaStato(StatoOrdine nuovoStato) {
        this.statusOrdine = nuovoStato;
        if (nuovoStato == StatoOrdine.SERVITO) {
            this.tavolo.setStato(StatoTavolo.LIBERO);
        }
    }
}
