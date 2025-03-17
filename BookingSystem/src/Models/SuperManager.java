package Models;

/*
This method uses the singleton patten, to generate just one instance
of the SuperManager account type.
 */


public class SuperManager {

    private static final SuperManager SuperManager1 = new SuperManager();//Early Init instead of Lazy Init

   /*
    private constructor so noby outside class can access this.
     */

    private SuperManager(){

    }

    /*
    This method returns the single instance of the super manager class. Following with
    the singleton design pattern
     */
    public static SuperManager getInstance(){
        return SuperManager1;
    }

     /*
     This method return an account. Satisfying the 2nd UserReq, which informs the Supermanager
     can create multiple manager accounts.

     @Input String role
     @return ManagerAccountfactory.createAccount();
      */

    public Manager createManagerAccount(){
        return new Manager();
    }


}
