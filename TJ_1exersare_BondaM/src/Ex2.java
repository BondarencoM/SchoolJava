/**
 *  Calculator 
 */

public class Ex2 {

    public static void main(String[] args) {
        Calculator basic = new Calculator();
        basic.operate("+", 3);
        basic.operate("-", 1);
        basic.operate("*", 15);
        basic.operate("/", 3);
        
        Calculator advanced = new Calculator();
        advanced.firstValue(10); //Assign 10 to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("cos", 0); //Assign cos(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("sin", 1); //Assign sin(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("tan", 0); //Assign tan(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("!", 5); //Assign the value of 5! to result (120)
        advanced.operate("C"); //Reset result to 0
        advanced.operate("e"); //Assign the value of "e" to result
        advanced.operate("+", 1.25);
        advanced.operate("+", "pi"); //Add the value of pi to result
        
        
        //Add at least 5 different operations and share your codeboard project .
        
    }
}
