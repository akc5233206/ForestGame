package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.square.DenSquare;
import hk.edu.polyu.comp.comp2021.jungle.model.square.Square;

/**
 * The type Wolf piece.
 */
public class WolfPiece extends AnimalPieces {

    /**
     * Instantiates a new Wolf piece.
     *
     * @param player the player
     */
    public WolfPiece(Player player)
    {
        super(4, "WOLF" , player , "W");
    }

    @Override
    public boolean moveToBoardDestination(Player currPlayer, Square sourceSquare, Square destSquare)
    {
        boolean movementSuccess = false;
        // Check any animal is contained by the destination's square or not.
        if(!DenSquare.class.isInstance(destSquare))
        {
            if(destSquare.getAnimal() != null)
            {
                if(destSquare.getAnimal().getPlayer() != currPlayer)
                {
                    movementSuccess = captureAnimal(sourceSquare, destSquare);
                }

            }else
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                movementSuccess = true;
            }
        }else
        {
            if(sourceSquare.getAnimal().getPlayer() != ((DenSquare) destSquare).getPlayerObj())
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                currPlayer.setWinGame(true);
                movementSuccess = true;
            }
        }
        return movementSuccess;
    }

}
