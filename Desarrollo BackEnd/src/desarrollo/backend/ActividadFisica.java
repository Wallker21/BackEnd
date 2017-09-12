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
public class ActividadFisica {
    private Persona persona;

    public ActividadFisica(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public float correr(){
        float caloriasQuemadas = 0;
        int intervalo = 5;
        for (int min = 0; min < 60; min ++){
            for (int seg = 0; seg < 60; seg += intervalo){
                caloriasQuemadas += correrCaloriasQuemadas(calculoVelocidad(), intervalo, persona.getPeso());
            }
        }
        return caloriasQuemadas;
    }
    
    private float correrCaloriasQuemadas(float velocidad, int segundos, float peso){
        float caloriasMinutoPeso = 0;
        float pesoLibra = peso*2.204f; 
        float tiempoMinutos = (float)segundos / 60; 
        float velocidadMPH = velocidad * 0.621f;
        
        if (velocidadMPH == 0) return 0;
        if (velocidadMPH > 0 && velocidadMPH <= 5) caloriasMinutoPeso = 0.064f;
        if (velocidadMPH > 5 && velocidadMPH <= 6) caloriasMinutoPeso = 0.079f;
        if (velocidadMPH > 6 && velocidadMPH <= 10) caloriasMinutoPeso = 0.1f;
        if (velocidadMPH > 10 && velocidadMPH <= 12) caloriasMinutoPeso = 0.13f;
                      
        return caloriasMinutoPeso * pesoLibra * tiempoMinutos;
    } 
    
    private float calculoVelocidad(){
         return 5;
    }
    
    public void ciclismo(float pesoBicicleta){
        
    }
}
