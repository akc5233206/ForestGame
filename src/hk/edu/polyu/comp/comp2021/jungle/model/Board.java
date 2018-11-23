package hk.edu.polyu.comp.comp2021.jungle.model;

import hk.edu.polyu.comp.comp2021.jungle.model.square.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Board.
 */
class Board {
    private HashMap<String, Square> boardMap;
    private final int BOARD_ROW_SIZE = 9;
    private final int BOARD_COLUMN_SIZE = 7;
    private static final int ASCII_CODE_A = 65;
    private static final int ASCII_CODE_0 = 48;

    /**
     * Instantiates a new Board.
     */
    Board()
    {
        boardMap = new HashMap<String, Square>();
    }


    /**
     * Init new game board boolean.
     *
     * @param player1 the player 1
     * @param player2 the player 2
     * @return the boolean
     */
    boolean initNewGameBoard(Player player1, Player player2)
    {
        if(boardMap == null ){return false;}
        char colChar;
        for(int curRow = 1; curRow < BOARD_ROW_SIZE + 1 ; curRow ++)
        {
            for(int curColumn = 0; curColumn < BOARD_COLUMN_SIZE ; curColumn ++ )
            {
                switch (curColumn)
                {
                    case 0:
                        colChar = 'A';
                        switch(curRow)
                        {
                            case 1:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("TIGER"): null, curRow,colChar));
                                break;
                            case 3:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ?player1.getPiece("ELEPHANT"): null, curRow,colChar));
                                break;
                            case 7:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ?player2.getPiece("RAT"): null, curRow,colChar));
                                break;
                            case 9:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ?player2.getPiece("LION"): null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 1:
                        colChar = 'B';
                        switch(curRow)
                        {
                            case 2:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("CAT") : null, curRow,colChar));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new RiverSquare(null, curRow,colChar));
                                break;
                            case 8:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ? player2.getPiece("DOG") : null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 2:
                        colChar = 'C';
                        switch(curRow)
                        {
                            case 1:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            case 3:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("WOLF"): null, curRow,colChar));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new RiverSquare(null, curRow,colChar));
                                break;
                            case 7:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ? player2.getPiece("LEOPARD"): null, curRow,colChar));
                                break;
                            case 9:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 3:
                        colChar = 'D';
                        switch(curRow)
                        {
                            case 1:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new DenSquare(null, player1  , curRow , colChar));
                                break;
                            case 2:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            case 8:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            case 9:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new DenSquare(null, player2  , curRow, colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 4:
                        colChar = 'E';
                        switch(curRow)
                        {
                            case 1:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            case 3:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("LEOPARD"): null, curRow,colChar));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new RiverSquare(null, curRow,colChar));
                                break;
                            case 7:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ? player2.getPiece("WOLF"): null, curRow,colChar));
                                break;
                            case 9:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new TrapSquare(null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 5:
                        colChar = 'F';
                        switch(curRow)
                        {
                            case 2:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("DOG") : null, curRow,colChar));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new RiverSquare(null, curRow,colChar));
                                break;
                            case 8:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ?player2.getPiece("CAT") : null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;
                    case 6:
                        colChar = 'G';
                        switch(curRow)
                        {
                            case 1:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("LION"): null, curRow,colChar));
                                break;
                            case 3:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player1 != null ? player1.getPiece("RAT") : null, curRow,colChar));
                                break;
                            case 7:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ? player2.getPiece("ELEPHANT") : null, curRow,colChar));
                                break;
                            case 9:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(player2 != null ? player2.getPiece("TIGER") : null, curRow,colChar));
                                break;
                            default:
                                boardMap.put(String.valueOf(colChar) + String.valueOf(curRow), new LandSquare(null, curRow,colChar));
                                break;
                        }
                        break;

                }
            }
        }
        return true;
    }

    /**
     * Save game board list.
     *
     * @return the list
     */
    List<String> saveGameBoard()
    {
        List<String> boardList = new ArrayList<>();
        for(String keyName : boardMap.keySet())
        {
            if(boardMap.get(keyName).getAnimal() != null)
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(boardMap.get(keyName).getAnimal().getPlayer().getPlayerID());
                stringBuilder.append(" ");
                stringBuilder.append(keyName);
                stringBuilder.append(" ");
                stringBuilder.append(boardMap.get(keyName).getAnimal().getPiecesName());
                boardList.add(stringBuilder.toString());
            }
        }
        return boardList;
    }

    /**
     * Load game board boolean.
     *
     * @param jungleBoardState the jungle board state
     * @param player1          the player 1
     * @param player2          the player 2
     * @return the boolean
     */
    boolean loadGameBoard(List<String> jungleBoardState, Player player1, Player player2)
    {
        boolean loadGameBoardSuccess = false;
        try
        {
            // Clear the Game Board (HashMap)
            this.clearGameBoard();

            // Load the saved animal piece into the board
            for(String squareState : jungleBoardState)
            {
                String[] curSquare = squareState.split(" ");
                if(curSquare[0].equals("1"))
                {
                    boardMap.get(curSquare[1]).setAnimal(player1.getPiece(curSquare[2]));
                }else if(curSquare[0].equals("2"))
                {
                    boardMap.get(curSquare[1]).setAnimal(player2.getPiece(curSquare[2]));
                }
            }

            // Assign the den from the player
            ((DenSquare)boardMap.get("D1")).setPlayerObj(player1);
            ((DenSquare)boardMap.get("D9")).setPlayerObj(player2);
            loadGameBoardSuccess = true;

        }catch (NullPointerException e)
        {
            loadGameBoardSuccess = false;

        }
        return loadGameBoardSuccess;
    }


    /**
     * Clear game board.
     */
    void clearGameBoard()
    {
        if(this.boardMap.size() == 0)
        {
            this.initNewGameBoard(null, null);
        }else
        {
            for(String keyName : this.boardMap.keySet())
            {
                if(this.boardMap.get(keyName).getAnimal() != null)
                {
                    this.boardMap.get(keyName).setAnimal(null);
                }
            }
        }


    }


    /**
     * Print game board string [ ] [ ].
     *
     * @param player2 the player 2
     * @return the string [ ] [ ]
     */
    String[][] printGameBoard(Player player2)
    {
        String[][] jungleBoard = new String[BOARD_ROW_SIZE][BOARD_COLUMN_SIZE];
        for ( String squareID : boardMap.keySet() ) {
            int col = squareID.charAt(0) - ASCII_CODE_A;
            int row = BOARD_ROW_SIZE - (squareID.charAt(1) - ASCII_CODE_0);
            StringBuilder squareNameBuilder = new StringBuilder();
            Square curSquare = boardMap.get(squareID);
            if(curSquare.getAnimal() != null)
            {

                squareNameBuilder.append(curSquare.getAnimal().getAbbreviation());

                if(curSquare.getAnimal().getPlayer() == player2)
                {
                    squareNameBuilder.append("'");
                }else
                {
                    squareNameBuilder.append(" ");
                }
            }else
            {
                squareNameBuilder.append(curSquare.getSymbol());
            }

            squareNameBuilder.append("\t");
            jungleBoard[row][col] = squareNameBuilder.toString();

        }

        return jungleBoard;
    }


    /**
     * Move piece on board boolean.
     *
     * @param movePlayer     the move player
     * @param sourceLocation the source location
     * @param destLocation   the dest location
     * @return the boolean
     */
    boolean movePieceOnBoard (Player movePlayer, String sourceLocation, String destLocation)
    {
        //Check the sourceLocation is exist in the Jungle Board or not.
        boolean moveSuccess = false;
        if(!isSquare(sourceLocation) || !isSquare(destLocation)){ return moveSuccess;}
        Square sourceSquare = boardMap.get(sourceLocation);
        Square destSquare = boardMap.get(destLocation);


        //Check the source square contains the animal or not.
        //Check the selected animal is belong to the current player or not.
        if(sourceSquare.getAnimal() == null ||
                sourceSquare.getAnimal().getPlayer() != movePlayer) {return moveSuccess;}


        //determine the position of the source square and destination square.
        //Check the distinct between source square and destination square.
        // Two part of if statement will check the type of movement (jumping and walking)
        // First the if statement will check the jumping movement first, then walking.
        // In the "jumping" movement, the the function will check the location of source square about is it around the river?
        // Also, the animal type in source's square will also be checked.

        if(sourceSquare.getAnimal().isValidMovement(movePlayer, sourceSquare,destSquare))
        {
            moveSuccess = sourceSquare.getAnimal().moveToBoardDestination(movePlayer, sourceSquare,destSquare);
        }


/*        if((sourceSquare.getRowPosition() == destSquare.getRowPosition() && sourceSquare.getColumnPosition() + 3 == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() == destSquare.getRowPosition() && sourceSquare.getColumnPosition() - 3 == destSquare.getColumnPosition()) ||
                (sourceSquare.getRowPosition() + 4 == destSquare.getRowPosition() && sourceSquare.getColumnPosition() == destSquare.getColumnPosition()) ||
                (sourceSquare.getRowPosition() - 4 == destSquare.getRowPosition() && sourceSquare.getColumnPosition() == destSquare.getColumnPosition()))
        {
            if(isAroundRiver(sourceSquare.getRowPosition(), sourceSquare.getColumnPosition()) &&
                    (sourceSquare.getAnimal().getClass().isInstance(LionPiece.class) || sourceSquare.getAnimal().getClass().isInstance(TigerPiece.class)))
            {
                moveSuccess = movePieceToBoardLand(movePlayer, sourceSquare, destSquare);
            }

        }else if((sourceSquare.getRowPosition()+ 1 == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() - 1 == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() + 1 == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() - 1 == destSquare.getColumnPosition() ))
        {
            if(destSquare.getClass().isInstance(RiverSquare.class))
            {
                if(sourceSquare.getAnimal() instanceof RatPiece)
                {
                    moveSuccess = movePieceToBoardRiver(movePlayer, sourceSquare, destSquare);
                }

            }else if(destSquare instanceof LandSquare)
            {
                moveSuccess = movePieceToBoardLand(movePlayer, sourceSquare, destSquare);
            }else if(destSquare instanceof DenSquare)
            {
                moveSuccess = movePieceToBoardDen(movePlayer , sourceSquare, destSquare);
            }else if(destSquare instanceof  TrapSquare)
            {
                moveSuccess = movePieceToBoardTraps(movePlayer, sourceSquare, destSquare);
            }



        }*/

        return moveSuccess;
    }

