public class Main {

    static void myMethod(String fname, int age){
        System.out.println("My name is " + fname + " and my age is " + age);
    }

    public static void checkAge(int age){
        if(age < 18){
            System.out.println("You are underage");
        }else{
            System.out.println("You are 18 or above");
        }
    }

    public static int addNumbers(int x, int y){
        return x + y;
    }

    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        }else{
            return 0;
        }
    }

    public static int add(int start, int end) {
        if(end > start){
            return start + add(start + 1, end);
        }else{
            return start;
        }
    }
    public static void main(String[] args){
        // This is a comment
        String name = "John";
        System.out.println("Hello " + name);
        System.out.println("Hello ".concat(name));
        System.out.println(3*10);

        System.out.println("the length of John is " + name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("J"));

        int a = 1;
        double b = 2.6;
        a = (int) b;
        System.out.println(a);

        System.out.println(Math.max(5, 10));
        System.out.println(Math.sqrt(64));
        double x = Math.pow(5, 10);
        System.out.println(x);

        for(x = 0; x<5; x++){
            System.out.println(Math.random() * 100);
        }


        for(int i = 0; i < 24; i++){
            if(i < 12){
                System.out.println("The time is " + i + ":00 good morning!");
            }else if (i >= 12 && i <19){
                System.out.println("The time is " + i + ":00 good afternoon!");
            }else {
                System.out.println("The time is " + i + ":00 good evening!");
            }
        }
        for(int day = 0; day<7; day++){
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }


        String[] cars = {"Volvo", "BMW", "Audi", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }


        for(int i = 0; i<10; i++){
            if(i == 8){
                break;
            }
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }

        int[] nums = {1,2,3,4,5,6};
        for(int i = 0; i<nums.length; i++ ){
            System.out.println(nums[i]);
        }

        myMethod("John", 19);

        checkAge(19);

       System.out.println(addNumbers(5, 8));

       System.out.println(sum(20));

       System.out.println(add(5, 10));

    }

}