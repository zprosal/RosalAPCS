package game;

public abstract class MemoryPiece {
    public abstract String getShapeType();

    public void render() {
        System.out.print(getShapeType());
    }
    public Boolean isRevealed() {

    }
}