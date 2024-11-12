package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // 메서드에 위험하다는 예외를 작성했기 떄문에 그냥 사용은 불가능하다
//        ourClass.thisMethodIsDangerous();

        // try-catch-finally 구문
        // try 내부를 실행하고, 예외가 발생하면 catch문에서 처리.
        // 정상적으로 실행되던, 예외가 발생하던 finally문 수행

        try{
            ourClass.thisMethodIsDangerous();
        }catch (OurBadException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("예외 핸들링");
        }
    }
}
