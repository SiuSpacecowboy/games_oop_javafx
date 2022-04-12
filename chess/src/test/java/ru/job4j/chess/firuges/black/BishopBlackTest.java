package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        Figure bish = new BishopBlack(C1);
        Cell pos = bish.position();
        Cell exp = C1;
        Assert.assertEquals(exp, pos);
    }

    @Test
    public void copyTest() {
        Figure bish = new BishopBlack(C1);
        bish = bish.copy(E3);
        Cell res = bish.position();
        Cell exp = E3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void wayTest() {
        Figure bish = new BishopBlack(C1);
        Cell[] res = bish.way(G5);
        Cell[] exp = {D2, E3, F4, G5};
        Assert.assertArrayEquals(exp, res);
    }

    @Test
    public void isDiagonalTestFalse() {
        Figure bish = new BishopBlack(C1);
        boolean res = ((BishopBlack) bish).isDiagonal(bish.position(), H5);
        boolean exp = false;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void isDiagonalTestTrue() {
        Figure bish = new BishopBlack(C1);
        boolean res = ((BishopBlack) bish).isDiagonal(bish.position(), H6);
        boolean exp = true;
        Assert.assertEquals(exp, res);
    }
}

