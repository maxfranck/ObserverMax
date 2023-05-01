/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observermax;

/**
 *
 * @author maxfr
 */
// Define uma classe concreta BinaryObserver que herda da classe Observer
public class BinaryObserver extends Observer {
    // Construtor que recebe o objeto Subject como argumento e chama o construtor da classe pai Observer
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    // Implementação do método update que imprime o estado atual do Subject em formato binário
    @Override
    public void update() {
        System.out.println("Cadeia Binária: " + Integer.toBinaryString(subject.getState()));
    }
}
