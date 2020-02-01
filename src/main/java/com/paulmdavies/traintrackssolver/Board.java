package com.paulmdavies.traintrackssolver;

import java.util.List;
import java.util.Map;

class Board {
  private final List<Integer> columnRequirements;
  private final List<Integer> rowRequirements;
  private final Map<Integer, Map<Integer, Square>> initialLayout;

  Board(
      List<Integer> columnRequirements,
      List<Integer> rowRequirements,
      Map<Integer, Map<Integer, Square>> initialLayout
  ) {
    this.columnRequirements = columnRequirements;
    this.rowRequirements = rowRequirements;
    this.initialLayout = initialLayout;
  }

  public List<Integer> getColumnRequirements() {
    return columnRequirements;
  }

  public List<Integer> getRowRequirements() {
    return rowRequirements;
  }

  public Map<Integer, Map<Integer, Square>> getInitialLayout() {
    return initialLayout;
  }
}