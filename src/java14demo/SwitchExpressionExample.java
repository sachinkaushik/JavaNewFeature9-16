package java14demo;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println("With Switch Expression :: "+getDayNameBySwitchExpression(0));
    }

    public static String getDayNameBySwitchExpression(int day){
        String nameOfDay = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> throw new IllegalArgumentException("Invalid day "+day);
        };
        return nameOfDay;
    }

    public static String getDayNameBySwitchExpression1(int day){
        String nameOfDay = switch (day){
            case 0 -> {
                System.out.println("can write any logic here");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> throw new IllegalArgumentException("Invalid day "+day);
        };
        return nameOfDay;
    }


    /*
    before java 14, we used to write
     */
    public static String getDayName(int day){
        String nameOfDay = "";
        switch (day){
            case 0 : nameOfDay = "Sunday"; break;
            case 1 : nameOfDay = "Monday"; break;
            case 2 : nameOfDay = "Tuesday"; break;
            default : throw new IllegalArgumentException("Invalid day "+day);
        }
        return nameOfDay;
    }


}
