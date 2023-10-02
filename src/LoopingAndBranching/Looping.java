package LoopingAndBranching;

public class Looping {

    public static void main(String[] args) {

        int totalSugarInGlass = 0;
        int sugar = 2;
        int maxSugar = 10;

//        while (totalSugarInGlass < maxSugar) {
//            totalSugarInGlass += sugar;
//            System.out.println("Sugar in glass: " + totalSugarInGlass);
//        }
//        System.out.println("Glass is full");
//    }

//    do {
//        totalSugarInGlass += sugar;
//        System.out.println("Sugar in glass: " + totalSugarInGlass);
//    } while (totalSugarInGlass < maxSugar);
//    System.out.println("Glass is full");
//    }

        for (; totalSugarInGlass <= maxSugar; totalSugarInGlass += sugar) {
            System.out.println(totalSugarInGlass);
        }

    }
}
