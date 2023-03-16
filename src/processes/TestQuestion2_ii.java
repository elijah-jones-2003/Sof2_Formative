package processes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQuestion2_ii {

    @Test
	/**
	 * Test basic cases, to chekc for base case in the recursion.
	 */
	public void testBasicCases() {
		String[] pA = {"p1", "p2"};
        String[] pB = {};
        String[] pC = {"p1", "p2"};
        
        assertEquals(4, ManufacturingProcess.minCost(pA, pB, 1, 2, 4), 0.000000001);
        assertEquals(8, ManufacturingProcess.minCost(pB, pC, 1, 2, 4), 0.000000001);
        assertEquals(0, ManufacturingProcess.minCost(pA, pC, 1, 2, 4), 0.000000001);
	}

    @Test
	/**
	 * Test general cases, having deletion, insertion, and substitution.
	 */
	public void testGeneralCases() {
		String[] pA = {"p1", "p2", "p7", "p7", "p3"};
        String[] pB = {"p1", "p5", "p2", "p6", "p3"};
        String[] pC = {"p1", "p2", "p6", "p3", "p4"};
        
        assertEquals(3, ManufacturingProcess.minCost(pA, pB, 1, 1, 1), 0.000000001);  // 1 insertion, 1 deletion, 1 substitution
        assertEquals(10, ManufacturingProcess.minCost(pA, pB, 10, 3, 2), 0.000000001); // 1 insertion, 2 deletions, 1 insertion
        assertEquals(3, ManufacturingProcess.minCost(pA, pB, 1, 10, 2), 0.000000001); // 3 substitutions
        assertEquals(5, ManufacturingProcess.minCost(pB, pC, 4, 3, 2), 0.000000001);  // 1 deletion, 1 insertion
        assertEquals(8, ManufacturingProcess.minCost(pB, pC, 2, 10, 1), 0.000000001); // 4 substitutions
	}



}
