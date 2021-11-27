public class App {
    public static void main(String[] args) throws Exception {
        //data 개별 이동
        int a = 10;
        int b = 20;
        int c = 30;
        
        sum(a,b,c);

        //data array로 이동
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        
        arraySum(arr);
    }

    public static void sum(int x, int y, int z){
        int sum = 0;
        sum = x + y + z;
        System.out.println(sum); //60
    }
    
    public static void arraySum(int[] temp){
        int sum = 0;
        for(int i=0; i<temp.length; i++) {
            sum+=temp[i];
        }
        System.out.println(sum); //60
    }
}
