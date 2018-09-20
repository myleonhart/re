//Sample: d259a88a42c7c0e0c85cde13b6f017fa0cfc56a511425f89aaeff84c32d745a0
//File: vn.clevernet.android.sdk.ClevernetView$5

import java.util.*;
import java.text.*;
final class clevernet {
  private clevernet() {
  }
  public static int[] k = {78, 94, -102, 44, -11, -7, 2, 14, -13, 4, 13, -12, 8, -11, -2, 15, -18, 0, -4, 8, -3, 14, -15, -12, 0, 4, 54, 11, 0, -52, -9, 7, -17, 17, -13, 4, 9, -15, 70, -72, 8, 63, -52, 2, -3, -15, 68, -72, 0, 0, 72, -50, -3, -9, 4, -5, 63, -62, 6, 2, -15, 51, -35, -15, 20, -23, 67, 5, -66, 8, -8};
  public static void main(String[] args){
    System.out.println("Hellow World");  
    System.out.println(k);
    // Also output http://clevernet.vn/cads/www/admin/mgetAds_v3.php
    System.out.println(a((71 & 1), (71 & 1) | 38, ((71 & 1) | 38) >>1));

  }
    private static String a(int p10, int p11, int p12) { 
        int v7 = (p11 + 10);
        byte[] v0_1 = new byte[v7];
        int v4 = (p12 + 4);
        int v5 = ((p10 * 5) + 99);
        int v1_1 = 0;
        while (true) { 
            int v3_1 = (v1_1 + 1);
            v0_1[v1_1] = ((byte)v5);
            if (v3_1 == v7) { 
                break;
            } else { 
                v5 -= k[v4];
                v4++;
                v1_1 = v3_1;
            }
        }

        return new String(v0_1);
    }
}
