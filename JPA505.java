public class JPA505 {
    public static void main(String[] args) {
        JPA505 obj = new JPA505();

        int sumInt = obj.add(2, 3);
        System.out.println("Adding two integers: 2 , 3");

        double sumDouble = obj.add(5.2, 4.3);
        System.out.println("Adding two doubles: 5.2 , 4.3");

        String sumString = obj.add("I love ", "Java!!");
        System.out.println("Adding two strings: I love , Java!!");
        
        System.out.printf("%d %.6f %s",sumInt ,sumDouble ,sumString);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}