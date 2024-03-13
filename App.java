public class App {
    public static void main(String[] args){
        
        String add;

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0)
                add = "*";
            else
                add = "";
            System.out.println(i+add);
        }
        
    }
}
