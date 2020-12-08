package no.kreativitet.adventofcode;

import java.util.ArrayList;

public class Program
{    
    public static void main(String[] args)
    {
	ArrayList<Puzzle> puzzles = new ArrayList<>();
	puzzles.add(new Puzzles_01(
		new ExpenseFileRepository("/home/christian/eclipse-workspace/no.kreativitet.adventofcode/expenses.txt")
		));
	for (Puzzle puzzle : puzzles)
	{
	    System.out.println(puzzle.getTitle());
	    System.out.println(Utilities.createUnderline(puzzle.getTitle()));
	    puzzle.showSolution();
	    System.out.println();
	}
    }
}
