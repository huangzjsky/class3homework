public class Hzj{
    public static void main( String [] args){
        //定义一个数组
        int arr[] = {1,2,3,4,5,6,7,8};
        int a = 0,flag = 0;
        //打印原始数组的值
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
  
        // 添加代码删除上面数组中的5
        for (a=0 ; a<8 ; a++)
        {
            if (flag == 0) {
                if (arr[a] == 5) flag = 1;
            }
            else {
                arr[a-1]=arr[a];
            }
        }
        arr[7]=0;
  
        //打印出 1 2 3 4 6 7 8 0
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
 
        // 添加代码再在4后面5
        flag = 1;
        for (a=7 ; a>=0 ; a--)
        {
            if (flag == 1) {
                if (a == 4){
                arr[a]=5;
                flag = 0;
                }
                else arr[a]=arr[a-1];
            }
        }
  
        //打印出 1 2 3 4 5 6 7 8
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        }
}