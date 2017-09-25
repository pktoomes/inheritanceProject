package com.company;

public class EmailNotifications extends Notification {
    private String recipient;
    private String smtpProvider;


    public EmailNotifications(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Subject: " + this.getSubject() + ". Body: " + this.getBody() + ". Created At: " + this.getCreatedAt() + ". Recipient: " + this.getRecipient() + " . SMTP Provider: " + this.getSmtpProvider());
    }

    @Override
    public void protectedMethod() {
        super.protectedMethod();
        System.out.println(" and this was added through override");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotifications that = (EmailNotifications) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone()  {

        return new EmailNotifications(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
    }
}
