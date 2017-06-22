package salary;

import java.io.*;
class Salary
{
	int sal[] = new int[50];
	String nam[] = new String[50];
	
	void getinp()throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("give names of the people");
		for(int i = 0 ; i<sal.length ; i++)
		{
			System.out.print(i+1);
			String x = br.readLine();
			nam[i] = x;
		}
		System.out.println("give salaries of the people");
		for(int t = 0 ; t<sal.length ; t++)
		{
			System.out.print(t+1);
			String x = br.readLine();
			int y = Integer.parseInt(x);
			sal[t] = y;
		}
	}
	void sort()throws Exception
	{
		int swap = 0;
		String swapi = "";
		for(int u = 0 ; u < nam.length ; u++)
		{
	
			for(int o = 0 ; o<sal.length-1 ; o++)
			{
	
				if (sal[o] < sal[o+1])
				{
					swap = sal[o];
					sal[o] = sal[o+1];
					sal[o+1] = swap;

					swapi = nam[o];	
					nam[o] = nam[o+1];
					nam[o+1] = swapi;
		
	
				}
			}
		}
		for(int l = 0 ; l<sal.length ; l++)
		{
			System.out.println(nam[l]+"	= 	"+sal[l]);
		}
	}
	public static void main(String[]args)throws Exception
	{
		Salary o1 = new Salary();
		o1.getinp();
		o1.sort();
	}
}
	
			
