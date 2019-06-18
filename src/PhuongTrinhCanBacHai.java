import java.util.Scanner;

public class PhuongTrinhCanBacHai {
    double a, b, c;

    public PhuongTrinhCanBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;

    }

    public double getC() {
        return this.c;
    }

    public double deta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double nghiemkep() {
        return -this.b / (this.a * 2);
    }

    public double nghiem1() {
        return -(this.b - Math.sqrt(deta())) / (this.a * 2);
    }

    public double nghiem2() {
        return -(this.b + Math.sqrt(deta())) / (this.a * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        System.out.println("Phuong trinh a*x2+b*x+c=0");
        do {
            System.out.print("a = ");
             a = scanner.nextDouble();
            System.out.print("b = ");
             b = scanner.nextDouble();
            System.out.print("c = ");
             c = scanner.nextDouble();
        } while (a == 0);
        PhuongTrinhCanBacHai phuongTrinhCanBacHai = new PhuongTrinhCanBacHai(a, b, c);
        if (phuongTrinhCanBacHai.deta() == 0) {
            System.out.println("Phuong trinh co nghiem kep = "+phuongTrinhCanBacHai.nghiemkep());
        }else if(phuongTrinhCanBacHai.deta() < 0)
        {
            System.out.println("Phuong trinh vo nghiem ");
        }else if(phuongTrinhCanBacHai.deta() > 0)
        {
            System.out.println("Phuong trinh co nghiem x1= "+phuongTrinhCanBacHai.nghiem1()+" x2= "+phuongTrinhCanBacHai.nghiem2());
        }
    }
}
