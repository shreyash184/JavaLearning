import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell [][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders){
        this.initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0){

            // First get the numbers from where to where the player will go if the snake bites
            int snakeHead = ThreadLocalRandom.current().nextInt(1, (cells.length * cells.length) - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, (cells.length * cells.length) - 1);

            if(snakeTail >= snakeHead){
                continue;
            }

            // Create a jump of snake bite
            Jump snake = new Jump();
            snake.start = snakeHead;
            snake.end = snakeTail;

            // Get the current cell in the cells board and assign the snake to that cell
            Cell snakeCell = getCell(snakeHead);
            snakeCell.jump = snake;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0){

            int ladderHead = ThreadLocalRandom.current().nextInt(1, (cells.length * cells.length) - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, (cells.length * cells.length) - 1);

            if(ladderTail <= ladderHead){
                continue;
            }

            Jump ladder = new Jump();
            ladder.start = ladderHead;
            ladder.end = ladderTail;

            Cell ladderCell = getCell(ladderHead);
            ladderCell.jump = ladder;

            numberOfLadders--;
        }
    }

    Cell getCell(int playerPosition){
        int boardRow = playerPosition / cells.length;
        int boardCol = playerPosition % cells.length;

        return cells[boardRow][boardCol];
    }
}
