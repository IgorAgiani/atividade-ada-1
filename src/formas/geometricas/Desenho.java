package formas.geometricas;

import java.util.ArrayList;
import java.util.List;

public class Desenho {

    private List<Forma> formas;

    public Desenho() {
        this.formas = new ArrayList<>();
    }

    public List<Forma> getFormas() {
        return formas;
    }

    public boolean calcularAreaTotal() {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        System.out.printf("Área total: %.2f\n", areaTotal);
        return false;
    }
}
