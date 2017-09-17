/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceclient;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWebServiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MiService miService = new MiService_Service().getMiServicePort();
            System.out.println(miService.saludo("Fede desde cba"));
        } catch (MiServiceException ex) {
            System.out.println("Mensage: " + ex.getMessage());
        }
        
    }
    
}
