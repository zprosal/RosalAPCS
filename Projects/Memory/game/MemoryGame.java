package game;

public class MemoryGame {
    private int size;
    private int maxMisses;
    private int numShape;
    private MemoryPiece[][] board;

    public MemoryGame(int size, int maxMisses) {
        this.size = size;
        this.maxMisses = maxMisses;
        this.board = new MemoryPiece [size][size];
        this.numShape = 4;

        int totalItems = size * size;
        int numEachShape = totalItems / numShape;
        ArrayList<MemoryPiece> list = new ArrayList(MemoryPiece);
        
        for(int i = 0; i < numEachShape; i++) {
            list.add(new.Star());
        }

        for(int i = 0; i < numEachShape; i++) {
            list.add(new.Dollar());
        }    

        for(int i = 0; i < numEachShape; i++) {
            list.add(new.Ques());
        }

        for(int i = 0; i < numEachShape; i++) {
            list.add(new.Excl());
        }      

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                board[i][j] = list.remove(0);
            }
        }   
        shuffleBoard();
    }        

    public void run() {

    }
    
    private void shuffleBoard() {

    }

    public void render() {
        for(int i = 0; i < board.size(); i++) {
            System.out.print(i);
            for(int j = 0; j < board[].size(); j++) {
                System.out.print(" | " + board[i][j].render());
            }
            System.out.print(" |/n" );
        }
    }
}