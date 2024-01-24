package Lesson.L15_Overriding_Hiding_Final;

// Почему Static методы нельзя сделать Override?
// Overriding () Polymorphism напрямую связаны с созданием объектов - в зависимости от типа объектов вызывается те или иные методы.
//      А само понятие Static не подразумевает под собой процесс создания объектов.

// Final метод-это метод который не может быть Overriden  или Hidden
// Final класс-это класс, который не может иметь потомков.

public class Static_Override {
    public static void main(String[] args) {
        House house=new Windows();
        house.showInfo();
        System.out.println();

        Windows windows=new Windows();
        windows.showInfoAboutHouse();
        windows.showInfoAboutWindows();
    }
}
class House{
    String showName(){
        return "some House";
    }
    void showInfo(){
        System.out.println("Name of house: " + showName());
    }



    static String showHouse(){
        return "Dvorets";
    }
    void showInfoAboutHouse(){
        System.out.println("Name of house: "+showHouse());
    }
}
class Windows extends House{
    String showName(){
        return "Plastik";
    }



    static String showHouse(){
        return "Okno";
    }
    void showInfoAboutWindows(){
        System.out.println("Name of windows: "+showHouse());
    }
}
