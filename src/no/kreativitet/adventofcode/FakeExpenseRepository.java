package no.kreativitet.adventofcode;

public class FakeExpenseRepository implements ExpenseRepository
{
    @Override
    public int[] getExpenses()
    {
	return new int[] { 1010, 1010 };
    }

}
