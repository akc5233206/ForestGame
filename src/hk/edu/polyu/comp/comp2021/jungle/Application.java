package hk.edu.polyu.comp.comp2021.jungle;

import hk.edu.polyu.comp.comp2021.jungle.model.JungleGame;
import hk.edu.polyu.comp.comp2021.jungle.view.JungleGameConsole;

/**
 * The type Application.
 */
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments for main class
     */
    public static void main(String[] args) {
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
    }
}
