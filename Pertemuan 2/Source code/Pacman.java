public class Pacman{
int x, y, width, height;

    void moveLeft(int n) {
        x -= 1;
    }

    void moveRight(int n) {
        x += 1;
    }

    void moveUp(int n) {
        y += 1;
    }

    void moveDown(int n) {
        y -= 1;
    }

    void printPosition(int n, int o) {
        System.out.println("\nPacman pada posisi (x,y) = (" + x + "," + y + ")");
    }
}