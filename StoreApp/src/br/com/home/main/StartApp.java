package br.com.home.main;

import br.com.home.classes.Manager;
import br.com.home.classes.SubManager;

public class StartApp {

    public static void main(String[] args) {
        System.out.println("Application has started");
        System.out.println("--------------------------------------");
        Manager manager = new Manager("Guilherme", 25, "A1", "VIVO");
        manager.getDescription();
        System.out.println();
        SubManager subManager = new SubManager("Fulano de tal", 21, "A2", "VIVO");
        subManager.getDescription();
        System.out.println("Superior: " + manager.getName());
    }

}
