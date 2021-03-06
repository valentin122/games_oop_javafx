package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class RookWhite implements Figure {
    private final Cell position;

    public RookWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        for (int i = 0; i < 8; i++) {
            if (
                    (source.y == dest.y - i && source.x == dest.x)
                    || (source.y == dest.y + i && source.x == dest.x)
                    || (source.y == dest.y && source.x == dest.x + i)
                    || (source.y == dest.y && source.x == dest.x - i))
                steps = new Cell[]{dest};
            }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}
