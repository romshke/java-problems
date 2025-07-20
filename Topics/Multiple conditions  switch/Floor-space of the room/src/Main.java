import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String roomShape = scanner.nextLine();
        double a, b, c, r, area;
        
        switch(roomShape){
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double semiPerimeter = (a + b + c) / 2;
                area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
                
                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                
                System.out.println(area);
                break;
            case "circle":
                r = scanner.nextDouble();
                area = 3.14 * r * r;
                System.out.println(area);
                break;
        }
        
        scanner.close();
    }
}