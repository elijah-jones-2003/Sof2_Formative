package processes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQuestion2_i {

    @Test
	/**
	 * Test basic cases, to chekc for base case in the recursion.
	 */
	public void testBasicCases() {
		String[] pA = {"p1", "p2"};
        String[] pB = {};
        String[] pC = {"p1", "p2"};
        
        assertEquals(2, ManufacturingProcess.minCost(pA, pB), 0.000000001);
        assertEquals(2, ManufacturingProcess.minCost(pB, pC), 0.000000001);
        assertEquals(0, ManufacturingProcess.minCost(pA, pC), 0.000000001);
	}

    @Test
	/**
	 * Test general cases, having deletion, insertion, and substitution.
	 */
	public void testGeneralCases() {
		String[] pA = {"p1", "p2"};
        String[] pB = {"p1", "p5", "p2", "p6", "p3"};
        String[] pC = {"p1", "p4", "p4", "p7", "p3"};
        String[] pE = {"p1", "p4", "p2", "p6", "p3"};
        String[] pF = {"p1", "p2", "p6", "p3", "p4"};
        
        assertEquals(3, ManufacturingProcess.minCost(pA, pB), 0.000000001);
        assertEquals(3, ManufacturingProcess.minCost(pB, pC), 0.000000001);
        assertEquals(4, ManufacturingProcess.minCost(pA, pC), 0.000000001);
        assertEquals(1, ManufacturingProcess.minCost(pE, pB), 0.000000001);
        assertEquals(2, ManufacturingProcess.minCost(pE, pF), 0.000000001);
	}



}
