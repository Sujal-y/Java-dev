package src;
class myclass {
    String name;
    int age, phone_number;

    public myclass(){
        this.name = "Default";
        this.age = 50;
        this.phone_number = 0;

    }
    public myclass(String name1){
        this.name = name1;
        this.age = 50;
        this.phone_number = 0;

    }
    public myclass(String name1 , int age1, int phone_number1){
        this.name = name1;
        this.age = age1;
        this.phone_number = phone_number1;
    }
    void display(){
        System.out.printf("name = %s \nage=%d \nphone number=%d \n",name,age, phone_number);
        System.out.println("------");
    }

}
public class lab_eval {

    static void find_details(String name,myclass[] obj){
        int found = 0;
        for (int i = 0; i < obj.length; i++) {
            if(obj[i].name == name){
                System.out.println("found the person!");
                obj[i].display();
                found =1;
            }
        }
        if(found==0){
            System.out.println("not found");
        }
    }

    public static void main(String[] args){
        myclass[] array_of_obj;
        array_of_obj = new myclass[10];//array of size 10

        for (int i = 0 ;i< array_of_obj.length;i++){//initializing the array of objects
            array_of_obj[i] = new myclass();
        }
        array_of_obj[0] = new myclass();
        array_of_obj[1] = new myclass("Bob");
        array_of_obj[2] = new myclass("Tejas",18,2010201020);
        array_of_obj[3] = new myclass("Srikar",19,1010102010);
        array_of_obj[4] = new myclass("Vaibhav",20,231247239);
        array_of_obj[5] = new myclass("Dishad",18,2010201020);
        array_of_obj[6] = new myclass("Kushagra",19,1010102010);


        find_details("Tejas",array_of_obj);
        find_details("Helli",array_of_obj);
    }

}
