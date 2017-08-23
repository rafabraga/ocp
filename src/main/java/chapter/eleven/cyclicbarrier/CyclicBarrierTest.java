package chapter.eleven.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(final String[] args) {
		// a mixed-double tennis game requires four players; // so wait for four
		// players
		// (i.e., four threads) to join to start the game
		System.out.println("Reserving tennis court \nAs soon as four players arrive, game will start");
		final CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
		new Player(barrier, "G I Joe");
		new Player(barrier, "Dora");
		new Player(barrier, "Tintin");
		new Player(barrier, "Barbie");
	}

}
