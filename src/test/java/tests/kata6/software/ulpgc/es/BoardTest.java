package tests.kata6.software.ulpgc.es;

import kata6.software.ulpgc.es.Board;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoardTest {

    @Test
    public void should_return_empty_board_given_empty_board(){
        String state = new Board("").next().state();
        assertThat(state).isEqualTo("");
    }

    @Test
    public void should_return_board_1x1_with_a_dead_cell_given_board_1x1_with_a_dead_cell(){
        String state = new Board(".").next().state();
        assertThat(state).isEqualTo(".");
    }

    @Test
    public void should_return_board_2x2_with_all_alive_cells_given_board_2x2_with_all_alive_cells(){
        String state = new Board(Cases.board_2x2_all_alive_cells).next().state();
        assertThat(state).isEqualTo(Cases.board_2x2_all_alive_cells);
    }

    @Test
    public void should_return_board_3x3_with_alive_cells_in_corners_given_board_3x3_with_all_alive_cells(){
        String state = new Board(Cases.board_3x3_with_all_alive_cells).next().state();
        assertThat(state).isEqualTo(Cases.board_3x3_with_all_alive_cells_in_corners);
    }

    public static class Cases {
        public static final String board_2x2_all_alive_cells = """
                XX
                XX
                """.trim();
        public static final String board_2x2_all_dead_cells = """
                ..
                ..
                """.trim();
        public static final String board_2x2_with_one_alive_cell = """
                ..
                X.
                """.trim();
        public static final String board_2x2_with_triangle_structure = """
                XX
                .X
                """.trim();
        public static final String board_3x3_with_all_alive_cells = """
                XXX
                XXX
                XXX
                """.trim();
        public static final String board_3x3_with_all_alive_cells_in_corners = """
                X.X
                ...
                X.X
                """.trim();
    }
}
