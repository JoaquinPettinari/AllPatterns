package com.company;


import java.util.HashSet;
import java.util.Set;

/**
 * Concrete observer - Gamer
 **/
class Gamer implements Observer {

    private String name;
    public Observable observable;
    private Set<String> games = new HashSet<String>();


    public Gamer(String name,Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update(String game) {
        buyGame(game);
    }

    public void buyGame(String game) {
        System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
        games.add(game);
    }

    @Override
    public String toString() {
        return this.name;
    }
}