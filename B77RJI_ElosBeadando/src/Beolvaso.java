import java.io.*;

public class Beolvaso {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		PrintWriter pw = new PrintWriter("b.txt");
		String line = br.readLine();
		while (line!=null) {
		String secret = "";
		for (int i=0;i<line.length();i++) 
			{
				char c = line.charAt(i);
				c++;
				secret = secret + c; 
			}
		pw.println(secret);
		line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}