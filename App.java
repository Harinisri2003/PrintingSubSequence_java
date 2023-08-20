import java.util.*;
public class App {
    static void subSeq(int index,Stack<Integer> st,int a[],int n)
    {
        if(index==n)
        {
            System.out.print(st);
             System.out.println();
        return;
        }
        //do not take condition
        subSeq((index+1), st, a, n);  // 1
        // take condition
        st.push(a[index]);  //3  
        subSeq(index+1, st, a, n);
        st.pop();  //() 
        
    }
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int a[]={3,1,2};
       int n=3;
       Stack <Integer> st=new Stack<>();
       subSeq(0,st,a,n);
    }
}
