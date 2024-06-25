package com.simple_pojo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Player Info :");

        PlayerData obj = new PlayerData();

        obj.setPlayerName("Rohit Sharma");
        obj.setJerseyNo(45);
        obj.setCountry("India");

        System.out.println("Player Name : "+obj.getPlayerName());
        System.out.println("Jersey number : "+obj.getJerseyNo());
        System.out.println("Country : "+obj.getCountry());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player's name : ");
        String playerName = sc.nextLine();

        System.out.println("Enter country name : ");
        String country = sc.nextLine();

        System.out.println("Enter jersey number : ");
        int jerseyNo = sc.nextInt();

        obj = new PlayerData();

        obj.setPlayerName(playerName);
        obj.setJerseyNo(jerseyNo);
        obj.setCountry(country);
 
        System.out.println("Player Name : "+obj.getPlayerName());
        System.out.println("Jersey number : "+obj.getJerseyNo());
        System.out.println("Country : "+obj.getCountry());
    }
}