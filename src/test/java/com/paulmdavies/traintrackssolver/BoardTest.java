package com.paulmdavies.traintrackssolver;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {

  private final List ANY_COLUMN_REQUIREMENTS = mock(List.class);
  private final List ANY_ROW_REQUIREMENTS = mock(List.class);
  private final Map ANY_INITIAL_LAYOUT = mock(Map.class);

  @Test
  public void shouldReturnColumnRequirements() {
    List expectedColumnRequirements = mock(List.class);

    Board board = new Board(expectedColumnRequirements, ANY_ROW_REQUIREMENTS, ANY_INITIAL_LAYOUT);

    List<Integer> columnRequirements = board.getColumnRequirements();

    assertThat(
        expectedColumnRequirements,
        equalTo(columnRequirements)
    );
  }

  @Test
  public void shouldReturnRowRequirements() {
    List expectedRowRequirements = mock(List.class);

    Board board = new Board(ANY_COLUMN_REQUIREMENTS, expectedRowRequirements, ANY_INITIAL_LAYOUT);

    List<Integer> rowRequirements = board.getRowRequirements();

    assertThat(
        expectedRowRequirements,
        equalTo(rowRequirements)
    );
  }

  @Test
  public void shouldReturnInitialLayout() {
    Map expectedInitialLayout = mock(Map.class);

    Board board = new Board(ANY_COLUMN_REQUIREMENTS, ANY_ROW_REQUIREMENTS, expectedInitialLayout);

    Map<Integer, Map<Integer, Square>> initialLayout = board.getInitialLayout();

    assertThat(
        expectedInitialLayout,
        equalTo(initialLayout)
    );
  }
}