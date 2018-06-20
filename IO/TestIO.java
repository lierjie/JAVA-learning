import java.io.*;  
public class TestIO {  
    public static void main(String args[]) {  
        try {  
            String pathname = "input.txt"; 
            File filename = new File(pathname);  
            InputStreamReader reader = new InputStreamReader(  
                new FileInputStream(filename)); 
            BufferedReader br = new BufferedReader(reader);  
            String line = "";  
            line = br.readLine();  
            while (line != null) {  
				System.out.println(line);
                line = br.readLine(); 
            }  
        } catch (Exception e){  
            e.printStackTrace();  
        }  
				
		String space = System.getProperty("line.separator");
		FileWriter output = null;
		try{
			output = new FileWriter("test.txt");
			output.write(Math.random() + "");
			output.write(space);
			output.write(Math.random() + "");
			output.write(space);
			output.close();
		}catch(Exception e){
			e.printStackTrace();
		}
    }  
}  