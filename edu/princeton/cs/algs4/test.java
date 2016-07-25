package edu.princeton.cs.algs4;

public class test {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 2000;
		VisualAccumulator a = new VisualAccumulator(T,1.0);
		for (int t=0;t<T;t++)
			a.addDataValue(StdRandom.random());
		StdOut.println(a);
	}
}
