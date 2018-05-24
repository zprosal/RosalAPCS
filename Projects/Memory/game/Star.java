package game;

public class Star extends MemoryPiece {
    public String getShapeType() {
        return "Star";
    }
    public void render() {
        if(super.isRevealed()) {
            System.out.print(" * "); 
        }
        else {
            super.render();
        }
    }
}