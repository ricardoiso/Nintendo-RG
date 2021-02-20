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

    private int tiempo, //tiempo en segundos que dura un dia en el programa
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
        this.maxProBtn = 0; // no se cuales son los valores maximos de cada productor
        this.maxProPant = 0;
        this.maxProJoy = 0;
        this.maxProSD = 0;
        this.iniEnsambladores = 1;
        this.maxEnsambladores = 0;
    }
}
