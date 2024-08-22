import java.util.*;

public class DigitalWalletManagementSystem {
    public static void sortedBalance(Map<Integer,Integer>map){
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<Integer,Integer>newMap=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer>entry:list){
            newMap.put(entry.getKey(),entry.getValue());
            }
        for(Map.Entry<Integer,Integer>entry:newMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            }
        
    }
    public static void SuccessOrFailure(Map<Integer,Integer>map,int[] array1,int[] array2,int[] amount) {
        int n=array1.length;
        for(int i=0;i<n;i++){
            Integer value1=map.get(array1[i]);
            Integer value2=map.get(array2[i]);
            if(value1!=null&&value2!=null&&value1>amount[i]){
                
                map.put(array2[i],value2+amount[i]);
                map.put(array1[i],value1-amount[i]);
                System.out.println("Success");
            }
            else{
                System.out.println("Failure");
            }
        }
         System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n1;i++){
            int key=sc.nextInt();
            int value=sc.nextInt();
            map.put(key,value);
        }
        int n2=sc.nextInt();
        int[] array1=new int[n2];
        int[] array2=new int[n2];
        int[] amount=new int[n2];
         for(int i=0;i<n2;i++){
             array1[i]=sc.nextInt();
              array2[i]=sc.nextInt();
              amount[i]=sc.nextInt();
         }
        SuccessOrFailure(map,array1,array2,amount);
        sortedBalance(map);
       
        sc.close();
    }
}