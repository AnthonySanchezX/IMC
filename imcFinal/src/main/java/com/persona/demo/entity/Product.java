/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persona.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author anthony
 */
@Entity
public class Product {
    private Long id;
    private String nombreCompleto;
    private int edad;
    private String sexo;
    private float estatura;
    private float peso;
    private float imc;
    private String estado;
    
    public Product(){
    }
    
    protected Product(Long id, String nombreCompleto, int edad, String sexo, float estatura, float peso, float imc, String estado){
        super();
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
        this.estado = estado;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public float getEstatura(){
        return estatura;
    }
    
    public void setEstatura(float estatura){
        this.estatura = estatura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getImc(){
        return imc = (peso/(estatura*estatura));
    }
    
    public void setImc(float imc){
        this.imc = (peso/(estatura*estatura));
    }
    
    public String getEstado(){
        if(imc < 18.5){
            estado = "Peso bajo";
        } else if(imc >= 18.5 && imc <= 24.99){
            estado = "Peso normal";
        } else if(imc >= 25 && imc <= 29.99){
            estado = "Sobrepeso";
        } else if(imc >= 30 && imc <= 39.99){
            estado = "Obesidad";
        } else if(imc >= 40){
            estado = "Obesidad extrema";
        }
        return estado;
        
    }
    
    public void setEstado(String estado){
        if(imc < 18.5){
            estado = "Peso bajo";
        } else if(imc >= 18.5 && imc <= 24.99){
            estado = "Peso normal";
        } else if(imc >= 25 && imc <= 29.99){
            estado = "Sobrepeso";
        } else if(imc >= 30 && imc <= 39.99){
            estado = "Obesidad";
        } else if(imc >= 40){
            estado = "Obesidad extrema";
        } 
        this.estado = estado;
    }
    
    //int edad, sexo, estatura, peso, imc, estado
}
