
import src.Hero;

import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        // création d'une ArrayList de Hero nommée heroes
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero black = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderMan = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(black);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(spiderMan);
        heroes.add(hulk);
        heroes.add(doctorStrange);


        // TODO 3 : It's Thor birthday, now he's 1501

        Hero stuff = heroes.get(5);
        stuff.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        /*
        System.out.println("Hero size avant : " + heroes.size());
          for (Hero hero : heroes) { // iterate though the list
             System.out.println(hero.getName() + " " + hero.getAge());
        }
        */

        Collections.shuffle(heroes);
        /*
        System.out.println("Hero size après: " + heroes.size());
        for (Hero herob : heroes) { // iterate though the list
            System.out.println(herob.getName() + " " + herob.getAge());
        }
        */
            // TODO 5 : Keep only the half of the list

            List<Hero> heroes1 = heroes.subList(0, 4);

            // print the subList
            //System.out.println(heroes1);

            // TODO 6 : Loop throught the list and display the name of the remaining heroes


            System.out.println("les héros encore en vie sont : ");
            for (Hero hero1: heroes1) { // iterate though the list
                System.out.println(hero1.getName());

            }
        }
    }
