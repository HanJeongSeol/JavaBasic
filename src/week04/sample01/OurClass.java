package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // throws : 던지다(=예외를 던지다)
    public void thisMethodIsDangerous() throws OurBadException {    // 커스텀 Exception을 예외로 던진다
        // 위험한 로직이 포함되어있다고 가정

        if(just){
            // 위험한 로직에서 예외가 발생하면 OurBadException을 던진다.
            throw new OurBadException();
        }
    }
}
