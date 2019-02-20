package extra;

import java.util.Random;

public class Vault {
	int code = 	new Random().nextInt(54687983);
		boolean trycode(int guess){
			if(guess==code) {
				return true;
			}
			else  {
				return false;
			}
	}	
}
























