import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = scanner.nextInt();
    
        for(int i = 0; i < N; i++){
            String order = scanner.next();
            if(order.equals("push_front")){
                list.add(0, scanner.nextInt());
            }else if(order.equals("push_back")){
                list.add(list.size(), scanner.nextInt());
            }else if(order.equals("pop_front")){
                if(list.isEmpty()){
                    bw.write("-1");
                }else{
                    bw.write(""+list.remove(0));
                }
                bw.write("\n");
            }else if(order.equals("pop_back")){
                if(list.isEmpty()){
                    bw.write("-1");
                }else{
                    bw.write(""+list.remove(list.size()-1));
                }
                bw.write("\n");
            }else if(order.equals("size")){
                bw.write(""+list.size());
                bw.write("\n");
            }else if(order.equals("empty")){
                bw.write((list.isEmpty())?"1":"0");
                bw.write("\n");
            }else if(order.equals("front")){
                if(list.isEmpty()){
                    bw.write("-1");
                }else{
                    bw.write(""+list.get(0));
                }
                bw.write("\n");
            }else if(order.equals("back")){
                if(list.isEmpty()){
                    bw.write("-1");
                }else{
                    bw.write(""+list.get(list.size()-1));
                }
                bw.write("\n");
            }
            
            
        }
        bw.flush();
        bw.close();
    }
}