/*
 5. Una compañía dedicada al alquiler de automóviles cobra $30.00 hasta un máximo de 300 Km
de distancia recorrida. Para más de 300 y hasta 1000 Km cobra $30.00 más un monto
adicional de $0.15 por cada Kilómetro en exceso sobre 300. Para más de 1000 Km cobra $30
más un monto de $0.10 por cada Kilómetro en exceso de 1000. Diseñe un programa que
calcule el monto a pagar por cada automóvil cobrado en un día de trabajo.
 */
package rentacar;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Aranda
 */
public class RentaCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kilometros;
        float km, cobro=0, montoA=0, Total=0;
        
        kilometros = JOptionPane.showInputDialog("Digite los kilometros recorridos: ");
        
        km = Float.parseFloat(kilometros);
        
        if(km <= 300)
        {
            cobro= (float) 30.00;
        }
        else if(km > 300 && km <= 1000)
        {
            cobro = (float) 30.00;
            montoA = (float) ((km - 300) * 0.15);
        }
        else if(km > 1000)
        {
            cobro = (float) 30.00;
            montoA = (float) ((km - 1000) * 0.10);
        }
        
        Total = cobro + montoA;
        
        JOptionPane.showMessageDialog(null, "Su Cobro es de $"+cobro+"\nmas un monto adicional de "+montoA+" por kilometros en exceso\n"
                + "Total a pagar: "+Total);
        
    }
    
}
