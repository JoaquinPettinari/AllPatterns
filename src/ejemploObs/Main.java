package com.company;

import java.util.*;

/**
 * Main class
 **/
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String game = null;

        RockstarGame rockstarGames = new RockstarGame();

        Gamer garry = new Gamer("Garry Rose",rockstarGames);
        Gamer peter = new Gamer("Peter Johnston",rockstarGames);
        Gamer helen = new Gamer("Helen Jack",rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        game = scanner.nextLine();
        rockstarGames.release(game);

        scanner.close();
    }
}


