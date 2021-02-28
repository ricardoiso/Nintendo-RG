/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;
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
    public Compañia company;
    private Time tiempo;
    public int capacidadAP;

    private int minuto;

    ArrayList<Productor> ProductoresB = new ArrayList<Productor>();
    ArrayList<Productor> ProductoresJ = new ArrayList<Productor>();
    ArrayList<Productor> ProductoresT = new ArrayList<Productor>();
    ArrayList<productorPantallas> ProductoresP = new ArrayList<productorPantallas>();
    ArrayList<Ensamblador> Ensambladores = new ArrayList<Ensamblador>();

    //No se si son las variables adecuadas
//    ArrayList<Buffer> posTipoProductor = new ArrayList<Buffer>();
//    private int[] tipoProductor = new int[6];
//    ArrayList<Semaphore> mutexProductores = new ArrayList<Semaphore>();
    // Control Constructor:
    public Control() throws InterruptedException {

        this.archivo = new Archivo(); // Objeto que recibirá información cargada para la compañia
        this.company = this.archivo.crearCompany(); // Información del programa con datos iniciales

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
                this.getProductoresB().get(i).start();
            }
        }
        for (int i = 0; i < 4; i++) { 
            // Solo iniciaran en verdadero los productores indicados en la Compañia
            if (i < this.company.getIniProJoy()) { 
                this.ProductoresJ.add(new Productor(i, new Buffer(2), 1000, true));
                this.ProductoresJ.get(i).start();
            } else {
                // El resto de productores estaran falsos esperando ser activados
                this.ProductoresJ.add(new Productor(i, new Buffer(2), 1000, false));
                this.getProductoresJ().get(i).start();
            }
        }
        
        for (int i = 0; i < 4; i++) { 
            // Solo iniciaran en verdadero los productores indicados en la Compañia
            if (i < this.company.getIniProSD()) { 
                this.ProductoresT.add(new Productor(i, new Buffer(2), 1000, true));
                this.ProductoresT.get(i).start();
            } else {
                // El resto de productores estaran falsos esperando ser activados
                this.ProductoresT.add(new Productor(i, new Buffer(2), 1000, false));
                this.getProductoresT().get(i).start();
            }
        }
        for (int i = 0; i < 5; i++) { 
            // Solo iniciaran en verdadero los productores indicados en la Compañia
            if (i < this.company.getIniProSD()) { 
                this.ProductoresP.add(new productorPantallas(i, new Buffer(1),new Buffer(1), true));
                this.ProductoresP.get(i).start();
            } else {
                // El resto de productores estaran falsos esperando ser activados
                this.ProductoresP.add(new productorPantallas(i, new Buffer(1), new Buffer(1), false));
                this.getProductoresP().get(i).start();
            }
        }
        

        Almacen AB = new Almacen(company.getMaxBtnAlmacenados(), ProductoresB,5000);
        Almacen AJ = new Almacen(company.getMaxJoyAlmacenado(), ProductoresJ,5000);
        Almacen AT = new Almacen(company.getMaxSDAlmacenado(), ProductoresT,5000);
        AlmacenP AP = new AlmacenP(company.getMaxPantAlmacenadas(), ProductoresP, 5000);
        Buffer BE = new Buffer(2);

        
        for (int i = 0; i < 5; i++) { 
            // Solo iniciaran en verdadero los productores indicados en la Compañia
            if (i < this.company.getIniEnsambladores()) { 
                this.Ensambladores.add(new Ensamblador(i,AB,AP, AJ,AT, 5000, true, BE, this.company));
                this.Ensambladores.get(i).start();
            } else {
                // El resto de productores estaran falsos esperando ser activados
                this.Ensambladores.add(new Ensamblador(i,AB,AP, AJ,AT, 5000, false, BE, this.company));
                this.Ensambladores.get(i).start();
            }
        }

        AB.start();
        AJ.start();
        AT.start();
        AP.start();
        
        
        while(true){
            Interfaz.numCB.setText(String.valueOf(AB.getCapacidad()));
            Interfaz.numCJoy.setText(String.valueOf(AJ.getCapacidad()));
            Interfaz.numCSD.setText(String.valueOf(AT.getCapacidad()));
        }
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
    
    public ArrayList<Productor> getProductoresT() {
        return ProductoresT;
    }
    public ArrayList<Productor> getProductoresJ() {
        return ProductoresJ;
    }
    
    public ArrayList<productorPantallas> getProductoresP() {
        return ProductoresP;
    }
    
    public ArrayList<Ensamblador> getEnsambladores() {
        return Ensambladores;
    }

    public void setProductoresB(ArrayList<Productor> ProductoresB) {
        this.ProductoresB = ProductoresB;
    }
    

}
