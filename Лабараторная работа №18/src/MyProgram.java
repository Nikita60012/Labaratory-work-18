import java.util.Scanner;

public class MyProgram {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Введите числа x и y для примера 2*x+3/y");
       int x = in.nextInt();
       int y = in.nextInt();
       Calculate calculation = Calculate.getInstance();
       calculation.setNumbers(x,y);

       Calculate calculation2 = Calculate.getInstance();
       System.out.println("Результат примера равен " + calculation2.getResult());

       if(calculation.hashCode() == calculation.hashCode()){
           System.out.println("Это один и тот же объект класса");
       }else {
           System.out.println("Это разные объекты класса");
       }
   }
}
class Calculate{
    private static Calculate calculate = new Calculate();
    private int x;
    private int y;
    private Calculate(){
        this.x = 5;
        this.y = 6;
    }

    public int getResult(){
        return 2*x+3/y;
    }

    public static Calculate getInstance(){
        return calculate;
    }

    public void setNumbers(int x, int y){
        this.x = x;
        this.y = y;
    }
}