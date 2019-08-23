import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;  

public class test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			 FileInputStream fin=new FileInputStream("/home/niit/Desktop/matin.txt"); 
			 ArrayList<String> a = new ArrayList<String>();
			 ArrayList<Integer> x = new ArrayList<Integer>();
			 int i = 0;
			 String s = new String();
			 while((i = fin.read())!=-1)
			 {
				 
				 if(i > 64 && i < 91 || i > 96 && i < 123 || i > 47 && i < 58 || (char)i == '\'' || (char)i == '-')
				 {
					 s = s + (char)i;
				 }
				 else
				 {
					 
					 if(a.contains(s) == false)
					 {
						 int c = 1;
						 a.add(s);
						 x.add(c);
					 }
					 else
					 {
						 int y = a.lastIndexOf(s);
						 x.set(y, x.get(y) + 1);
					 }
					 s = "";
				 }
				 
			 }
			 int v = 0;
			 while(v < x.size())
			 {
				 System.out.println("WORD : "+a.get(v)+"	freq: "+x.get(v));
				 v++;
			 }
			
	  
	         fin.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
	}
}
