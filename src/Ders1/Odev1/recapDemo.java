package Ders1.Odev1;

public class recapDemo {
    public static void main(String[] args) {
        double[] mylist = {1.3, 14.3, 12.1, 76.3};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println("Topalm:" + total);
        System.out.println("En Büyük:" + max);
    }
}
