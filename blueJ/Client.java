public class Client
{
    private serveur serv;
    private String name;
   
    public Client(String name)
    {
        this.name = name;
        this.serv = null;
    }

    public boolean seConnecter(serveur serv)
    {
        boolean reponse = serv.connecter(this);
        
        if(reponse == false) {return false;}
            
        else 
        {
            this.serv = serv;
            return true; 
        }
    }
    
    public void envoyer(String message)
    {
            serv.diffuser(name + ": " + message);
    }
    
    public String recevoir(String message)
    {
        return message;
    }
}