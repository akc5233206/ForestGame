package hk.edu.polyu.comp.comp2021.jungle;

import hk.edu.polyu.comp.comp2021.jungle.model.JungleGame;
import hk.edu.polyu.comp.comp2021.jungle.view.JungleGameConsole;

/**
 *
 */
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
    }
}
