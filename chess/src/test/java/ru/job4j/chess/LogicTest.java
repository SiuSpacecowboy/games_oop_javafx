package ru.job4j.chess;

import javafx.scene.Group;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void positionTest() {
        Figure bish = new BishopBlack(Cell.C1);
        Cell pos = bish.position();
        Cell exp = Cell.C1;
        Assert.assertEquals(exp, pos);
    }

    @Test
    public void copyTest() {
        Figure bish = new BishopBlack(Cell.C1);
        bish = bish.copy(E3);
        Cell res = bish.position();
        Cell exp = E3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void wayTest() {
        Figure bish = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.add(bish);
        Cell[] res = bish.way(G5, logic);
        Cell[] exp = {D2, E3, F4, G5};
        Assert.assertArrayEquals(exp, res);
    }
}