/*    private Boolean movePieceToBoardLand(Player movePlayer, Square sourceSquare, Square destSquare)
    {
        boolean landMovementSuccess = false;
        // Check any animal is contained by the destination's square or not.
        if(destSquare.getAnimal() != null)
        {
            if(destSquare.getAnimal().getPlayer() != movePlayer)
            {
                landMovementSuccess = eatAnimal(sourceSquare, destSquare);
            }

        }else
        {
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            landMovementSuccess = true;
        }


        //Move out from the trap.
        if(destSquare.getAnimal().getInTrap())
        {
            destSquare.getAnimal().setInTrap(false);
        }

        return landMovementSuccess;
    }*/

/*    private Boolean movePieceToBoardRiver(Player movePlayer, Square sourceSquare, Square destSquare)
    {
        boolean riverMoveMentSuccess = false;
        if(destSquare.getAnimal() == null)
        {
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            riverMoveMentSuccess = true;
        }else if(sourceSquare instanceof RiverSquare && destSquare.getAnimal() != null)
        {
            if(destSquare.getAnimal().getPlayer() != movePlayer)
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                riverMoveMentSuccess = true;
            }
        }
        return riverMoveMentSuccess;
    }*/


/*    private Boolean movePieceToBoardTraps(Player movePlayer, Square sourceSquare, Square destSquare)
    {
        boolean trapsMovementSuccess = false;

        if(destSquare.getAnimal() != null)
        {
            if(destSquare.getAnimal().getPlayer() != movePlayer)
            {
                trapsMovementSuccess = eatAnimal(sourceSquare, destSquare);
            }

        }else
        {
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            trapsMovementSuccess = true;
        }

        // Move into the trap
        destSquare.getAnimal().setInTrap(true);

        return trapsMovementSuccess;
    }*/

