public class factorial{
    public static void main(String []args){
        int n=5;
        factorial(n);
    }
    public static void factorial(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            k*=i;
        }
        System.out.println(k);
    }
}