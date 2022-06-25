import java.util.*;  
import java.util.Random;

public class justeprix {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le juste prix, avant de commencer sachez que le nombre à rechercher est compris entre 0 et 100, le temps est infini, bonne chance!");
        Game.jeu();
    }
}

class Game {
    
    public static void jeu() {
        Scanner sc = new Scanner(System.in); //Instanciation de la librairie java.util.* permettant l'entrée d'une valeur par l'utilisateur
        Random rand = new Random(); //Instanciation de la librairie java.util.Random pour préparer la génération d'entier
        int upperbound = 101; //Variable instaurant une limite de génération d'entiers compris entre 0 et 100
        int number = rand.nextInt(upperbound); //Création d'une variable générant un entier entre 0 et 100 en prenant compte des précédents paramètres
        int userEntry; //Création d'une variable sans valeur pour l'entrée utilisateur
        do {
            System.out.println("Entrez un nombre: ");
            userEntry = sc.nextInt(); //Affectation de la méthode sc.nextInt(); à la variable userEntry
            if (userEntry > number) {
                System.out.println("Moins");
            } else if (userEntry < number) {
                System.out.println("Plus");
            } else {
                System.out.println("Trouvé, le nombre à chercher était: " + number);
            }
        } while(userEntry != number);
    }
}