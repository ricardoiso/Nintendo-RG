/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 * Clase Compañía, esta recibe datos de la Clase Archivo para iniciar el
 * programa a partir de estos.
 *
 * @author this_serra
 */
public class Compañia {

    public int tiempo, //tiempo en segundos que dura un dia en el programa
            diasDespacho, // Cantidad de días entre despachos
            maxBtnAlmacenados, // Capacidades máximas para cada tipo de almacenes 
            maxPantAlmacenadas,
            maxJoyAlmacenado,
            maxSDAlmacenado,
            iniProBtn, // Cantidad inicial de productores de cada tipo
            iniProPant,
            iniProJoy,
            iniProSD,
            maxProBtn, // Cantidad máxima de productores de cada tipo
            maxProPant,
            maxProJoy,
            maxProSD,
            iniEnsambladores, // Cantidad inicial de ensambladores
            maxEnsambladores; // Cantidad máxima de ensambladores

    // La compañia que será creada a partir de datos asignados desde Archivo
    public Compañia(int tiempo, int diasDespacho, int maxBtnAlmacenados, int maxPantAlmacenadas, int maxJoyAlmacenado, int maxSDAlmacenado, int iniProBtn, int iniProPant, int iniProJoy, int iniProSD, int maxProBtn, int maxProPant, int maxProJoy, int maxProSD, int iniEnsambladores, int maxEnsambladores) {
        this.tiempo = tiempo;
        this.diasDespacho = diasDespacho;
        this.maxBtnAlmacenados = maxBtnAlmacenados;
        this.maxPantAlmacenadas = maxPantAlmacenadas;
        this.maxJoyAlmacenado = maxJoyAlmacenado;
        this.maxSDAlmacenado = maxSDAlmacenado;
        this.iniProBtn = iniProBtn;
        this.iniProPant = iniProPant;
        this.iniProJoy = iniProJoy;
        this.iniProSD = iniProSD;
        this.maxProBtn = maxProBtn;
        this.maxProPant = maxProPant;
        this.maxProJoy = maxProJoy;
        this.maxProSD = maxProSD;
        this.iniEnsambladores = iniEnsambladores;
        this.maxEnsambladores = maxEnsambladores;
    }

    
    // Constructor por defecto en caso de que ocurra algun error al crear la compañia.
    public Compañia() {
        this.tiempo = 60;
        this.diasDespacho = 10; // no se cual es el valor
        this.maxBtnAlmacenados = 45;
        this.maxPantAlmacenadas = 45;
        this.maxJoyAlmacenado = 20;
        this.maxSDAlmacenado = 15;
        this.iniProBtn = 1;
        this.iniProPant = 1;
        this.iniProJoy = 1;
        this.iniProSD = 1;
        this.maxProBtn = 3; 
        this.maxProPant = 5;
        this.maxProJoy = 4;
        this.maxProSD = 4;
        this.iniEnsambladores = 1;
        this.maxEnsambladores = 0;
    }

    
    
    // Getters y Setters
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getDiasDespacho() {
        return diasDespacho;
    }

    public void setDiasDespacho(int diasDespacho) {
        this.diasDespacho = diasDespacho;
    }

    public int getMaxBtnAlmacenados() {
        return maxBtnAlmacenados;
    }

    public void setMaxBtnAlmacenados(int maxBtnAlmacenados) {
        this.maxBtnAlmacenados = maxBtnAlmacenados;
    }

    public int getMaxPantAlmacenadas() {
        return maxPantAlmacenadas;
    }

    public void setMaxPantAlmacenadas(int maxPantAlmacenadas) {
        this.maxPantAlmacenadas = maxPantAlmacenadas;
    }

    public int getMaxJoyAlmacenado() {
        return maxJoyAlmacenado;
    }

    public void setMaxJoyAlmacenado(int maxJoyAlmacenado) {
        this.maxJoyAlmacenado = maxJoyAlmacenado;
    }

    public int getMaxSDAlmacenado() {
        return maxSDAlmacenado;
    }

    public void setMaxSDAlmacenado(int maxSDAlmacenado) {
        this.maxSDAlmacenado = maxSDAlmacenado;
    }

    public int getIniProBtn() {
        return iniProBtn;
    }

    public void setIniProBtn(int iniProBtn) {
        this.iniProBtn = iniProBtn;
    }

    public int getIniProPant() {
        return iniProPant;
    }

    public void setIniProPant(int iniProPant) {
        this.iniProPant = iniProPant;
    }

    public int getIniProJoy() {
        return iniProJoy;
    }

    public void setIniProJoy(int iniProJoy) {
        this.iniProJoy = iniProJoy;
    }

    public int getIniProSD() {
        return iniProSD;
    }

    public void setIniProSD(int iniProSD) {
        this.iniProSD = iniProSD;
    }

    public int getMaxProBtn() {
        return maxProBtn;
    }

    public void setMaxProBtn(int maxProBtn) {
        this.maxProBtn = maxProBtn;
    }

    public int getMaxProPant() {
        return maxProPant;
    }

    public void setMaxProPant(int maxProPant) {
        this.maxProPant = maxProPant;
    }

    public int getMaxProJoy() {
        return maxProJoy;
    }

    public void setMaxProJoy(int maxProJoy) {
        this.maxProJoy = maxProJoy;
    }

    public int getMaxProSD() {
        return maxProSD;
    }

    public void setMaxProSD(int maxProSD) {
        this.maxProSD = maxProSD;
    }

    public int getIniEnsambladores() {
        return iniEnsambladores;
    }

    public void setIniEnsambladores(int iniEnsambladores) {
        this.iniEnsambladores = iniEnsambladores;
    }

    public int getMaxEnsambladores() {
        return maxEnsambladores;
    }

    public void setMaxEnsambladores(int maxEnsambladores) {
        this.maxEnsambladores = maxEnsambladores;
    }
    
    
    
    
}
