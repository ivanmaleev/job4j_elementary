package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static int checkGame(double percent, int prize, int pay) {
        if (percent * prize > pay) {
            return (int) (percent * prize - pay);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Game.menu("tanks");
    }
}
