package edu.pdx.cs410J.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link Minesweeper} class.
 */
public class MinesweeperTest {
  
  @Test(expected = UnsupportedOperationException.class)
  public void getArrivalStringNeedsToBeImplemented() {
    Minesweeper flight = new Minesweeper();
    flight.getArrivalString();
  }

  @Test
  public void initiallyAllFlightsHaveTheSameNumber() {
    Minesweeper flight = new Minesweeper();
    assertThat(flight.getNumber(), equalTo(42));
  }

  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    Minesweeper flight = new Minesweeper();
    assertThat(flight.getDeparture(), is(nullValue()));
  }
  
}
