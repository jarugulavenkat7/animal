/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Walrus
 * @author Rehaman Naguru Abdur
 */
public class WalrusGroup {
    
    private static ArrayList<Walrus> myGroup;

    /**
     * Create a static group of Walrus
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Walrus w = new Walrus("BlackWalrus");
        myGroup.add(w);
        myGroup.add(new Walrus("PacificWalrus"));
        myGroup.add(new Walrus("NorthrenWalrus"));

        return myGroup.size();
    }
    
    /**
     * Enumarated types for donation for Walrus
     */ 
     public enum Donate {
       Food,
       Money,
       ZooNeeds,
       AdoptAnimal;
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("********************************");
        System.out.println("Hey - look at the Walrus!");
        myGroup.forEach(Walrus -> {
            Walrus.speak();
            Walrus.move();
            Walrus.intro();
            Walrus.about();
            Walrus.calculation();
        });
        System.out.println("Nice Walrus ");
        
        System.out.println("*******************************");
    
    Donate d = Donate.AdoptAnimal;
        switch(d) {
            case Food: System.out.println("######Thank you for Donating food#######");
            case Money: System.out.println("$$$$$$$Thank you for Donating Money$$$$$$$$");
            case ZooNeeds: System.out.println("@@@@@@@@@Thank you for Donating Zoo Needs and Accesories@@@@@");
            case AdoptAnimal: System.out.println("********Thank you for your intrest in Adopting an animal*******");            
        }
                
 }
    
   }



