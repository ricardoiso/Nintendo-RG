/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Control {

    private Jefe jefe;
    private Gerente gerente;
    private Archivo archivo;
    private Compañia company;
    private Time tiempo;

    private int minuto;

    ArrayList<Productor> ProductoresB = new ArrayList<Productor>();

    //No se si son las variables adecuadas
//    ArrayList<Buffer> posTipoProductor = new ArrayList<Buffer>();
//    private int[] tipoProductor = new int[6];
//    ArrayList<Semaphore> mutexProductores = new ArrayList<Semaphore>();
    // Control Constructor:
    public Control() throws InterruptedException {

        this.archivo = new Archivo(); // Objeto que recibirá información cargada para la compañia
        this.company = new Compañia(); // Información del programa con datos iniciales

        this.jefe = new Jefe();
        this.gerente = new Gerente(this.jefe);
        
        this.tiempo = new Time();
        

        this.minuto = this.company.getTiempo() / 60 * 1000;
    }

    // Metodo principal que permite correr el programa
    public void iniciar() {

        this.jefe.start();
        this.gerente.start();

        this.tiempo.start();

        // Se crean la cantidad maxima de productores
        for (int i = 0; i < 3; i++) { 
            // Solo iniciaran en verdadero los productores indicados en la Compañia
            if (i < this.company.getIniProBtn()) { 
                this.ProductoresB.add(new Productor(i, new Buffer(2), 1000, true));
                this.ProductoresB.get(i).start();
            } else {
                // El resto de productores estaran falsos esperando ser activados
                this.ProductoresB.add(new Productor(i, new Buffer(2), 1000, false)); 
            }
        }

        Almacen AB = new Almacen(45, ProductoresB);

        AB.start();
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    public Compañia getCompany() {
        return company;
    }

    public void setCompany(Compañia company) {
        this.company = company;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public ArrayList<Productor> getProductoresB() {
        return ProductoresB;
    }

    public void setProductoresB(ArrayList<Productor> ProductoresB) {
        this.ProductoresB = ProductoresB;
    }

}
