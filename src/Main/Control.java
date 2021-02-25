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

    private int minuto;

    Semaphore semProBtn;
    ArrayList<Semaphore> semaforosProBtn;
    ArrayList<ProductorBotones> ProductoresBotones;

    // Arrays de exclusión mutua de Productores
    public ArrayList<Semaphore> mutexProductorBotones;
//    public ArrayList<Semaphore> mutexProductorPantallas;
//    public ArrayList<Semaphore> mutexProductorJoysticks;
//    public ArrayList<Semaphore> mutexProductorSD;

    //No se si son las variables adecuadas
    ArrayList<Buffer> posTipoProductor = new ArrayList<Buffer>();
    private int[] tipoProductor = new int[6];
    ArrayList<Productor> Productores = new ArrayList<Productor>();
    ArrayList<Semaphore> mutexProductores = new ArrayList<Semaphore>();

    // Control Constructor:
    public Control() throws InterruptedException {
        this.archivo = new Archivo(); // Objeto que recibirá información cargada para la compañia
        this.company = new Compañia(); // Información del programa con datos iniciales

        // Jefe y gerente que controlan contadores de despliegue
        this.jefe = new Jefe();
        this.gerente = new Gerente(this.jefe);

        //Aun no es seguro si se dejará esta variable
        this.minuto = this.company.getTiempo() / 60 * 1000;

        // Semaforos inicializados
        this.semProBtn = new Semaphore(0, true); // cantidad de productores de botones
        
        this.ProductoresBotones = new ArrayList<>();

        this.semaforosProBtn = new ArrayList<Semaphore>();
        this.mutexProductorBotones = new ArrayList<Semaphore>();
    }

    // Metodo principal que permite correr el programa
    public void iniciar() {

        this.jefe.start();
        this.gerente.start();

        for (int i = 0; i < 3 ; i++) {
                mutexProductorBotones.add(new Semaphore(0, true));
                semaforosProBtn.add(new Semaphore(0, true));
                ProductoresBotones.add(new ProductorBotones(i, (new Buffer(1)), semaforosProBtn.get(i), mutexProductorBotones));
        }
        
        for (int i = 1; i < 3; i++) {
            ProductoresBotones.get(i).despedir();
        }
                
                
                
        // ------------------------
        Time tiempo = new Time();

//        Buffer b1 = new Buffer(2);
//        Buffer b2 = new Buffer(2);
//
//        Productor primer_productor = new Productor("A ", b1, 1000, true);
//        Productor segundo_productor = new Productor("B ", b2, 1000, true);
//        Productor tercer_productor = new Productor("C ", b2, 1000, false);
//        
//        this.Productores.add(primer_productor);
//        this.Productores.add(segundo_productor);
//        this.Productores.add(tercer_productor);
//        Almacen AB = new Almacen(primer_productor.getBuffer(), segundo_productor.getBuffer(), 45, primer_productor, segundo_productor);
//
//        primer_productor.start();
//        segundo_productor.start();
//        AB.start();
        //tiempo.setTime();
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

    public ArrayList<Buffer> getPosTipoProductor() {
        return posTipoProductor;
    }

    public void setPosTipoProductor(ArrayList<Buffer> posTipoProductor) {
        this.posTipoProductor = posTipoProductor;
    }

    public int[] getTipoProductor() {
        return tipoProductor;
    }

    public void setTipoProductor(int[] tipoProductor) {
        this.tipoProductor = tipoProductor;
    }

    public ArrayList<Productor> getProductores() {
        return Productores;
    }

    public void setProductores(ArrayList<Productor> Productores) {
        this.Productores = Productores;
    }

    public ArrayList<Semaphore> getMutexProductores() {
        return mutexProductores;
    }

    public void setMutexProductores(ArrayList<Semaphore> mutexProductores) {
        this.mutexProductores = mutexProductores;
    }

}
