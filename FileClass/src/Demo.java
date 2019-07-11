import java.io.*;
public class Demo {

	public static void main(String[] args) {
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//convert byte to character abd stored in buffer
			System.out.println("enter the file name :  ");
			String fname=br.readLine();
			File f=new File(fname);
			if(f.exists()) {
				BufferedReader fr=new BufferedReader(new FileReader(fname));
				String line=null;
				while((line=fr.readLine())!=null) {
					System.out.println(line);
				}
				
				//System.out.println(fr.readLine());
				
			}
			else {
				System.out.println("the file does not exist  ");
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
