class q10 {
    public static void main(String[] args){
        Properties(5);                     
    }

     static void Properties(int number) {
        if (prime(number)){                      
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        if (Odd(number)) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is not an odd number");
        }
    }

    static boolean prime(int num) {
        if (num <= 1) {             
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean Odd(int num) {
         if(num%2!=0){            
			 
		 }
		 return true;
	}
}