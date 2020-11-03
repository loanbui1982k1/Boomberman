package uet.oop.bomberman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public void createMap() throws FileNotFoundException {
        char[][] map = new char[13][31];
        Scanner scanner = new Scanner(new File("C:\\Users\\DELL\\OneDrive\\Máy tính\\Boomberman\\res\\levels\\Level1.txt"));
        int row = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                map[row][i] = line.charAt(i);
            }
            row++;
        }
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 31; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Test a = new Test();
        a.createMap();
    }
}
