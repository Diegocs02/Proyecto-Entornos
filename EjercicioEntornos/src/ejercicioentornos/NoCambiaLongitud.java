/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentornos;

/**
 *
 * @author diurno
 */
public class NoCambiaLongitud {

    private int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public int longitud;



    public int Visualizar(int[] vector) {
        //mostramos su contenido
//Mostramos los elementos del array
System.out.print("v={");
int longitud = vector.length;
for (int i = 0; i < longitud; i++) {
    System.out.print(vector[i] + ",");
}
System.out.println("}");
        return longitud;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    


}


