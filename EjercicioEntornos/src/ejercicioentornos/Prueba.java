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
public class Prueba {

    public int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void modificar(int[] vector, int LongitudActual) {
        int i;
        int posicion = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < longitud) {
//mostramos su contenido
System.out.println("Elemento a modificar=" + vector[posicion]);
vector[posicion] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public int longitud;

    public void borrar(int[] vector, int LongitudActual) {
        int posicion = 1, i;
        int longitud = 0;
        longitud = vector.length;
        
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > longitud - 1; i--) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    //metodo que inserta un elemento en la posicion p desplazando a la derecha todos los
    //elementos
    public void insertar(int[] vector, int LongitudActual) {
        int posicion = 1, i;
        int longitud = Visualizar(vector);
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.valor);
            for (i = longitud; i < posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

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
    


}


