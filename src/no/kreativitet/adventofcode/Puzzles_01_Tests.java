package no.kreativitet.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Puzzles_01_Tests
{
    @Test
    void test()
    {
	Puzzles_01 p = new Puzzles_01(new FakeExpenseRepository());
	int[] result = p.find2020SumOf2();
	assertEquals(result[0], 0);
	assertEquals(result[1], 1);
    }

}
