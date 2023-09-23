package class12;

public class E2Methods {
    int add(int num1,int num2){//changed void to datatype
        int result=num1+num2;


//void methods dont let you store data.
        return result;//made a return written keyword. Specify name of variable.
        //without this there'd be an error in E2MethodsTester
        //like scanner how we take input and store it.
        //so basically if you call this class on another one you can store the result.
    }
//create a method which takes ANY number multiply it with 10
    //and returns the result

int multiply(int num){
        int res=num*10;
        return res;
}

}
