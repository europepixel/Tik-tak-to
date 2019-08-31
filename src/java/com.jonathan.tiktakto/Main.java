package com.jonathan.tiktakto;
import java.io.Console;
import java.util.ArrayList;

public class Main {
    private static Object Pieces;

    public static void main (String [] args) {
        Console cons = System.console();
        System.out.println("How many players?");
        String awnser = cons.readLine();
        int playercount = Integer.parseInt(awnser);

        ArrayList<Player> list = new ArrayList<>();
        
        for(int p = 0; p < playercount; p++) {
            Player player = new Player();
            System.out.println("Type your name");
            String name = cons.readLine();
            player.setName(name);
            System.out.println("What piece do you want to be?");
            String userpiece = cons.readLine();
            Pieces piece = com.jonathan.tiktakto.Pieces.valueOf(userpiece);
            player.setPiece(piece);
            list.add(player);
        }
    }
}
