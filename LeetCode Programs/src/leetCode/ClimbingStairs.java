package leetCode;

public class ClimbingStairs {

	public static void main(String[] args) {
		
		int n = 2;
		
		int steps = climbStairs(n);
		System.out.println(steps);

	}

public static int climbStairs(int n) {
        
        int cs[] = new int[n];

        if(n==1) return 1;
        
        if(n==2) return 2;

        cs[0]=1;
        cs[1]=2;

        for(int i=2; i<n; i++){
            cs[i] = cs[i-1] + cs[i-2];
        }
        return cs[n-1];
    }
}
