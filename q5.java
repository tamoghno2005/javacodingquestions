class q5{
    public static void main(String[] args){    
        sum();
    }

    static void sum(){          
        int sum = 0;
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}