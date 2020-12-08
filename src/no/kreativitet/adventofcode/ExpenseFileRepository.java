package no.kreativitet.adventofcode;

import java.io.*;
import java.util.*;

public class ExpenseFileRepository implements ExpenseRepository
{
    public ExpenseFileRepository(String filename)
    {
	this.filename = filename;
    }
    
    public int[] getExpenses()
    {
	ArrayList<Integer> expenses = new ArrayList<>();
	File file = new File(filename);
	Scanner s = null;
	try
	{
	    s = new Scanner(file);
	    while (s.hasNextInt())
	    {
		expenses.add(s.nextInt());
	    }
	}
	catch (FileNotFoundException ex)
	{
	    System.out.println(ex.getMessage());
	}
	finally
	{
	    if (s != null)
	    {
		s.close();
	    }
	}
	return expenses.stream().mapToInt(i -> i).toArray();
    }
    
    private String filename;
}
