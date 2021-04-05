/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Animales.Animal;
import Listas.Lista;

/**
 *
 * @author alex
 */
public class Parcela {

    private Lista<Animal> animales;
    private static int cParcelas=0;
//ControladorConstantes.LIMITE;

//GUI
    public Parcela() {
        animales = new Lista<>();
        cParcelas++;
    }

    public Lista<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(Lista<Animal> animales) {
        this.animales = animales;
    }

    public static int getCParcelas(){
        return cParcelas;
    }
    
}
