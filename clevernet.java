//0b9862065bec692c3a36f651f0f5d031aa3228a27252aeb2f0f9efb850d3c9a5
//vn.clevernet.android.sdk.ClevernetView$5 


import java.util.*;
import java.text.*;

public class clevernet2 {
    public static int[] k = {124, -128, 45, -58, -11, -7, 2, 14, -13, 4, 13, -12, 8, -11, -2, 15, -18, 0, -4, 8, -3, 14, -15, -12, 0, 4, 54, 11, 0, -52, -9, 7, -17, 17, -13, 4, 9, -15, 70, -72, 8, 63, -52, 2, -3, -15, 68, -72, 0, 0, 72, -50, -3, -9, 4, -5, 63, -62, 6, 2, -15, 51, -35, -15, 20, -23, 67, 5, -66, 8, -8};
    
    public static void main(String[] args){
        // Where data (phone number) is sent to
        System.out.println(a(39,1,k[17]));
        // Output: http://clevernet.vn/cads/www/admin/mgetAds_v3.php
        System.out.println("Hello World");
    }
    
    private static String a(int p9, int p10, int p11) { 
        int v4_0 = (p9 + 10);
        byte[] v0_1 = new byte[v4_0];
        int v8 = (v4_0 - 1);
        int v4_1 = (22 - p11);
        int v5 = ((p10 * 5) + 99);
        int v1_1 = 0;
        while (true) { 
            v0_1[v1_1] = ((byte)v5);
            if (v1_1 == v8) { 
                break;
            } else { 
                int v1_2 = (v4_1 + 1);
                v5 -= k[v1_2];
                v4_1 = v1_2;
                v1_1++;
            }
        }

        return new String(v0_1);
    }
}
