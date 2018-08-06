public class Fibo{
    public static void main(String[] args){
        //0-1-1-2-3-5-8-13-21-34-55
        int f1=0;
        int f2=1;	
        int intermediaria=0;
        for(int i=0;i<11;i++){
            if(i==0){
                System.out.println(0);        
            }else if(i==1){
                System.out.println(1);
            }else{
                System.out.println(f1+f2);
                intermediaria=f2;
                f2=f1+f2; 
                f1=intermediaria;
            }   
        }
    }
}