import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextInt();
			int mx=Arrays.stream(a).max().getAsInt();
			int id1=0, id2=0;
			for(int i=0; i<n; ++i) {
				if(a[i]==mx)
					id1=i+1;
				else if(a[i]==1)
					id2=i+1;
			}
			out.println(Math.max(id1-1, Math.max(n-id1, Math.max(id2-1, n-id2))));
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
