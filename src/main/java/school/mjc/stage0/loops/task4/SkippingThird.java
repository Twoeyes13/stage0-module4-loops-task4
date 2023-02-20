package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int third = 1;
        for (int i = 1; i <= lastPrinted; i++){
            if (third == 3){
                third = 1;
                continue;
            } else {
                third++;
            }
            System.out.println(i);

        }
    }
}
