package java10demo;

import java.util.function.Consumer;

public class InvalidVarExample {

    //1. Can not use as class level variable or instance variable
    //var id = 0;

    //2. Can not use as constructor args

   // public InvalidVarExample(var id){}

   //3. Not allowed as method return type
    //public var getId(){}

    //4. Not allowed in method param
    //public int getId(var id){}

    //5. Not allowed in catch parenthesis

    //6. Can not assign null value to var
    //  var a = null;

    //7. can not use var for lamda like below
    Consumer<Integer> l = (i) -> System.out.println(i); // this is fine

  //  var lam = (j) -> System.out.println(j);

  //  var a;
   // var nothing = null;
   // var lambda = () -> System.out.println("Pity!");
   // var method = this::someMethod;

}
