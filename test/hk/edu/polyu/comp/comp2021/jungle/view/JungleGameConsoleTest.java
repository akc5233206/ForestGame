package hk.edu.polyu.comp.comp2021.jungle.view;

import hk.edu.polyu.comp.comp2021.jungle.model.JungleGame;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JungleGameConsoleTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    public void setUp() throws Exception {

    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    public void tearDown() throws Exception {
    }

    @Test
    public void checkExit() {
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String inputString = "exit";
        provideInput(inputString);
        boolean exitTag = true;
        assertEquals(console.checkExit(), exitTag);
    }

    @Test
    public void exit() {
    }

    @Test
    public void checkGameStarted() {
    }

    @Test
    public void reinitializeGameBoard() {
    }

    @Test
    public void startConsole() {
        final String inputString = "start";
        provideInput(inputString);

        final String outString = "Please enter the name for Player 1 : ";

        assertEquals(outString, getOutput());
    }
}