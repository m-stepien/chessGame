package pl.chess.game.models;

import java.util.ArrayList;

public interface ChessPlayer {
    public int getPoint();
    public ArrayList<Pieces> getBeatenChessPieces();
    public void addToBeatenChessPieces(Pieces piece);
}
