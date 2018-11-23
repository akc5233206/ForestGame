# Project Report
## Group 12
## COMP2021 Object-Oriented Programming (Fall 2018)






14109602D		AN Ke Cheng
15070597D		HO Tin Yau
17052432D		TUET Ka Ho
17077852D		MAK Siu Wang

1   	Introduction

This document describes the design and implementation of the Jungle game by group 12.  In this report, the implemented requirements and the will be described, and the program design will also be mentioned. It also included the guide for the user which includes all the available commands for the users to play the game.

2   	The Jungle Game

The board of the Jungle game consists of seven columns and nine rows of squares. Pieces move on the square spaces as in international chess, not on the lines as in Chinese Chess. Pictures of eight animals and their names appear on each side of the board to indicate initial placement of the game pieces. After initial setup, these animal spaces have no special meaning in gameplay. There are several special squares and areas on the Jungle board: The dens are located in the center of the boundary rows of the board and are labeled as such in Chinese. Traps are located to each side and in front of the dens and are also labeled in Chinese. Two water areas or rivers are located in the center of the board: each comprises six squares in a 2& 3 rectangle and is labeled with the Chinese characters for river. There are single columns of ordinary land squares on the edges of the board, and down the middle between the rivers.



2.1 Requirements
REQ01: When the program is launched, a user should be able to choose between starting a new game and opening a saved game;
Software elements:
Class name:
Methods:

REQ02: At the beginning of a new game, the two players X and Y should be prompted to input their names. Then the initial board should be printed and player X should be prompted to input a command;
Software elements:
Class name:
Methods:

REQ03: A command can be a save command, an open command, or a move command:
·   	save [filePath]: To save the current game into file at [filePath].
·   	open [filePath]: To load a saved game from [filePath]. If the current game is not saved yet, prompt the player to save the current game first.
·   	move [fromPosition] [toPosition]: To move the piece at [fromPosition] to [toPosition]. For example, move C7 C3 means to move the piece at position C7 to position C3. You may refer to Figure 1 in Appendix A for the encoding of positions on the game board.
Software elements:
Class name:
Methods:

REQ04: If a command is valid, in the sense that it can be executed successfully, the command is executed. An invalid command should not affect the game state. Continuing the previous example, if the player making the move has no piece at location C7 or the piece is not allowed to directly jump to C3, the move is invalid and will not change the state of the game;
Software elements:
Class name:
Methods:

REQ05: After each valid move, the updated game board should be printed, and the game checks if a player has achieved the goal (Appendix A.5): If yes, the game is over and the program should exit after printing the name of the winning player; Otherwise, the current player's turn is terminated and the other player should be prompted to input the next command;
Software elements:
Class name:
Methods:

REQ06: Upon an invalid command, an error message should be shown, the same player should be prompted to input another move. If the invalid command is a move command, the current game board should also be printed;
Software elements:
Class name:
Methods:

Bonus REQ01: The game should have a full-fleged GUI mode.
Software elements:
Class name:
Methods:

Bonus REQ02: Two players should be able to play the game with each other on different computers.
(Not implemented)




2.2 Design

[Pic: Class diagram]

How different components fit together

2.3 Guide for the users

Describe here all the commands that players can use.
