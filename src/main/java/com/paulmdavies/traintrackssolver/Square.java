package com.paulmdavies.traintrackssolver;

public enum Square {
  TRACK_HORIZONTAL(0, "—"),
  TRACK_VERTICAL(1, "|"),
  TRACK_LEFT_UP(2, "⌋"),
  TRACK_RIGHT_UP(3, "⌊"),
  TRACK_LEFT_DOWN(4, "⌉"),
  TRACK_RIGHT_DOWN(5, "⌈"),
  MUST_BE_FILLED(10, "?"),
  MUST_BE_EMPTY(20, "X");

  public final Integer code;
  public final String name;

  Square(Integer code, String shortName) {
    this.code = code;
    this.name = shortName;
  }
}
