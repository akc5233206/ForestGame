package hk.edu.polyu.comp.comp2021.jungle.model.square;

import hk.edu.polyu.comp.comp2021.jungle.model.piece.AnimalPieces;

public abstract  class Square {
    private AnimalPieces animal ;
    private int rowPosition;
    private char columnPosition;
    private char symbol;

    public Square(AnimalPieces animal, int rowPosition, char columnPosition, char symbol)
    {
        this.animal = animal;
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
        this.symbol = symbol;
    }

    public AnimalPieces getAnimal()
    {
        return this.animal;
    }

    public AnimalPieces setAnimal(AnimalPieces newAnimal)
    {
        return this.animal = newAnimal;
    }

    public char getSymbol()
    {
        return this.symbol;
    }

    public int getRowPosition()
    {
        return this.rowPosition;
    }

    public char getColumnPosition()
    {
        return this.columnPosition;
    }

}
