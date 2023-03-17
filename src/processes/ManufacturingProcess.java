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
        String [] newA = new String[(pA.length-1)]; 
        String [] newB = new String[(pB.length-1)];
        System.arraycopy(pA, 0, newA, 0, pA.length-1);
        System.arraycopy(pB, 0, newB, 0, pB.length-1);
        if (pA[pA.length-1].equals(pB[pB.length-1])){
            return minCost(newA, newB);
        }
        else{
            int min = Integer.MAX_VALUE;
            min = Math.min(min, minCost(newA, pB));
            min = Math.min(min, minCost(pA, newB));
            min = Math.min(min, minCost(newA, newB));
            return min + 1;
        }
    }

    public static int minCost(String[] pA, String[] pB, int sub, int del, int ins)
    {
        if (pA.length == 0){
            return pB.length * ins;
        }
        if (pB.length == 0){
            return pA.length * del;
        }
        String [] newA = new String[(pA.length-1)]; 
        String [] newB = new String[(pB.length-1)];
        System.arraycopy(pA, 0, newA, 0, pA.length-1);
        System.arraycopy(pB, 0, newB, 0, pB.length-1);
        if (pA[pA.length-1].equals(pB[pB.length-1])){
            return minCost(newA, newB, sub, del, ins);
        }
        else{
            int min = Integer.MAX_VALUE;
            min = Math.min(min, (minCost(newA, pB, sub, del, ins) * ins));
            min = Math.min(min, (minCost(pA, newB, sub, del, ins) * del));
            min = Math.min(min, (minCost(newA, newB, sub, del, ins)* sub));
            return min + 1;
        }
    }

    public static void main(String[] args) {
        String[] pA = {"p2"};
        String[] pB = {"p1"};
        System.out.println(minCost(pA, pB, 5, 3, 1));
    }
}
