package com.example.threadclass;

class UploadFile extends Thread{
	String username;
	
	public UploadFile(String username) {
		this.username = username;
	}
	
	public void run() {
		System.out.println(username + " upload file");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(username + " uploaded file");
	}
}

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		UploadFile threadA = new UploadFile("Veena");
		UploadFile threadB = new UploadFile("Sourav");
		UploadFile threadC = new UploadFile("Aarif");
		
		threadA.start();
		threadA.join();
		threadB.start();
		threadB.join();
		threadC.start();
		threadC.join();
		
//		try {
//			threadA.join();
//			threadB.join();
//		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Task completed");
	}
}