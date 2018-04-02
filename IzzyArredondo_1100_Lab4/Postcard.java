public class Postcard
{
    private String message;
    private String sender;
    private String recipient;
    public Postcard(String aSender, String aMessage)

    {
        message = aMessage;
        sender = aSender;
        recipient = "";

    }

    public void setRecipient(String r)
    {
        recipient = r;
    }
    
    public void print()
    {
        System.out.println("Dear " + recipient + ":");
        System.out.println(message);
        System.out.println("Love, " + sender);
    }
    
    
    
}