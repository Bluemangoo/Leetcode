//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int initialEnergyIn = 5;
                int initialExperienceIn = 3;
                int[] energyIn = new int[]{1, 4, 3, 2};
                int[] experienceIn = new int[]{2, 6, 3, 1};
                System.out.println(new Solution().minNumberOfHours(initialEnergyIn, initialExperienceIn, energyIn, experienceIn));
                System.out.println("8  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int initialEnergyIn = 2;
                int initialExperienceIn = 4;
                int[] energyIn = new int[]{1};
                int[] experienceIn = new int[]{3};
                System.out.println(new Solution().minNumberOfHours(initialEnergyIn, initialExperienceIn, energyIn, experienceIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int initialEnergyIn = 1;
                int initialExperienceIn = 1;
                int[] energyIn = new int[]{1, 1, 1, 1};
                int[] experienceIn = new int[]{1, 1, 1, 50};
                System.out.println(new Solution().minNumberOfHours(initialEnergyIn, initialExperienceIn, energyIn, experienceIn));
                System.out.println("51  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
