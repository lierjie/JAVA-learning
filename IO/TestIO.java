import java.io.*;
public class TEST{
	public static void main(String [] args){
		String space = System.getProperty("line.separator");
		FileWriter output = null;
		try{
			output = new FileWriter("aaa.txt",true);
			output.write(Math.random() + "");
			output.write(space);			
			output.write(Math.random() + "");
			output.write(space);
			output.close();
		} catch (Exception e){
			e.printStackTrace();
		}		



	try{
		BufferedReader bfreader = new BufferedReader(new InputStreamReader(new FileInputStream("aaa.txt")));
	    String num = bfreader.readLine();
	    while(num != null){
		    System.out.println(num);
			num = bfreader.readLine();
		}
	} catch (Exception e){
		e.printStackTrace();
	}

	
	}

	
}