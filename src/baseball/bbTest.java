package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bbTest {

	@Test
	void BbTest() {
		/*
		 * This is Babe Ruth;
		 */
		int AB1 = 2873;
		int Hits1 = 8399;
		
		
		Player pl1 = new Player(2873, 8399, 2062, 43, 0, 506, 136, 714);
		
		assertEquals(.342,pl1.BA());
		assertEquals(.690,pl1.SLG());
		assertEquals(.474,pl1.OBP());
		assertEquals(1.164,Player.OBS(pl1));
		assertEquals(5793,Player.TB(pl1));
		
		
		
		
		
	}

}
