package org.example.hw_javaLess01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        // #region ex1 Demo

         BaseHero hero3 = new Magician();

         BaseHero hero4 = new Priest();

         Doctor hero1 = new Doctor();


        // #endregion

        // #region ex2 Attack
         System.out.println("------");
         System.out.println(hero3.getInfo());
         System.out.println(hero4.getInfo());
         System.out.println(hero1.getInfo());

         hero3.Attack(hero4);

         hero4.Attack(hero1);
         System.out.println();
         System.out.println(hero3.getInfo());
         System.out.println(hero4.getInfo());
         System.out.println(hero1.getInfo());
         System.out.println("------");
         hero1.Heal(hero1);
         hero1.Heal(hero4);
         System.out.println(hero3.getInfo());
         System.out.println(hero4.getInfo());
         System.out.println(hero1.getInfo());

        // #endregion

        // #region Teams

//        int teamCount = 10;
//        Random rand = new Random();
//        int magicianCount = 0;
//        int priestCount = 0;
//
//
//        List<BaseHero> teams = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            if (rand.nextInt(2) == 0) {
//                teams.add(new Priest());
//                priestCount++;
//            }
//            else{
//                teams.add(new Magician());
//                magicianCount++;
//            }
//
//            System.out.println(teams.get(i).getInfo());
//        }
//        System.out.println();
//        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);

        // attack

        // #endregion

        // todo добавить ещё один класс и
        // реализовать возможность лечения героев
    }
}