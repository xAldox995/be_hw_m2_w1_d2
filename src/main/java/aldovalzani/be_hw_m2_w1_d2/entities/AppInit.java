package aldovalzani.be_hw_m2_w1_d2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@PropertySource("application.properties")
public class AppInit implements CommandLineRunner {
    private final Menu menu;
    @Value("${costo.coperto}")
    private double costoCoperto;

    @Autowired
    public AppInit(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run(String... args) throws Exception {
        Tavolo tavolo1 = new Tavolo(1, 7, StatoTavolo.LIBERO);
        Ordine ordine1 = new Ordine(Arrays.asList(menu.getPizzaList().get(0),
                menu.getDrinkList().get(0)), tavolo1, 2, costoCoperto);
        System.out.println("Ordine creato: -Tavolo " + tavolo1.getIdTavolo() +
                " -Stato: " + ordine1.getStatusOrdine() + " -Totale: " + ordine1.getTotOrdine() + " €");
        System.out.println("Tavolo: " + tavolo1.getIdTavolo() + " StatoTavolo: " +
                (tavolo1.getStato() == StatoTavolo.OCCUPATO ? "Occupato" : "Libero"));
    }

}
