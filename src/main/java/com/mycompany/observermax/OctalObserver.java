/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observermax;

/**
 *
 * @author maxfr
 */
// Define outra classe concreta OctalObserver que também herda da classe Observer
public class OctalObserver extends Observer {
    // Construtor que recebe o objeto Subject como argumento e chama o construtor da classe pai Observer
    public OctalObserver(Subject subject) {
        super(subject);
    }

    // Implementação do método update que imprime o estado atual do Subject em formato octal
    @Override
    public void update() {
        System.out.println("Cadeia Octal: " + Integer.toOctalString(subject.getState()));
    }
}
