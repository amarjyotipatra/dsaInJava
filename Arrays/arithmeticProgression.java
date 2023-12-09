import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=scanner.nextInt();
        }
      int visitCount []=new int[100001];
      int prevIndex []=new int[100001];
      int commonDiff []=new int[100001];
      for(int i=0;i<n;i++){
        if(visitCount[arr[i]]==-2){
          continue;
        }
        else{
          visitCount[arr[i]]++;
        }
        if(visitCount[arr[i]]==2){
          commonDiff[arr[i]] = i - prevIndex[arr[i]];
        }
        if (visitCount[arr[i]] > 2){
          if (i - prevIndex[arr[i]] != commonDiff[arr[i]]){
            visitCount[arr[i]] = -2;
            continue;
          }
        }
        prevIndex[arr[i]] = i;
      }
      //output
      int count=0;
      for(int i=0;i<visitCount.length;i++){
        if(visitCount[i]>0){
          count++;
        }
      }
      System.out.println(count);
      for(int i=0;i<visitCount.length;i++){
        if(visitCount[i]>0){
          System.out.println(i+" "+commonDiff[i]);
        }
      }     
      }
}