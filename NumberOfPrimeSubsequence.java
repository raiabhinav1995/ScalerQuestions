public class NumberOfPrimeSubsequence {
    public static int numberOfPrimes(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        boolean[] primes = primesArray(max);
        int countOfPrimes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (primes[arr[i]] == true)
                countOfPrimes++;
        }
        return (1 << countOfPrimes) - 1;
    }

    public static boolean[] primesArray(int a) {
        boolean[] arr = new boolean[a + 1];
        arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < a + 1; i++) {
            for (int j = i + i; j <= i * i; j += i) {
                if (j < arr.length && j > 0)
                    arr[j] = false;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(NumberOfPrimeSubsequence.numberOfPrimes(new int[]{289406, 75304, 153757, 326498, 916448, 156289, 264957, 461842, 654287, 761064, 65917, 924307, 934231, 958058, 121314, 380247, 393276, 772718, 333433, 807558, 965301, 587448, 222792, 656597, 63208, 317479, 996302, 413766, 396941, 708186, 80298, 536847, 727410, 311461, 131005, 919925, 132087, 145102, 993684, 318524, 718983, 366760, 762319, 511941, 793685, 679356, 158973, 966963, 626659, 285767, 927393, 96819, 714111, 92978, 450238, 264053, 360936, 415533, 77276, 267172, 794054, 121365, 839790, 70536, 315614, 522994, 553066, 297774, 952134, 933462, 787837, 162485, 650962, 557880, 415378, 370409, 443531, 347671, 319649, 796415, 700733, 319101, 903163, 705737, 771050, 249663, 681104, 325478, 375017, 544661, 49595, 123426, 622426, 902187, 68552, 677265, 545005, 87886, 211002, 217966, 215145, 197548, 162469, 161259, 987226, 594382, 858046, 140571, 280762, 612684, 947602, 810637, 84427, 564201, 106853, 480731, 644736, 764398, 200436, 321291, 598520, 696549, 486278, 415666, 238743, 40886, 894172, 678732, 863061, 373517, 73283, 803675, 745347, 918011, 212375, 772128, 983350, 464929, 842072, 78407, 764324, 133041, 558867, 677212, 938428, 507228, 449399, 296375, 895193, 281969, 323495, 521462, 778948, 255298, 520497, 115779, 435933, 619897, 160983, 730952, 98538, 933143, 474120, 753180, 497750, 573844, 473440, 212177, 582963, 974898, 565265, 790902, 484908, 508815, 29163, 266927, 483559, 271842, 392239, 2528, 922023, 225687, 343351, 769869, 72974, 981362, 292839, 807919, 818873, 73780, 82890, 778288, 641776, 492205, 618401, 981226, 510262, 897889, 457498, 470657, 138862, 963957, 650066, 420749, 132666, 300794, 918834, 239887, 584485, 556276, 752189, 851527, 149582, 906586, 304373}));
    }
}