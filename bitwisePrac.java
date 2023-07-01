public class bitwisePrac{
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=0;i<=n;i++){
            if((n&i)==i){
                System.out.println("TRUE for: "+i);
                count++;
            }
        }
        System.out.println("Total possiblities for "+n+" are "+count);
    }
}