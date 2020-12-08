package no.kreativitet.adventofcode;

public abstract class Puzzle
{
    public Puzzle(String title)
    {
	this.title = title;
    }
    
    protected abstract void showSolution();
    
    public String getTitle()
    {
	return title;
    }
    
    private String title;
}
