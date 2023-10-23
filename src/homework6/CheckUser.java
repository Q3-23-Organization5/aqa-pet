package homework6;

public class CheckUser {
    public static void main(String[] args) {

        User User1 = new User();
        User1.setName("TestUser1");
        User1.setAge(20);
        User1.setEmail("testemail");
        User1.getIsActive();
        User1.setPassword("TestPassword1");

        System.out.println("Name: "+User1.getName()+ " Age: " + User1.getAge()+ " email: "+ User1.getEmail()+ " Status "+ User1.getIsActive());
        User1.makePurchase(20);
        User1.makePurchase(30);
        User1.printTotalAmountOfSpentMoney();


        User User2 = new User("TestUser2", "TestPassword2");
        User2.setName("TestUser2");
        User2.setPassword("TestPassword2");
        System.out.println("Name: "+User2.getName()+ " Age: " + User2.getAge()+ " email: "+ User2.getEmail()+ " Status "+ User2.getIsActive());
        User2.makePurchase(10);
        User2.makePurchase(150);
        User2.printTotalAmountOfSpentMoney();

        User User3 = new User();
    }
}
