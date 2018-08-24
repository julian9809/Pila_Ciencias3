/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Stack;

/**
 *
 * @author Julian
 */
public class Pila {
    
    private Nodo inicio;
    private int tamanio;
    private double sumatoria;
    
    public void Pila(){
        inicio = null;
        tamanio = 0;
        sumatoria = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public double getSumatoria(){
        return sumatoria;
    }
    
    public void apilar(int valor){        
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
        sumatoria = sumatoria + valor;
    }
    
    public boolean repetidos(int repetidos){
        int cont = 0;
        Nodo aux = inicio;
        boolean repetido = false;
        for(int i = 0; i<tamanio; i++){
            if(repetidos == aux.getValor()){
                cont++;
            }
            aux = aux.getSiguiente();
        }
        if(cont == 2){
            repetido = true;
            cont = 0;
        }
        return repetido;
    }
    
    public double decimales(double promedio){
        promedio = Math.round(promedio * 1000);
        promedio = promedio/1000;
        return promedio;
    }
}
