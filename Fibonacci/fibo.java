public class fibo {
    public static long contador = 0;
    public static void main(String[] args){
        long n = 10;
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(long n){
        if(n <= 1) return n;
        else{
            System.out.println("Contador: "+ contador++);
            return (fibonacci(n-1) + fibonacci(n-2));
        } 
    }
}