/*    private Boolean movePieceToBoardDen(Player movePlayer, Square sourceSquare, Square destSquare)
    {
        boolean denMovementSuccess = false;
        if(sourceSquare.getAnimal().getPlayer() != ((DenSquare) destSquare).getPlayerObj())
        {
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            movePlayer.setWinGame(true);
            denMovementSuccess = true;
        }
        return denMovementSuccess;
    }*/


/*    private Boolean eatAnimal(Square sourceSquare, Square destSquare)
    {
        boolean eatSuccess = false;
        if((sourceSquare.getAnimal().getRank() >= destSquare.getAnimal().getRank() &&
                ((sourceSquare instanceof RiverSquare && destSquare instanceof RiverSquare)||
                        (sourceSquare instanceof LandSquare && destSquare instanceof LandSquare))) ||
                sourceSquare.getAnimal() instanceof  RatPiece && destSquare.getAnimal() instanceof ElephantPiece||
                destSquare instanceof TrapSquare)
        {
            destSquare.getAnimal().getPlayer().removePiece(destSquare.getAnimal().getPiecesName());
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            eatSuccess = true;
        }
        return eatSuccess;
    }*/


/*    private Boolean isAroundRiver(int sourceRow , char sourceCol)
    {
        boolean result = false;
        switch (sourceCol)
        {
            case 'A':
            case 'D':
            case 'G':
                result = sourceRow >= 4 && sourceRow <=6;
                break;
            case 'B':
            case 'C':
            case 'E':
            case 'F':
                result = sourceRow == 3 || sourceRow == 7;
                break;
        }
        return result;
    }*/


    /**
     * Is square boolean.
     *
     * @param square the square
     * @return the boolean
     */
    boolean isSquare(String square)
    {
        return this.boardMap.containsKey(square);
    }





}
