import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatCuaMnag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập kích thước mảng bạn muốn khởi tạo:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*20);
        }
        System.out.println("Mảng sau khi được gàn giá trị tự động là:");
        System.out.println(Arrays.toString(arr));
        System.out.println("giá trị nhỏ nhất của mảng: " + minValue(arr));
    }
    public static int minValue(int []arr){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minValue>arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
