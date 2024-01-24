package Lesson.L19_Exceptions;

public class Test1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try{
                t.drink("pivo");
                System.out.println("123456");
            }
            catch (NeVodaException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            } finally{
                System.out.println("Eto inner finally block");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class NeMyasoException extends RuntimeException{
    NeMyasoException(String myasoStr){
        super(myasoStr);
    }
}
class NeVodaException extends Exception{
    NeVodaException(String vodaStr){
        super(vodaStr);
    }
}
class Tiger{

    void eat(String eatStr){
        if (!eatStr.equals("myaso")) throw new NeMyasoException("Tigr ne est - "+eatStr);
        System.out.println("Tigr est "+eatStr);
    }

    void drink(String drinkStr) throws Exception{
        if (!drinkStr.equals("voda")) throw new NeVodaException("Tigr ne pyet - "+drinkStr);
        System.out.println("tigr pyet "+drinkStr);
    }
}