package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {

    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest, Logic logic) {
        //Figure bish =  new BishopBlack(Cell.C1); // Я без понятия как я должен узнать начальное положение фигуры, чтобы выполнить это задания, я должен создавать объект, хотя в рамках программы это в корне неверно.
        Cell pos = logic.collectFigure(0);
        int x = pos.getX();
        int y = pos.getY();
        int x1 = dest.getX();
        int y1 = dest.getY();
        int deltaX = x1 - x > 0 ? 1 : -1;
        int deltaY = y1 - y > 0 ? 1 : -1;
        int size = Math.abs(y1 - y);
        Cell[] arr = new Cell[size];
        for (int index = 0; index < size; index++) {
            x += deltaX;
            y += deltaY;
            arr[index] = Cell.findBy(x, y);
        }
        return arr;
       /* throw new ImpossibleMoveException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        );
*/
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

    public static void main(String[] args) {
        Logic logic = new Logic();
        Figure bish = new BishopBlack(Cell.C1);
        Cell[] array = bish.way(Cell.G5);
    }
}
