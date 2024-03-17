import java.util.Scanner;

public class bj_9996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int index = str.indexOf('*');
        String pre = str.substring(0, index);
        String suf = str.substring(index+1);
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(pre.length()+suf.length() > s.length()){
                System.out.println("NE");
                continue;
            }
            if(pre.equals(s.substring(0, pre.length()))){
                if(suf.equals(s.substring(s.length()-suf.length()))){
                    System.out.println("DA");
                }
                else{
                    System.out.println("NE");
                }
            }
            else{
                System.out.println("NE");
            }
        }
    }
}
