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

    
    
    //No se si son las variables adecuadas
    ArrayList<Buffer> posTipoProductor = new ArrayList<Buffer>();
    private int[] tipoProductor = new int[6];
    ArrayList<Productor> ProductoresB = new ArrayList<Productor>();
    ArrayList<Semaphore> mutexProductores = new ArrayList<Semaphore>();

    // Control Constructor:
    public Control() throws InterruptedException {
        this.archivo = new Archivo();
        this.jefe = new Jefe();
        this.gerente = new Gerente(this.jefe);
        this.company = new Compañia();
        
        
        this.minuto = this.company.getTiempo() / 60 * 1000;
    }

    // Metodo principal que permite correr el programa
    public void iniciar() {

         this.jefe.start();
         this.gerente.start();
                
        
        
        
        // ------------------------
        Time tiempo = new Time();

//        Buffer b1 = new Buffer(2);
//        Buffer b2 = new Buffer(2);

        
        
        for (int i = 0; i < 3; i++) { //Poner el límite con int correspondiente desde compañia
            this.ProductoresB.add(new Productor(i, new Buffer(2), 1000, true));
            this.ProductoresB.get(i).start();
        }
        
        
        
        
        
        Almacen AB = new Almacen( 45, ProductoresB);

        
        AB.start();

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

    public ArrayList<Productor> getProductoresB() {
        return ProductoresB;
    }

    public void setProductores(ArrayList<Productor> Productores) {
        this.ProductoresB = Productores;
    }

    public ArrayList<Semaphore> getMutexProductores() {
        return mutexProductores;
    }

    public void setMutexProductores(ArrayList<Semaphore> mutexProductores) {
        this.mutexProductores = mutexProductores;
    }
    
    
    

}
