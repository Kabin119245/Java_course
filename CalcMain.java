public class CalcMain {
    public static void main(String[] args) {
        Calc3 obj = new Calc3();
        int r1 = obj.add(8, 11);
        int r2 = obj.sub(10, 5);
        int r3 = obj.multi(10, 5);
        int r4 = obj.div(10, 5);
        double r5 = obj.power(2, 3);
        int r6 = obj.factorial(5);

        System.out.println(r1 + " "+ r2  +" "+ r3 + " " + r4 + " " + r5 + " " + r6);
    }
}
