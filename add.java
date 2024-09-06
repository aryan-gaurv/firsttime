public class add {

    public static void main(String[] args) {
        int a[]={3,1,8,5,4,9,2};
        int n=9;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
        {
            if((a[i]+a[j])==n)
            System.out.println(i+","+j);
        }
        }
System.out.println("Hello");
    }
}
