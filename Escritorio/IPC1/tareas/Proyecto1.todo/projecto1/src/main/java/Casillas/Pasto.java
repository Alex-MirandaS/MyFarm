/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casillas;

import CasillasGUI.PastoGUI;
import Controladores.ControladorConstantes;
import Controladores.ControladorPasto;
import Controladores.ControladorPlantas;
import Juego.Bodega;
import Juego.Jugador;
import Juego.Parcela;
import Plantas.Planta;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Pasto extends Casilla {

    private Jugador jug;
    private ControladorPlantas plantas;
    private ControladorPasto cPasto = new ControladorPasto();
    private Planta planta;
    private Parcela parcela;
    private Bodega bodega;

    public Pasto(int indice, Jugador jug, ControladorPlantas plantas, Bodega bodega) {
        super(indice);
        figura = new PastoGUI(indice, this);
        this.jug = jug;
        this.plantas = plantas;
        this.bodega = bodega;
    }

    public void siembra(JLabel img) {
        int selección = 0;
        planta = plantas.getPlantasJuego().get(selección);
        if (jug.getSemillas() >= planta.getSemillas()) {
            jug.restarSemillas(planta.getSemillas());
            agregarParcelaCultivo(img, planta.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "No tiene las semillas necesarias");
        }
    }

    public void cosecha(JLabel img) {
        if (planta.isPlantaLista()) {
            int selección = 0;
            bodega.getContenedor().get(selección).agregartExistencia(1);
            planta = null;
            img.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Esta casilla no tienen nada que cosechar, o la cosecha aun no esta lista");
        }

    }

    public boolean plantaExistente() {
        if (planta != null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarParcela(JLabel img) {
        if ("".equals(img.getText())) {
            if (jug.getOro() >= ControladorConstantes.PRECIO_PARCELA) {
                parcela = new Parcela();
                jug.restarOro(ControladorConstantes.PRECIO_PARCELA);
                agregarParcelaCultivo(img, "Parcela" + Parcela.getCParcelas());
            } else {
                JOptionPane.showMessageDialog(null, "No posee el oro necesario");
            }
        }
    }

    private void agregarParcelaCultivo(JLabel img, String nombre) {
        cPasto.añadirParcelaCultivo(img, nombre);
    }

    @Override
    public PastoGUI getFigura() {
        return (PastoGUI) figura;
    }

    public Planta getPlanta() {
        return planta;
    }

    public Parcela getParcela() {
        return parcela;
    }

}
