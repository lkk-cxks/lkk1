package github10;
import java.util.*;
import java.io.*;
//�ı��ļ�����
public class practice1 {
		public static void main(String[] args)
		{
			File inputFile=new File("/Users/lihaji/Desktop/in.txt");
			File outputFile=new File("/Users/lihaji/Desktop/out.txt");
			
			try
			{
				Scanner cin=new Scanner(inputFile);
				PrintWriter cout=new PrintWriter(outputFile);
				
				while(cin.hasNextLine())
				{
					String s=cin.nextLine();
					cout.println(s);
				}
				cout.close();
			}
			catch(Exception e)
			{
				System.out.println("File not found");
			}
		}
}
