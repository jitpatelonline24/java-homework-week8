package java_week8_homework.programme_26_encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //Setting values of the variables

        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of the variables
        System.out.println("Prime' name: "+obj.getName());

        System.out.println("Prime's Age: "+obj.getAge());

        System.out.println("Prime's RollNo: "+obj.getRollNo());
    }
}
