package chapter.eleven.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread {

	CyclicBarrier waitPoint;

	public Player(final CyclicBarrier barrier, final String name) {
		this.setName(name);
		this.waitPoint = barrier;
		this.start();
	}

	@Override
	public void run() {
		System.out.println("Player " + this.getName() + " is ready ");
		try {
			this.waitPoint.await(); // await for all four players to arrive
		} catch (BrokenBarrierException | InterruptedException exception) {
			System.out.println("An exception occurred while waiting... " + exception);
		}
	}

}
