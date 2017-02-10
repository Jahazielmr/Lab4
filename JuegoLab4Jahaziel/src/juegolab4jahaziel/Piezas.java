
package juegolab4jahaziel;

import java.awt.Color;

public class Piezas {
    protected Color colo;
    protected String Material;

    public Piezas() {
    }

    public Piezas(Color colo, String Material) {
        this.colo = colo;
        this.Material = Material;
    }

    public Color getColo() {
        return colo;
    }

    public void setColo(Color colo) {
        this.colo = colo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public String toString() {
        return "Piezas{" + "colo=" + colo + ", Material=" + Material + '}';
    }
    
    
    
    
}
