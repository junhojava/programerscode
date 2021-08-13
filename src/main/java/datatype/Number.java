package datatype;

public abstract class Number {

    public Number(){
    }
    
    abstract public double sum(double... numbers);

    abstract public double divide(double left, double right);

    public static boolean isPrimeNumber(int value){
        return isOverOne(value) && isNotHalf(value) && isChe(value);
    }

    public static boolean isOverOne(int number){
        return number > 1;
    }

    public static boolean isNotHalf(int number){
        return isTwo(number) || number % 2 == 1;
    }

    public static boolean isTwo(int number){
        return number == 2;
    }

    public static boolean isChe(int number){
        for(int index=3; index < Math.sqrt(number); index+=2){
            if(number % index == 0){
                return false;
            }
        }

        return true;
    }
}
