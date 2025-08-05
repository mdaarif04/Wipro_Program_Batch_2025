package com.example.threadclass;

//--------------------------------Mam Code---------------------



//With synchronization ( locked the object and also it is safe (Thread safe)
/* Without Synchronization ( it will not lock and it is unsafe (Not a thread safe )
and also may lead to the race condition which could cause the false readability or wrong balance*/

class BankAccount
{
private int balance = 1000;

public int getBalance() {
return balance;
}
public  void withdrawUnSyncMethod(int amount)
{
	if(balance >=amount)
	{
		System.out.println(Thread.currentThread().getName() + "is withdrawing the amount : " + amount);
		balance -= amount;
		System.out.println("The remaining balance :" + balance);
	}
	else
	{
		System.out.println(Thread.currentThread().getName() + " Insufficient funds !");
	}
	
}

public synchronized void withdrawSyncMethod(int amount)
{
	if(balance >=amount)
	{
		System.out.println(Thread.currentThread().getName() + "is withdrawing the amount : " + amount);
		balance -= amount;
		System.out.println("The remaining balance :" + balance);
	}
	else
	{
		System.out.println(Thread.currentThread().getName() + " Insufficient funds !");
	}
	
}

public void depositSyncMethod(int amount)
{
	
	synchronized(this)
	{
		System.out.println(Thread.currentThread().getName() + " is depositing the :" + amount);
		balance += amount;
		System.out.println(" The new updated balance is : " + balance);
	}
	}




public void depositUnSyncMethod(int amount)
{
	
	
	
		System.out.println(Thread.currentThread().getName() + " is depositing the :" + amount);
		balance += amount;
		System.out.println(" The new updated balance is : " + balance);
	
	}


}
public class BankThreadSyncExample {

	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread(() -> {
		for(int i =0 ; i<3 ; i++)
		{
		 account.withdrawSyncMethod(400);  // we are calling 3 times
		 System.out.println(account.getBalance());
		
		}
		}, "User A");
		
		Thread t2 = new Thread(() -> {
			for(int i =0 ; i<3 ; i++)
			{
			 account.withdrawSyncMethod(300);  // we are calling 3 times
			 
			// account.depositSyncMethod(200);
			}
			}, "User B");
		
		t1.start();// All three times it's executed 
		t2.start();

	}

}

//-------------------------------------------------******End*********-----------


//import java.util.concurrent.*;
//
//class BankAccount {
//    private int balance = 1000;
//
//    // Synchronized for thread-safe access
//    public synchronized void deposit(int amount) {
//        balance += amount;
//        System.out.println(Thread.currentThread().getName() + " Deposited: " + amount + ", Balance: " + balance);
//    }
//
//    public synchronized void withdraw(int amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " Withdrawn: " + amount + ", Balance: " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
//        }
//    }
//
//    // Not synchronized (for async demo - can cause race condition)
//    public void depositAsync(int amount) {
//        balance += amount;
//        System.out.println("Async Deposited: " + amount + ", Balance: " + balance);
//    }
//
//    public void withdrawAsync(int amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println("Async Withdrawn: " + amount + ", Balance: " + balance);
//        } else {
//            System.out.println("Async Insufficient Balance.");
//        }
//    }
//}
//
//public class BankDemo {
//    public static void main(String[] args) {
//        System.out.println("===== Synchronous Execution =====");
//        runSync();
//
//        System.out.println("\n===== Asynchronous Execution =====");
//        runAsync();
//    }
//
//    // Synchronous execution using synchronized methods and threads
//    public static void runSync() {
//        BankAccount account = new BankAccount();
//
//        Runnable depositor = () -> {
//            for (int i = 0; i < 5; i++) {
//                account.deposit(100);
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//            }
//        };
//
//        Runnable withdrawer = () -> {
//            for (int i = 0; i < 5; i++) {
//                account.withdraw(80);
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//            }
//        };
//
//        Thread t1 = new Thread(depositor, "Depositor");
//        Thread t2 = new Thread(withdrawer, "Withdrawer");
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Asynchronous execution using ExecutorService
//    public static void runAsync() {
//        BankAccount account = new BankAccount();
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i < 5; i++) {
//            executor.submit(() -> account.depositAsync(100));
//            executor.submit(() -> account.withdrawAsync(80));
//        }
//
//        executor.shutdown();
//        try {
//            executor.awaitTermination(2, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
