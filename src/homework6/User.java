package homework6;

public class User {
    private String userName;
    private int age;
    private String email;
    private boolean isActive;
    public double amountSpentMoney;
    private String password;

    // Setter
    public void setName(String newName) {
        this.userName = newName;
    }
    // Getter
    public String getName() {
        return userName;
    }
    public void setAge(int age){
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Person should be older than 18!");
        }
    }
    public int getAge() {
        return age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    public boolean getIsActive() {
        return isActive=true;
    }
    public void setPassword(String password){
        if (password.length()>8){
            this.password =password;
        } else {
            System.out.println("Minimum password length is 8 simbols");
        }
    }
    public String getPassword() {
        return password;
    }

    //сonstructors
    public User(){
    }
    public User(String userName){
    }
    public User(String userName, String password){
    }
    //виводить на яку суму була здійснена покупка
// та додає цю вартість до глобальної змінної amountSpentMoney
    public void makePurchase(double purchasePrice){
        System.out.println("The amount of this purchase is "+purchasePrice);
        amountSpentMoney=amountSpentMoney+purchasePrice;
    }
    public void printTotalAmountOfSpentMoney(){
        System.out.println("The total spent amount of money is "+amountSpentMoney);
    }
}