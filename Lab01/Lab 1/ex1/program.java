public class program {
    public static void main(String[] args){
        double a, b, result;
        char c;

        if (args.length != 3) {
            System.out.println(" Invalid expression");
            return;
        }
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[2]);
            c = args[1].charAt(0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric operands.");
            return;
        }
        switch (c){
            case '+':
                result = a + b;
                System.out.println(a + "+" + b + "=" + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + "-" + b + "=" + result);
                break;
            case 'x':
                result = a * b;
                System.out.println(a + "x" + b + "=" + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = a / b;
                System.out.println(a + "/" + b + "=" + result);
                break;
            case '^':
                result = Math.pow(a, b);
                System.out.println(a + "^" + b + "=" + result);
                break;
            default:
                System.out.println("Unsupported operator");
        }

    }
}
