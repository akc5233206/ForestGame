package hk.edu.polyu.comp.comp2021.jungle.model;

import hk.edu.polyu.comp.comp2021.jungle.model.piece.*;

import java.util.HashMap;

public class Player{
    private String name;
    private int playerID;
    private HashMap<String, AnimalPieces> playerPiece;
    private boolean winGrame;

    public Player(String name, int playerID)
    {
        this.name = name;
        this.playerID = playerID ;
        this.winGrame = false;
        playerPiece = new HashMap<String, AnimalPieces>();
        playerPiece.put("ELEPHANT", new ElephantPiece(this));
        playerPiece.put("LION", new LionPiece(this));
        playerPiece.put("TIGER", new TigerPiece(this));
        playerPiece.put("LEOPARD", new LeopardPiece(this));
        playerPiece.put("WOLF", new WolfPiece(this));
        playerPiece.put("DOG", new DogPiece(this));
        playerPiece.put("CAT", new CatPiece(this));
        playerPiece.put("RAT", new RatPiece(this));
    }

    public Player(String name, int playerID, String[] animalPieces)
    {
        this.name = name;
        this.playerID = playerID;
        this.winGrame = false;
        playerPiece = new HashMap<String, AnimalPieces>();
        for(String animal : animalPieces)
        {
            if(animal.equals("ELEPHANT")){ playerPiece.put("ELEPHANT", new ElephantPiece(this));}
            else if(animal.equals("LION")) { playerPiece.put("LION", new LionPiece(this));}
            else if(animal.equals("TIGER")) {playerPiece.put("TIGER", new TigerPiece(this)); }
            else if(animal.equals("LEOPARD")) {playerPiece.put("LEOPARD", new LeopardPiece(this)); }
            else if(animal.equals("WOLF")) {playerPiece.put("WOLF", new WolfPiece(this)); }
            else if(animal.equals("DOG")) {playerPiece.put("DOG", new DogPiece(this)); }
            else if(animal.equals("CAT")) {playerPiece.put("CAT", new CatPiece(this));}
            else if(animal.equals("RAT")) {playerPiece.put("RAT", new RatPiece(this));}
        }

    }

    public String getName()
    {
        return this.name;
    }

    public boolean getWinGame (){return this.winGrame;}

    public int getPlayerID(){return this.playerID;}

    public void setWinGame (boolean winGame){this.winGrame = winGame;}

    public int getPieceNumber()
    {
        return this.playerPiece.size();
    }

    public AnimalPieces removePiece(String animalType)
    {
        AnimalPieces deletePiece = this.playerPiece.remove(animalType);
        return deletePiece;
    }


    public AnimalPieces getPiece(String animalType)
    {
        return this.playerPiece.get(animalType);
    }

}
