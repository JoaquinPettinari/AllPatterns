package com.company;

/**
 * Observable interface
 **/
interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}