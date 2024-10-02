public class jump {
    public static void main(String[] args) {
        int i;
        for(i=1;i<11;i++){
            if (i==5){
                continue;
            }else if(i==8){
                break;
            }
            System.out.println(i);
        }
        
    }
}