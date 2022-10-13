public class Primes {
    public static void main(String[] args) {
        int i;
        for (i = 2; i <= 100; i++)// диапозон переменной i
        {
            if (isPrime(i)){
                System.out.print(i);
                System.out.print(';');
            }
        }
    }
    public static boolean isPrime(int n) //проверка
    {
        //if (n<2) return false;
        int i;
        for (i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false; //если остаток от деления =0, то число не подходит
            }
        }
        return true;
    }
}
