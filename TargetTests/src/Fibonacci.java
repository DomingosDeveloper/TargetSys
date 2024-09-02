import java.util.ArrayList;

public class Fibonacci {
    int toCheck;

    public Fibonacci(int toCheck, int toLimit) {
        this.toCheck = toCheck;
        this.toLimit = toLimit;
    }

    int toLimit;

    public void fibonacciCheck(){
        int limit = this.toLimit ;
        toCheck = this.toCheck;

        String msgPositiva = "Fibonacci possui o número: " + toCheck + "\n ----------------------";
        String msgNegativa = "Fibonacci não possui o número " + toCheck + "\n ----------------------";

        ArrayList<Integer> intArr = new ArrayList<>();
        int temp = 0;
        int temp2 = 1;
        intArr.add(temp);
        intArr.add(temp2);

        for (int i = 1; i < limit; i++){
           int temp3 = temp + temp2;
           intArr.add(temp3);
           temp = temp2;
           temp2 = temp3;
        }
            if (intArr.contains(toCheck)){
                System.out.println(intArr);
                System.out.println(msgPositiva);
            } else {
                System.out.println(intArr);
                System.out.println(msgNegativa);

            }

    }
}

