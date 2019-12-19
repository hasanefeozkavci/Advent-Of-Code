package com.hasanefeozkavci;

public class Main {

    public static void main(String[] args) {
	    int i, k, m, n, temp = 0, result = 0;
	    int[] digit = {0,0,0,0,0,0};
	    boolean test1 = true, test2 = false;
	    for ( i = 231832; i <= 767346; i++) {
	    	test1 = true;test2 = false;
			for (k = 0; k < 6; k++) {
				digit[k] = (int) Math.floor((i % Math.pow(10, k + 1)) / (Math.pow(10, k)));
			}

	        for(k = 0; k<5; k++){
	            if ( digit[k] > digit[k+1])
	                test1 = false;

            }
	        for(m = 0; m < 5; m++){
	           	if(digit[m] == digit[m+1])
	           		temp++;
	           	//System.out.println("temp: "+temp);
            }
	        if( temp > 0)
	        	test2 = true;
	        temp = 0;
			//System.out.println("Temp is:"+temp);
			System.out.println("test1: "+test1+" test2: "+test2);
            if ( test1&&test2) {
				result++;
			}
            test1 = false; test2 = false;
        }
			System.out.println("Result: " + result);
    }
}


