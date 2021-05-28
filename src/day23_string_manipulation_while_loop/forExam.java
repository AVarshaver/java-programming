package day23_string_manipulation_while_loop;

public class forExam {
    public static void main(String[] args) {

int num = 2;
boolean b = true;

switch(num) {
    case 0:
        b = false;
    case 1:
        System.out.println(1);
    case 2:
        if(b) {
            System.out.println(2);
        }else{
            b=false;
        }
    case 3:
        if(b) {
            System.out.println(3);
            b=false;
        }else{
            break;
        }
    case 4:
        System.out.println(4);
    case 5:
        if(b) {
            break;
        }
        System.out.println(5);
}

int one = 5;
int two = 2;
if(one-- > two*2) {
    System.out.println("one");
}else{
    System.out.println(two);
}

double decimal = 13.142;
int whole = decimal < 20 ? 20 : 10;
        System.out.println(whole);


        byte b1 = 100;
        byte b2 = 15;
        int max = (b1 > b2) ? b1 +2 : b2 -4;
        System.out.println(max);
        }
    }

