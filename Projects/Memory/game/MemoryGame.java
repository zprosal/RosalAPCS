package game;

public class MemoryGame {
    private int size;
    private int maxMisses;
    private MemoryPiece[][] board;

    public MemoryGame(int size, int maxMisses) {
        this.size = size;
        this.maxMisses = maxMisses;
        this.board = new MemoryPiece [size][size];
    }

    public void render() {
        for(int i = 0; i < board.size(); i++) {
            for(int j = 0; j < board[].size(); j++) {
                System.out.print(i + " ")
            }
        }
    }
}