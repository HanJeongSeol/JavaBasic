package week04.sample01;

// 예외 클래스 만들어서 예외 정의
public class OurBadException extends Exception{
    public OurBadException (){
        super("위험한 행동을 하면 예외처리를 해야함.");
    }
}
