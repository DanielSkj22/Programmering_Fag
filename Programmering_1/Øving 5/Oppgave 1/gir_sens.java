import java.util.Scanner;
public class gir_sens {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int output = scanner.nextInt();
    inputs brok1 = new inputs(1, 2);
    inputs brok2 = new inputs(2, 1);

    switch(output){
        case 1:
            System.out.println(brok1.getteller()+"/"+brok1.getnevner());
            System.out.println(brok2.getteller()+"/"+brok2.getnevner());
            brok1.add(brok2);
            System.out.println(brok1.getteller() + "/" + brok1.getnevner());
            break;
        case 2:
            System.out.println(brok1.getteller()+"/"+brok1.getnevner());
            System.out.println(brok2.getteller()+"/"+brok2.getnevner());
            brok1.sub(brok2);
            System.out.println(brok1.getteller() + "/" + brok1.getnevner());
            break;
        case 3:
            System.out.println(brok1.getteller()+"/"+brok1.getnevner());
            System.out.println(brok2.getteller()+"/"+brok2.getnevner());
            brok1.div(brok2);
            System.out.println(brok1.getteller() + "/" + brok1.getnevner());
            break;
        case 4:
            System.out.println(brok1.getteller()+"/"+brok1.getnevner());
            System.out.println(brok2.getteller()+"/"+brok2.getnevner());
            brok1.gang(brok2);
            System.out.println(brok1.getteller() + "/" + brok1.getnevner());
            break;
        default:
            System.out.println("");
            break;
    }
    scanner.close();
    }
    }

