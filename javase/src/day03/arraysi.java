package day03;

/**
 * Author wangyi
 * Create 2020-09-16 22:43
 * ClassName arraysi
 * Version 1.0
 */
public class arraysi {
    public static void main(String[] args) {
//        int kitchen_ware[];
//        kitchen_ware = new int[7];
//        kitchen_ware[0] = 1;
//        kitchen_ware[1] = 2;
//        kitchen_ware[2] = 3;
//        kitchen_ware[3] = 5;
//        kitchen_ware[5] = 5;
//        kitchen_ware[5] = 6;
//        kitchen_ware[6] = 7;
//        double kitchen_ware[] = {1, 2, 3, 5, 5, 56, 7, 5, 7.8,};
//        double result = 0;
//        int i;
//        for (i = 0; i < 9; i++) {
//            result = result + kitchen_ware[i];
//            System.out.println("Average is " + result / 9);
//        }
//        int i0 = 1;
//        int k0 = 1;
//        System.out.println(i0++);
//        System.out.println(++k0);
//        if (i0++== 2 & ++k0== 2) {
//            i0 = 7;
//        }
//        if (i0++ == 2 && ++k0 == 2) {
//            i0 = 7;
//        }
//        System.out.println("i0=" + i0 + ",k0=" + k0);

        //???????
//        int twod[][] = new int[5][6];
//        int i, j, k = 0;
//        for (i = 0; i < 5; i++)
//            for (j = 0; j < 6; j++) {
//                twod[i][j] = k;
//                k++;
//
//            }
//        for (i = 0; i < 5; i++) {
//            for (j = 0; j < 6; j++)
//                System.out.print(twod[i][j] + " ");
//            System.out.println();
//
//        }


        //二维数组
        int[][] arr = new int[][]{
                {3, 59, 4944, 4},
                {2, 4},
                {8, 56, 9, 7}
        };

        int len = arr.length;//一维数组长度
        int res = 0;
        //?????
//        for (int g = 0; g < arr.length; g++) {
//            int[] arr0 = arr[g];
//            int lien = arr0.length; //??????鳤??
//            for (int h = 0; h < lien; h++) {
//                res += arr0[h];
//            }
//        }

        //求数组的个数、平均值、和
        int sc = 0;
        int n = 0;
        float avg = 0;
        for (int v = 0; v < arr.length; v++) {
            for (int b = 0; b < arr[v].length; b++) {
                res += arr[v][b];
                n++;
            }
        }
        avg = res / n;
        System.out.println("数组的个数:" + n);
        System.out.println("数组的和" + res);
        System.out.println("数组的平均值:" + avg);

        //求数据最大值最小值
        int max = arr[0][0];
        int min = arr[0][0];
        for (int z = 0; z < arr.length; z++) {
            for (int x = 0; x < arr[z].length; x++) {
                if (max < arr[z][x]) {
                    max = arr[z][x];
                }
                if (min > arr[z][x]) {
                    min = arr[z][x];
                }
            }
        }
        System.out.println("最大值是:" + max);
        System.out.println("最小值是:" + min);


        //数组复制
        int copy[][] = new int[arr.length][];
        for (int t = 0; t < arr.length; t++) {
            copy[t] = arr[t].clone();
        }

        //冒泡排序
        int ln[] = new int[]{1, 484, 83, 44, 4, 9,};
        int temp = 0;
        for (int s = 0; s < ln.length - 1; s++) {
            for (int f = 0; f < ln.length - 1 - s; f++) {
                if (ln[f] < ln[f + 1]) {
                    temp = ln[f];
                    ln[f] = ln[f + 1];
                    ln[f + 1] = temp;
                }
            }
        }
        for (int s = 0; s < ln.length; s++) {
            System.out.println(ln[s]);
        }

    }
}
