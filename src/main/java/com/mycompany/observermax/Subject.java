/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observermax;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxfr
 */
// Define o objeto que os observadores vão monitorar
public class Subject {
    private List<Observer> observers = new ArrayList<>(); // Lista de observadores
    private int state; // Estado do objeto

    // Obtém o estado do objeto
    public int getState() {
        return state;
    }

    // Define o estado do objeto e notifica todos os observadores
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    // Adiciona um observador à lista
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Notifica todos os observadores na lista
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(); // Chama o método update de cada observador
        }
    }
}
