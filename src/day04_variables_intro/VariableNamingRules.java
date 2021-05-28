package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){

        // int static = 22: -> error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;
        // int  salary$ = 55;
        // int 1stMonthSalary = 3000; -> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended
        /// we should use meaningful variable names

        int banana;
        banana=10;
        System.out.println(banana);

        System.out.println($+_);
        System.out.println($+" "+_);


    }
}
