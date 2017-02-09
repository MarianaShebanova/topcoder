public class SafeBetting {

	public int minRounds(int a, int b, int c) {
		int bets = 0;
		while (b < c) {
			b = a + 2 * (b - a);
			bets++;
		}
		return bets;
	}

}
