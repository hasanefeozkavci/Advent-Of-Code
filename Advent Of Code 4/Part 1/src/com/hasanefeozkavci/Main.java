package com.hasanefeozkavci;

public class Main {

    public static void main(String[] args) {
	    int i, k, m, n, temp = 0, result = 0;
	    int[] digit = {0,0,0,0,0,0};
	    boolean test1 = true, test2 = false;
	    for ( i = 231832; i <= 767346; i++) {
			for (k = 0; k < 6; k++) {
				digit[k] = (int) Math.floor((i % Math.pow(10, k + 1)) / (Math.pow(10, k)));
			}

	        for(k = 0; k<5; k++){
	            if ( digit[k] >= digit[k+1])
	                test1 = false;

            }
	        for(m = 0; m < 6; m++){
	            for(n = 0; n < 6; n++){
	                if(digit[m] == digit[n])
	                    temp ++;
                }
            }
			//System.out.println("Temp is:"+temp);
	        if ( temp == 2) {
				test2 = true;
			}
            if ( test1&&test2) {
				result++;
			}
            test1 = false; test2 = false; temp = 0;
        }
			System.out.println("Result: " + result);
    }
}


