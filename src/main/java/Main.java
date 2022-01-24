public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 ,2 ,3, 4, 5");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statment testing for
        // a , b , c , d , or e
        // display a message if any of these are found and then break
        // add a default which displays a message saying not found


        char switchValueChar = 'D';
        switch (switchValueChar){
            case 'a':
                System.out.println("This Char value is an A");
                break;

            case 'b':
                System.out.println("This Char value is a B");
                break;

            case 'C': case 'D' : case 'E':
                System.out.println(switchValueChar + " was found");
                break;

            default:
                System.out.println("Could Not find A, B, C, D, E");
                break;

        }

        String month = "January";
        switch (month){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure ");
        }


    }
}
