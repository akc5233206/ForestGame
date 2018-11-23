package hk.edu.polyu.comp.comp2021.jungle.model;

import hk.edu.polyu.comp.comp2021.jungle.view.JungleGameConsole;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class modelTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    private final String basePath = System.getProperty("user.dir");

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

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void case1(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case1.txt")+"\n"
                + "move A9 A8\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case2(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case2.txt")+"\n"
                + "move F2 F1\n"
                + "move A9 A8\n"
                + "move F1 E2\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case3(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case3.txt")+"\n"
                + "move C4 C5\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case4(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case4.txt")+"\n"
                + "move A7 A4\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case5(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case5.txt")+"\n"
                + "move G9 F9\n"
                + "move A1 B1\n"
                + "move F9 E9\n"
                + "move B1 C1\n"
                + "move E9 D9\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case6(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case6.txt")+"\n"
                + "move G3 F3\n"
                + "move G7 F7\n"
                + "move F3 F4\n"
                + "move C7 C8\n"
                + "move F4 F5\n"
                + "move E7 D7\n"
                + "move F5 F6\n"
                + "move A9 A8\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case6_1(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case6.txt")+"\n"
                + "move F6 F7\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case6_2(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case6.2.txt")+"\n"
                + "move A3 A4\n"
                + "move F7 G7\n"
                + "move F6 F7\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    @Test
    public void case6_2_1(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case6.2.txt")+"\n"
                + "move G7 F7\n"
                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

    public void case6_2_3(){
        final String inputString = "open "+basePath.concat("/boardFileForTesting/case6.2.txt")+"\n"
                + "move G9 F9\n"
                + "move G7 G8\n"
                + "move G7 G8\n"
                + "move F9 E9\n"
                + "move G8 G9\n"
                + "move D7 D8\n"
                + "move G9 F9\n"
                + "move A6 A5\n"
                + "move F9 E9\n"

                + "exit\n";
        provideInput(inputString);
        JungleGame junleGame = new JungleGame();
        JungleGameConsole console = new JungleGameConsole(junleGame);
        console.startConsole();
        final String outString = "Input : Exit the current Jungle Board Game.\n";
        assertEquals(outString, getOutput());
    }

}