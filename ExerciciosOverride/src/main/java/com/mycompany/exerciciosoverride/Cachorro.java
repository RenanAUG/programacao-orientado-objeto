/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosoverride;

/**
 *
 * @author Renan
 */
public class Cachorro extends Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está fazendo barulho");
    }
    
    @Override
    public void mover() {
        System.out.println("O Cachorro está correndo");
    }
    
}