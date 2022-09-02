import java.util.*; // For taking the input we have imported this
//Defining class
class Account{
	int balance = 1000;
	//Defining method
	void getBalance() {System.out.print("Your account balance is:" +balance);}
	//Defining method
	void depositeAmount(int x) {
		balance= balance+x;
		System.out.println("Congrats! you have deposite:" +balance);}
	//Defining method
	void WithdrawAmount(int y) {
		balance= balance-y;
		System.out.println("Congrats! you have successfully withdraw:" +y+ " and not the balance remaining is " +balance);}
}
// Defining subclass
class SavingAc extends Account{
	//Defining method
	void getBalance() {System.out.print("Your account balance is:" +balance);}
	//Defining method
	void depositeAmount(int x) {
		balance= balance+x;
		System.out.println("Congrats! you have deposite:" +balance);}
	//Defining methods
	void WithdrawAmount(int y) {
		balance= balance-y;
		System.out.println("Congrats! you have successfully withdraw:" +balance);}
}
//Defining subclass
class CurrentAc extends Account{
	//Defining method
	void getBalance() {
		balance= balance-10;
		System.out.print("Your account balance is:" +balance+ " after Rs.10 transcation fee charges");}
	//Defining method
	void depositeAmount(int x) {
		balance= balance+x-10;
		System.out.println("Congrats! you have deposite:" +balance+ " after Rs.10 transcation fee charges");}
	//Defining method
	void WithdrawAmount(int y) {
		balance= balance-y-10;
		System.out.println("Congrats! you have successfully withdraw:" +y+ " and not the balance remaining is " +balance+ " after Rs.10 transcation fee charges");}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please let me know if it's Current account or Saving account. Kindly press 1 for Current account or press two for the saving account:");
		int a = sc.nextInt();
		//Condition one for current account
		if (a==1) {
			Account ca= new CurrentAc(); 
			System.out.println("Press 1 to check balance, Press 2 to Deposite the money or press 3 to Withdraw the money");
			int b = sc.nextInt();
			//Sub conditions
			if (b==1) {
				ca.getBalance();
			}
			else if (b==2){
				System.out.println("Enter the value to deposite the amount:");
				int x = sc.nextInt();				
				ca.depositeAmount(x);
			}
			else if (b==3) {
				ca.getBalance();
				System.out.print("You can not enter more than balance money");
				System.out.println("Enter the value to Withdraw the amount:");
				int y = sc.nextInt();				
				ca.WithdrawAmount(y);
			}}
		//Second condition for Saving account
		else if (a==2) {
				Account sa= new SavingAc(); 
				System.out.println("Press 1 to check balance, Press 2 to Deposite the money or press 3 to Withdraw the money");
				int c = sc.nextInt();
				//Sub conditions
				if (c==1) {
					sa.getBalance();
				}
				else if (c==2){
					System.out.println("Enter the value to deposite the amount:");
					int x = sc.nextInt();				
					sa.depositeAmount(x);
				}
				else if (c==3) {
					sa.getBalance();
					System.out.print("You can not enter more than balance money");
					System.out.println("Enter the value to Withdraw the amount:");
					int y = sc.nextInt();				
					sa.WithdrawAmount(y);
				}
		}
	}

}
