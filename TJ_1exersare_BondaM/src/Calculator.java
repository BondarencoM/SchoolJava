
public class Calculator {
    Number result;
    
    public Calculator() {
        this.result = 0;
    }
    
    public void operate (String operator, Number num1) {
        Number result = 0;
        
        switch (operator) {
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            } 
            
            case "cos": {
                result = Math.cos(num1.doubleValue());
                break;
            }
            
            case "sin": {
            	result = Math.sin(num1.doubleValue());
            	break;
            }
            
            case "tan": {
            	result = Math.tan(num1.doubleValue());
            	break;
            }
            case "!": {   
            	Number rez = 1;
                for (int i = 1; i <= num1.intValue(); i++) {
                	rez = rez.doubleValue() * i ;
                }
                result = rez;
                break;
            }
            
            default: {
                result = num1;
            }
            
        }
        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        this.result = result;
    }
    
    public void operate (String operator) {
        Number result=0;
        if (operator == "C") {
            result = 0;   
        }

        if (operator == "e"){
            result = Math.E;            
        }

        System.out.println(this.result.doubleValue() + " " + operator + "  = " + result.doubleValue());
        this.result = result;
    }
    
    public void operate (String operator, String num) {
    	if (num == "pi") {
    		operate(operator, Math.PI);
    	}
    	if (num == "e") {
    		operate(operator, Math.E);
    	}
    }
    
    public void firstValue(Number num1) {
        this.result = num1;
    }
    
}