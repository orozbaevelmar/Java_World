package Lesson.L19_Exceptions;

// 13.При написании кода, вы можете создавать свои собственные исключения. В зависимости от необходимости, создайте исключения, которые наследуются от
//    классов Exception или RuntimeException.
//

public class extendsException {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernulNoguException {
        if (tempBega>12){
            throw new PodvernulNoguException("Temp byl slishkom vysokim"+tempBega);
        }
        if (temperaturaVozduha>32){
            throw new SveloMyshsuException();
        }
        System.out.println("Vy probejali Mararfon");
    }

    public static void main(String[] args) {
        extendsException t=new extendsException();
        try{
            t.marafon(40, 0);
        }
        catch (PodvernulNoguException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("V lyubom sluchae vy poluchite gramotu!!!");
        }
    }
}

class PodvernulNoguException extends Exception{
    PodvernulNoguException(String message){
        super(message);
    }
    PodvernulNoguException(){
    }
}
class SveloMyshsuException extends RuntimeException{
    SveloMyshsuException(String message){
        super(message);
    }
    SveloMyshsuException(){
    }
}