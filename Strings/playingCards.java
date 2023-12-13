public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0){
        String table=sc.nextLine();
        String player=sc.nextLine();
        // System.out.println(player);
        int flag=0;
        for(int i=0;i<player.length();i++){
          if(player.charAt(i)==table.charAt(0))
            flag++;
          if(player.charAt(i)==table.charAt(1))
            flag++;
        }
        if(flag>0){
          System.out.println("YES");
        }else
        System.out.println("NO");
      }
    }
  }