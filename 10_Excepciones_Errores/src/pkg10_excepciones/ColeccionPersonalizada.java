/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10_excepciones.y.control.de.errores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordi
 */
public class ColeccionPersonalizada<T> {
    private List<T> elementos;

    public ColeccionPersonalizada() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        if (elemento == null) {
            throw new ObjetoNullException("No se puede agregar un objeto nulo a la colección");
        }
        elementos.add(elemento);
    }
}
