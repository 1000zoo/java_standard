import java.util.*;

public class MultiArrEx01 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0},
        };

        for(int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char)(i + '0');
            for(int j = 1; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("xy(00 for exit) >> ");
            String input = scanner.nextLine();

            if(input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if(x == 0 && y == 0){
                    break;
                }
            }
            if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.println("Wrong input.");
                continue;
            }
            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
            for(int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
    /*
    result
    xy(00 for exit) >> 55
     123456789
    1
    2
    3
    4
    5    X
    6
    7
    8
    9
     */
}
