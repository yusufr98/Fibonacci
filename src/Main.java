public class Main {
    public static int count = 0;
    public static void main(String[] args) {
        System.out.print("1, 1, ");
        fibonacci(1,1);
    }
    public static void fibonacci(int x, int y){
        count++;
        int next = x + y;
        System.out.print(next + ", ");
        if(count<=20) {
            fibonacci(y, next);
        }
    }
}
