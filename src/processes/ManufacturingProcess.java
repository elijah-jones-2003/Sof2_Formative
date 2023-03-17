package processes;

public class ManufacturingProcess
{
    public static int minCost(String[] pA, String[] pB)
    {
        if (pA.length == 0){
            return pB.length;
        }
        if (pB.length == 0){
            return pA.length;
        }
        return 0;
    }

    public static int minCost(String[] pA, String[] pB, int sub, int del, int ins)
    {
        return 0;
    }

}