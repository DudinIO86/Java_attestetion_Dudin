/*
 * Создать класс Employee (сотрудник), у которого:
*1.1 Есть приватное поле String firstName (имя)
*1.2 Есть приватное поле String lastName (фамилия)
*1.3 Приватное поле int age (возраст)
*1.4 Приватное поле double salary (зарплата)
*2.1 Есть метод getAge, который возвращает возраст
*2.2 Есть метод getSalary, который возвращает зарплату
*2.3 Есть метод getFullName, который возвращает конкатенацию firstName и lastName
*2.4 Есть методы (сеттеры) для изменения всех полей (setAge, setSalary, setFirstName, setLastName)
*3.1 Есть конструктор, который принимает все 4 поля
*3.2 Есть конструктор, который принимает firstName, lastName и возраст (зарплата по умолчанию 1_000.0)
*3.3 Есть конструктор, который принимает firstName, lastName (зарплата по умолчанию 1_000.0, возраст по умолчанию 25)
*4. Реализовать метод toString, который выводит информацию о сотруднике в строковом представлении (формат придумать самостоятельно).
*5. Реализовать методы equals и hashCode, которые учитывают только firstName и lastName.
 */

public class Printer {
    public static void main(String[] args){
        Employee person=new Employee("Igor","Dudin");
        System.out.println(person.getAge());

    }
    
}
