package desarrollo.backend;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gsosa
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String sexo;
    private int  edad;
    private float altura; //en metros
    private String correo;
    private String tipoDeDiabetes;
    private float peso; // en kilogramos 

    public Persona(String nombre, String apellido, String sexo, int edad, float altura, String correo, String tipoDeDiabetes, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.correo = correo;
        this.tipoDeDiabetes = tipoDeDiabetes;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoDeDiabetes() {
        return tipoDeDiabetes;
    }

    public void setTipoDeDiabetes(String tipoDeDiabetes) {
        this.tipoDeDiabetes = tipoDeDiabetes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    

    
    public float getIMB (){
        float alturaCM = altura * 100;
        float imb;
        if (sexo.equals("M")){
             imb = 66+(13.7f*peso)+(5*alturaCM)-(6.8f*edad);
        }else{
            imb = 655+(9.6f*peso)+(1.8f*alturaCM)-(4.7f*edad);
        }
        return imb;
    }
    
    public float getNAF (){
        return 1.2f;
    }
            
    public float getGastoEnergeticoTotal (){
        return getIMB()* getNAF();
    }
}


/* TESTING */