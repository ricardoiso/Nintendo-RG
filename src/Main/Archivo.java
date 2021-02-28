/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Archivo {

    private int[] dataFile = new int[16];
    private String tituloArchivo;
    private String line;
    private int aux, cont = 0;
    private boolean confirm;

    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public Compañia crearCompany() {

        tituloArchivo = "data.txt";

        try {
            fileReader = new FileReader(tituloArchivo);
            bufferedReader = new BufferedReader(fileReader);

            while (!"fin".equals(line = bufferedReader.readLine())) {
                if (line.startsWith("-->")) {
                    line = bufferedReader.readLine();

                    try {
                        aux = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.indexOf(";")));
                    } catch (Exception e) {
                        break;
                    }
                    dataFile[cont] = aux;
                    cont++;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No es posible abrir el archivo '"
                    + tituloArchivo + "'", "NO ES POSIBLE ABRIR EL ARCHIVO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No es posible abrir el archivo '"
                    + tituloArchivo + "'", "NO ES POSIBLE ABRIR EL ARCHIVO",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (cont == 16 && verificar(dataFile)) {

            try {
                Compañia company = new Compañia(
                        dataFile[0],
                        dataFile[1],
                        dataFile[2],
                        dataFile[3],
                        dataFile[4],
                        dataFile[5],
                        dataFile[6],
                        dataFile[7],
                        dataFile[8],
                        dataFile[9],
                        dataFile[10],
                        dataFile[11],
                        dataFile[12],
                        dataFile[13],
                        dataFile[14],
                        dataFile[15]
                );
//                JOptionPane.showMessageDialog(null, "Archivo leído correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                return company;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo,cargando datos por defecto '"
                        + tituloArchivo + "'", "NO SE PUDO LEER EL ARCHIVO",
                        JOptionPane.ERROR_MESSAGE);
                Compañia company = new Compañia();
                return company;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo,cargando datos por defecto '"
                    + tituloArchivo + "'", "NO SE PUDO LEER EL ARCHIVO",
                    JOptionPane.ERROR_MESSAGE);
            Compañia company = new Compañia();
            return company;
        }
    }

    public boolean verificar(int[] data) {
        confirm = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] < 1) {
                return confirm = false;
            }
        }
        return confirm;
    }

}
