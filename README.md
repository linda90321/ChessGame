# ChessGame
Please write a program that takes these inputs and produces these outputs:
```
Inputs:
* The current configuration of a chess board (which pieces are where)
* Which player's turn it is to make the next move
Outputs:
* A list of all moves the current player can legally make this turn
```
- IMPORTANT:
* To simplify the task, you don't need to worry about whether a move would lead
to the player's King being in check. Similarly, you are welcome to ignore the "castling" and "en-passant" rules.
* For details on legal chess moves, see the "Basic moves" section here under "Gameplay": https://
en.wikipedia.org/wiki/Rules_of_chess
- Rules:
* You are welcome to use any real programming language (no pseudo-code).
* Do not use any libraries that are not part of the language's standard library.
* Do not include any code in your solution that was not written by you.
- For example, given a chess board in the initial state and the white player's turn, your program's output would look like this:
```
Pawn at <A:2> can move to <A:3>
Pawn at <A:2> can move to <A:4>
Pawn at <B:2> can move to <B:3>
Pawn at <B:2> can move to <B:4>
Pawn at <C:2> can move to <C:3>
Pawn at <C:2> can move to <C:4>
Pawn at <D:2> can move to <D:3>
Pawn at <D:2> can move to <D:4>
Pawn at <E:2> can move to <E:3>
Pawn at <E:2> can move to <E:4>
Pawn at <F:2> can move to <F:3>
Pawn at <F:2> can move to <F:4>
Pawn at <G:2> can move to <G:3>
Pawn at <G:2> can move to <G:4>
Pawn at <H:2> can move to <H:3>
Pawn at <H:2> can move to <H:4>
Knight at <B:1> can move to <A:3>
Knight at <B:1> can move to <C:3>
Knight at <G:1> can move to <F:3>
Knight at <G:1> can move to <H:3>
20 legal moves (10 unique pieces) for white player
```