class q1
{
    public static void main(String[] args){
        printNumbers();                       
    }

     static void print(){
        for (int i = 1; i <= 7; i++){
            if (i == 3){                   
                System.out.println("I am 3");
            } else if (i == 5){
                System.out.println("I am 5");
            } else{
                System.out.println(i);
            }
        }
    }
}