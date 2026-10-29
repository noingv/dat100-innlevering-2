package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String s = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j > 0) {
					s += " ";
				}
				s += matrise[i][j];
			}
			s += "\n";
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] ny = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			ny[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				ny[i][j] = tall * matrise[i][j];
			}
		}
		return ny;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
