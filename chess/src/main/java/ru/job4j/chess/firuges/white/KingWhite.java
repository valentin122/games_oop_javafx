package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class KingWhite implements Figure {
    private final Cell position;

    public KingWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (
                (source.y == dest.y -1 && source.x == dest.x + 1)
                || (source.y == dest.y + 1 && source.x == dest.x + 1)
                || (source.y == dest.y + 1 && source.x == dest.x)
                || (source.y == dest.y + 1 && source.x == dest.x - 1)
                || (source.y == dest.y && source.x == dest.x - 1)
                || (source.y == dest.y && source.x == dest.x + 1)
                || (source.y == dest.y -1 && source.x == dest.x - 1)
                || (source.y == dest.y -1 && source.x == dest.x)
                ) {
            steps = new Cell[] { dest };
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingWhite(dest);
    }
}
