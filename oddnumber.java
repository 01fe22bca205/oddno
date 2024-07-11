public class oddnumber{
    public static void main(String[] args) {
        int limit = 10;
        int sum = 0;
        for(int i = 1; i<=limit; i+=2)
        {
            sum+=1;
        }
        System.out.println("sum of odd num 1 to limit:"+sum);
    }
}