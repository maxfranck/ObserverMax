/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observermax;

/**
 *
 * @author maxfr
 */
// Define a classe abstrata Observer que representa os observadores do objeto Subject
public abstract class Observer {
    protected Subject subject; // Referência ao objeto Subject que o observador monitora

    // Construtor que recebe o objeto Subject como argumento e registra o observador na lista de observadores do Subject
    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    // Método abstrato que deve ser implementado pelas subclasses para definir a ação a ser executada quando o Subject for alterado
    public abstract void update();
}
