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
public class EjercicioEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;
        Prueba posicion = new Prueba();
        posicion.setValor(10);
        posicion.modificar(vector, 0, 1);
        posicion.borrar(vector, 0, 1);
        posicion.insertar(vector, 0, 1);
        
    }

}
