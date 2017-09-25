package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotifications emailNotification = new EmailNotifications("cats", "There are too many cats","Jenny", "idk");
        TextNotification textNotification = new TextNotification("email", "Did you get my e-mail about the cats", "Jenny", "kdi");
        emailNotification.transport();
        textNotification.transport();
        emailNotification.setStatus("This is a new status");
        emailNotification.showStatus();
        textNotification.showStatus();
        emailNotification.protectedMethod();
        Object emailNotificationClone = emailNotification.clone();
        System.out.println(emailNotification.equals(emailNotificationClone));
    }
}
