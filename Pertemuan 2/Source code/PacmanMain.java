import java.util.Scanner;

public class PacmanMain {
    public static void main(String[] args) {
        Pacman pac = new Pacman();
        Scanner sc = new Scanner(System.in);
        pac.x = 0;
        pac.y = 0;

        System.out.print("Masukkan batas x = ");
        pac.width = sc.nextInt();
        System.out.print("Masukkan batas y = ");
        pac.height = sc.nextInt();

        for (;;) {
            System.out.print(
                "\nPilih action : \n1.Move Left\n2.Move Right\n3.Move Up\n4.Move Down\n5.Exit\nJawaban anda = ");
            int inputPosisi = sc.nextInt();
            if (pac.x == 0 && inputPosisi == 1) {
                System.out.println("\nPacman melebihi batas");
                pac.printPosition(pac.x, pac.y);
                continue;
            } else if (pac.y == 0 && inputPosisi == 4) {
                System.out.println("\nPacman melebihi batas");
                pac.printPosition(pac.x, pac.y);
                continue;
            } else if (pac.x == pac.width && inputPosisi == 2) {
                System.out.println("\nPacman melebihi batas");
                pac.printPosition(pac.x, pac.y);
                continue;
            } else if (pac.y == pac.height && inputPosisi == 3) {
                System.out.println("\nPacman melebihi batas");
                pac.printPosition(pac.x, pac.y);
                continue;
            }

            if (inputPosisi == 1) {
                pac.moveLeft(pac.x);
                pac.printPosition(pac.x, pac.y);
            } else if (inputPosisi == 2) {
                pac.moveRight(pac.x);
                pac.printPosition(pac.x, pac.y);
            } else if (inputPosisi == 3) {
                pac.moveUp(pac.y);
                pac.printPosition(pac.x, pac.y);
            } else if (inputPosisi == 4) {
                pac.moveDown(pac.y);
                pac.printPosition(pac.x, pac.y);
            } else {
                System.out.println("\nTERIMA KASIH\n");
                break;
            }

        }

    }
}