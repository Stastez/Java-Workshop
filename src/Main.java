public class Main {
    public boolean isEqualForKDigits(double a, double b, int k){
        double delta = 1;
        delta = Math.pow(0.1, k-1) * delta;

        return Math.abs(a - b) < delta;
    }

    public void printRepeatingDigits(int k){
        for(int i = 1; i <= k; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i%10);
            }
            System.out.println();
        }
    }

    public boolean isPerfectNumber(int n){
        int acc = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                acc += i;
            }
        }

        return acc == n;
    }

    int min(int[] input){
        int minimum = Integer.MAX_VALUE;

        for(int i : input){
            if(i < minimum){
                minimum = i;
            }
        }

        return minimum;
    }

    public boolean isSymmetric(int[] input){
        for(int i = 0; i != (input.length - 1)-i && i < (input.length - 1)-i; i++){
            if(input[i] != input[(input.length - 1)-i]){
                return false;
            }
        }
        return true;
    }

    public int findSeriesWithLargestProduct(int[] input, int k){
        class Tupel{
            int produkt; int index;

            Tupel(int produkt, int index){
                this.produkt = produkt;
                this.index = index;
            }
        }

        Tupel max = new Tupel(0,-1);

        for(int i = 0; i < input.length - 1; i++){
            int produkt = 1;

            for(int j = 0; j < k; j++){
                if(j < input.length - 1){
                    produkt *= input[i + j];
                }
            }

            if(produkt > max.produkt){
                max.produkt = produkt;
                max.index = i;
            }
        }

        return max.index;
    }

    public boolean containsSameLetterAtDistance(String s, int k){
        for(int i = 0; i < (s.length() - 1) - (k - 1); i++){
            if(s.charAt(i) == s.charAt(i + (k-1))){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Main m = new Main();

        //System.out.println(m.isEqualForKDigits(3.10,3.2,2));

        //m.printRepeatingDigits(30);

        /*for(int i = 0; i < Integer.MAX_VALUE; i++){
            if(m.isPerfectNumber(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();*/

        //System.out.println(m.min(new int[]{5, -1, 3, -20}));

        //System.out.println(m.isSymmetric(new int[]{1,5, 5, 1,6,5,1}));

        //System.out.println(m.findSeriesWithLargestProduct(new int[]{2,10,3,100,2,100},2));

        //System.out.println(m.containsSameLetterAtDistance("453bobat", 3));
    }
}
