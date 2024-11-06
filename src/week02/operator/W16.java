package week02.operator;
public class W16 {
    // 2-9
    public static void main(String[] args) {
        // while 
        int number = 0;
        while (number < 3){ // number < 3인 동안
            number++;   
            System.out.println(number + "출력!");
        }

        // do ~ while 
        int number1 = 4;
        do{
            System.out.println(number1 + " 출력!");
        }while(number1 < 3);

        // break
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단
        int number2 = 0;
        while (number2 < 3){
            number2++;
            if(number2 ==2){
                break;
            }
            System.out.println(number2 + " 출력!");
        }

        for(int i = 0; i<10; i++){
            System.out.println("i: " + i);
            if(i==2){
                break;
            }
            for(int j =0; j<10; j++){
                System.out.println("j: " + j);
                if(j == 2){
                    break;
                }
            }
        }

        // continue
        int number3 = 0;
        while (number3 < 3){
            number3++;
            if(number3 ==2){
                continue;
            }
            System.out.println(number3 + " 출력!");
        }
    }
}
