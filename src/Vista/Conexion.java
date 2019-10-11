/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que vista desea ver\n1.Proveedor\n2.Presentacion\n3.Marca\n4.Zona\n5.Producto"));
        
        switch(opcion){
            case 1:
               Proveedor_Vista i = new Proveedor_Vista();
               i.setVisible(true); 
            break;
            case 2:
               Presentacion_Vista a = new Presentacion_Vista();
               a.setVisible(true); 
            break;
            case 3:
               Marca_Vista m = new Marca_Vista();
               m.setVisible(true); 
            break;
            case 4:
               Zona_Vista z = new Zona_Vista();
               z.setVisible(true); 
            break;
            case 5:
               Producto_Vista o = new Producto_Vista();
               o.setVisible(true); 
            break;
            
        }
        
        
        
    }
    
}
