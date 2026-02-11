import java.util.Scanner;

class ThisDemo {
    int value;

    int value;
    void setValue(int value){
        this.value = value;
    }
    void display(){
        System.out.println("Value: "+value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
        Main d1 = new Main();
        int num = sc.nextInt();
        d1.setValue(num);
        d1.display();
    }
}
