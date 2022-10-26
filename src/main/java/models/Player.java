package pl.chess.game.models;

import java.util.ArrayList;

public class Player implements ChessPlayer{
    private Timer timer;
    private ArrayList<Pieces> beatenChessPieces;
    public Player(Timer timer) {
        beatenChessPieces = new ArrayList<Pieces>();
        this.timer = timer;
    }
    public Timer getTimer(){
        return this.timer;
    }

    public int getPoint(){
        int point = 0;
        for (Pieces beatenChessPiece : beatenChessPieces) {
            point += beatenChessPiece.getPieceValue();
        }
        return point;
    }

    public ArrayList<Pieces> getBeatenChessPieces(){
        return this.beatenChessPieces;
    }
    public void addToBeatenChessPieces(Pieces piece){
        this.beatenChessPieces.add(piece);
    }
}
