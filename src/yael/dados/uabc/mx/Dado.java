package yael.dados.uabc.mx;
import java.util.*;

public class Dado {
    private int cantidadLados;

    public Dado(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public int getCantidadLados() {
        return cantidadLados;
    }

    public void setCantidadLados(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public int tirarDado(){
        return (int) (Math.random() * cantidadLados + 1);
    }
}