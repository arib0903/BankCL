public class Account {

    private int accNum;
    private double accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(int accNum, double accBalance, String customerName, String customerEmail, String customerPhone){
        this.accNum = accNum;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }



    public void deposit(int x){
        this.accBalance += x;
        System.out.println("----DEPOSIT AMOUNT: " + x + "----" + "     Hi "+ customerName + " your bank balance is now $" + accBalance );

    }

    public void withdraw(int x){
        if(this.accBalance -x < 0){
            System.out.println("You May Not Withdraw $" + x + ", Bank account will be below 0");
            return;
        }
        this.accBalance -= x;
        System.out.println("----WITHDRAW AMOUNT: " + x + "----" + "     Hi "+ customerName + " your bank balance is now $" + accBalance );

    }


}
