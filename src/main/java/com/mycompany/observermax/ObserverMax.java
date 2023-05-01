/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observermax;

/**
 *
 * @author maxfr
 */
public class ObserverMax {

    public static void main(String[] args) {
        // Cria um objeto Subject
        Subject subject = new Subject();

        // Cria dois observadores e os registra no objeto Subject
        new BinaryObserver(subject);
        new OctalObserver(subject);

        // Altera o estado do objeto Subject duas vezes, imprimindo o valor em binário e octal após cada alteração
        System.out.println("Primeira mudança de estado: 15");
        subject.setState(15);

        System.out.println("\nSegunda mudança de estado: 10");
        subject.setState(10);
    }
}
