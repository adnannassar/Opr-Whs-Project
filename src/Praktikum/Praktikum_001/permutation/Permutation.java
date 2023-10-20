package Praktikum.Praktikum_001.permutation;

public class Permutation {
    int[] numbers;

    public Permutation(int n) {
        this.numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }



    public void gibAlsText() {
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + "-");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
    }

    public boolean naechstePermutation() {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]
                    || (i > 0) && numbers[i] - 1 != numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void reOrder() {
        int temp = this.numbers[1];
        this.numbers[1] = this.numbers[8];
        this.numbers[8] = temp;
    }

}
