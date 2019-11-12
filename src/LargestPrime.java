public class LargestPrime {

    public static int getLargestPrime(int number){

        if(number <= 0 || number ==1 ){
            return -1;
        }
        int i;
        int copyOfInput= number;


        for ( i =2; i<= copyOfInput; i++){
            if(copyOfInput % i == 0){
                System.out.println(i);
                copyOfInput = copyOfInput/i;
                System.out.println(copyOfInput);

                i--;
                System.out.println(i);

            }
        }
        return i;



    }
}
