package example.array;

public class ArrayTest {

	public static void main(String[] args) {
		Account accArray[]=new Account[5];//5 references created in Array
		
		System.out.println();
		

	}
	
	class Account{
		
		private int accountNumber;
		private String accountHolderName;
		private float accountBalance;
		
		
		
		public Account(int accountNumber, String accountHolderName, float accountBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.accountBalance = accountBalance;
		}

		
		


		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
					+ ", accountBalance=" + accountBalance + "]";
		}
		
	}

}
