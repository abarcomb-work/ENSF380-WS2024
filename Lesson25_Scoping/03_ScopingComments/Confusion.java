/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/


/*
/  Numbering has been added to println statements to add clarity.
*/
public class Confusion
{
    /* 1.
    /  Variable 'one' is set to 11 in the class
    */ 
    static int one = 11;  

    /* 2.
    /  Variable 'two' is set to 33 in the object
    */
    private int two = 33; 

    /* 3.
    /  The method variable 'one' is set to parameter that was provided.
    /  In the first execution, it is set to 5. In the second execution,
    /  it is set to 6. In the third execution, it is set to 5000.
    */ 
    public void methodOne(int one) 
    {
        /* 4.
        /  We access the variable 'one' which exists only within the
        /  scope of the method. We do this by not specifying the class
        /  or object scope. The value will be whatever we specify when
        /  we call the method: 5 the first time, 6 the second time, and
        /  5000 the third time.
        */
        System.out.println("4. one: " + one); 

        /* 5.
        /  The variable 'two' doesn't have a method scope. So when we
        /  call it without specifying a scope, we get the object scope,
        /  which is 33 in the first call. In the second call, it is 0
        /  because we set it later in the method (see comment 15), and
        /  in the second call we are accessing the same object as in the
        /  first call. However, in the third call, it is 33 again because 
        /  we are using the nextTest instance rather than the test instance.
        /  The value has not yet been changed in the nextTest object.
        */
        System.out.println("5. two: " + two); 

        /* 6.
        / We access the variable 'one' in the object scope. The first time
        / we do this, the value will be 11 because that is specified in the
        / class. The second and third time, the value will be 202. This is
        / because 'one' is a static variable, so when we change the value
        / (see comment 16), it is changed for all instances. It doesn't matter
        / that we created the nextTest object before we changed the value
        / in the test object. With a static variable, the object and class
        / scope are the same thing. 
        */
        System.out.println("6. this.one: " + this.one); 

        /* 7.
        /  We can illustrate that the class scope and object scope for
        /  a static variable are the same by accessing 'one' using the class
        /  scope. The value will be the same as described in comment 6.
        */
        System.out.println("7. Confusion.one: " + Confusion.one); 

        /* 8.
        /  We cannot access the class scope for 'two' because it is not
        /  a static variable. Uncommenting the next line will cause a
        /  compilation error.
        */
        // System.out.println("8. Confusion.two: " + Confusion.two); 

        /* 9.
        /  A new object is created. We have renamed it to 'testy' to avoid
        /  visual confusion with the 'test' object in main().
        */
        Confusion testy = new Confusion();

        /* 10.
        /  However, the 'test' object in main() doesn't exist in this
        /  scope, as can be demonstrated by uncommenting the next line.
        */
        // System.out.println("10. test.one: " + test.one); 

        /* 11.
        /  Here we set the variable 'two' to 4444. This changes the value
        /  of this object variable because there is no variable 'two' which
        /  exists only within the scope of this method. 
        */
        two = 4444; 

        /* 12.
        / We access the object scope of the testy object (33) because
        / we refer to the testy object by name. In comment 11 we did not
        / change the testy object, only the current object.
        */
        System.out.println("12. testy.two: " + testy.two); 
 
        /* 13.
        / We access the object scope of this object and get the value 4444
        / because we set it with comment 11.
        */
        System.out.println("13. this.two: " + this.two); 

        /* 14.
        / We are accessing the object variable because there is no
        / method variable 'two'.
        */
        System.out.println("14. two: " + two); 

        /* 15.
        / We set this object variable 'two' to 0. The difference between
        / this and comment 11 is that we are being more explicit about
        / which variable is being modified. We have added three println
        / statements to demonstrate that the effect is the same as in
        / comment 11.
        */
        this.two = 0;
        System.out.println("15. testy.two: " + testy.two); 
        System.out.println("15. this.two: " + this.two); 
        System.out.println("15. two: " + two); 

        /* 16.
        /  We set the varible 'one' to 202 in the object. Although we
        /  are explicitly stating that we are modifying the current object,
        /  not the newly created 'testy' object, because it is a static
        /  variable, we are actually changing it in the class scope.
        /  The next three println are added to show us that the value has 
        /  changed in both the current and 'testy' object, as well as in 
        /  the class.
        */
        this.one = 202; 
        System.out.println("16. this.one: " + this.one); 
        System.out.println("16. testy.one: " + testy.one); 
        System.out.println("16. Confusion.one: " + Confusion.one); 
    }
 
    public static void main(String args[])
    {
        Confusion test = new Confusion();
        Confusion nextTest = new Confusion();

        System.out.println("test.methodOne(5)"); 
        test.methodOne(5);

        System.out.println(""); 
        System.out.println("test.methodOne(6)"); 
        test.methodOne(6);

        System.out.println(""); 
        System.out.println("nextTest.methodOne(5000)"); 
        nextTest.methodOne(5000);

        System.out.println(""); 
        System.out.println("main()"); 
        /* 17.
        /  Because one is a static variable, we can access it with the 
        /  class name without needing an object. The value was set with
        /  earlier calls to methodOne (comment 16).
        */
        System.out.println("17. Confusion.one: " + Confusion.one);

        /* 18.
        /  Because main() is part of the Confusion class, we can access the
        /  class variable without even needing to specify the class. We are
        /  accessing the same static variable accessed in comment 17.
        */
        System.out.println("18. one: " + one);
    }
}

