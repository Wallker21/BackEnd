/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo.backend;
 

/**
 *
 * @author gsosa
 */
public class DesarrolloBackEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //public Persona(String nombre, String apellido, String sexo, int edad, float altura, String correo, String tipoDeDiabetes, float peso);
        
        Persona juanjo = new Persona("juanPuto", "alegre", "M", 24, 1.93f, "Puto@gmial.com", "1", 120);
        Persona juanja = new Persona("juanNena", "alegre", "F", 24, 1.93f, "Puto@gmial.com", "1", 120);
        
        System.out.println("Nombre\t\tNAF\tIMB\tGASTO_ENERGETICO_TOTAL");
        System.out.println(juanjo.getNombre() + "\t" + juanjo.getNAF() + "\t" + juanjo.getIMB() + "\t" + juanjo.getGastoEnergeticoTotal());
        System.out.println(juanja.getNombre() + "\t" + juanja.getNAF() + "\t" + juanja.getIMB() + "\t" + juanja.getGastoEnergeticoTotal());
        
        ActividadFisica af_juanjo = new ActividadFisica(juanjo);
        ActividadFisica af_juanja = new ActividadFisica(juanja);
      
        System.out.println("el gordo puto quemo: " + af_juanjo.correr() + " calorias");
        System.out.println("la gorda puta quemo: " + af_juanja.correr() + " calorias");

          }
    
}
