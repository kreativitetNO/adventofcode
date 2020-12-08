package no.kreativitet.adventofcode;

public class Puzzles_01 extends Puzzle
{
    public Puzzles_01(ExpenseRepository expenseRepository)
    {
	super("Puzzle 1 - 2020 Sums");
	expenses = expenseRepository.getExpenses();
    }

    public int[] find2020SumOf2()
    {
	for (int i = 0; i < expenses.length - 1; i++)
	{
	    for (int j = i + 1; j < expenses.length; j++)
	    {
		if (expenses[i] + expenses[j] == 2020)
		    return new int[] { i, j };
	    }
	}
	return null;
    }
    
    public int[] find2020SumOf3()
    {
	for (int i = 0; i < expenses.length - 2; i++)
	{
	    for (int j = i + 1; j < expenses.length - 1; j++)
	    {
		for (int k = j + 1; k < expenses.length; k++)
		{
		    if (expenses[i] + expenses[j] + expenses[k] == 2020)
			return new int[] { i, j, k };
		}
	    }
	}
	return null;
    }
    
    public void showSolution()
    {
	int[] result = find2020SumOf2();
	if (result != null)
	{
	    System.out.println("Product: " + (expenses[result[0]] * expenses[result[1]]));
	}
	else
	{
	    System.out.println("No expenses have the sum 2020 :(");
	}
	result = find2020SumOf3();
	if (result != null)
	{
	    System.out.println("Product: " + (expenses[result[0]] * expenses[result[1]] * expenses[result[2]]));
	}
	else
	{
	    System.out.println("No expenses have the sum 2020 :(");
	}
    }
    
    private int[] expenses;
}
