package lista4;

import java.util.Random;

public class exec1 {
        static void vetorInt(){
            int [] vInt = new int[10];
            Random rd = new Random();
            for(int i = 0; i<vInt.length; i++){
                vInt[i]=rd.nextInt(15);
                System.out.printf("Posição %d = %d \n",i,vInt[i]);
            }
            //return vInt;
        }
        public static void main(String[] args) {
            
            
            vetorInt();
    }
}
