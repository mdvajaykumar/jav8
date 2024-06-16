package lambdaExpression;

 interface Calculate{
    public void divide();
}

interface Robot{
    public String talk( String name);
}

public class lambdaSyntax {

    public static void main(String[] args) {
        int a =10;
        int b =5;

        Calculate cal = new Calculate() {
            @Override
            public void divide() {
                System.out.println(a/b);
            }
        };

        cal.divide();

        // By Using lambdaExpression

        Calculate cal2 = () -> {
            System.out.println("the answer By using lambda Syntax" + a/b);
        };

        cal2.divide();

        // by passing Arguments

        Robot ra = (name) ->{
            return  "Hello Ajay Kumar " +name;
        };

        System.out.println(ra.talk("ajay"));



    }
}
