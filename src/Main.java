import ex1.Employee;
import ex2.Address;
import ex2.ProfileData;
import ex2.User;
import ex2.priviliges.types.BlockUsersPrivilege;
import ex2.priviliges.types.WebUserPrivilege;


public class Main {

    public static void main(String[] args) {

        //Over Engineering... Example
        Employee mohamed = new Employee("12", "Mohamed");
        Employee ahmed = mohamed.clone();  //clone
        System.out.println(mohamed + " : " + ahmed);     //note the 2 instatnces are different NOW

        //.............Real Scenario World  .......................
        User samia = new User.Builder("AH-12")
                .setProfileData(new ProfileData("Ahmed", 12.2, new Address(1.2, 1.2), "", ""))
                .addPrivilege(new BlockUsersPrivilege())
                .addPrivilege(new WebUserPrivilege())
                .build();
        System.out.println(samia);

        User magda = samia.clone();
        System.out.println(magda);

        User loreen = magda.clone();
        System.out.println(magda);

        //User tasneem = new User().clone(); //todo id u use Secondary Constructor in kotlin , TOO in java u can make it easily

        //Summery  >Problems to be solved
        //todo Application "hard wires" the class of object to create in each "new" expression.
    }
}
