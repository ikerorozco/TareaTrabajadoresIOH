/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaestructuradedatosnum2;

import java.io.IOException;

/**
 *
 * @author ikero
 */
public class TareaEstructuraDeDatosNum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Nomina nomina = new Nomina("junio.dat", "Estructura de datos S.A. de C.V.");
        nomina.calcularSueldo();
        System.out.println("-----------------------------------------------------");
        nomina.obtenerMaxMin();
    }
    }
    

