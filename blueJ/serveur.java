
import java.util.ArrayList;
import java.util.Iterator;

public class serveur
{
    private ArrayList<Client> cl;
    
    public serveur()
    {
        cl = new ArrayList<Client>();
    }

    public boolean connecter(Client cll)
    {
        if(cl==null) {
            return false;
        }
        else {
            return cl.add(cll);
        }
    }
    
    public void diffuser(String message)
    {
       Client tmp;
       
       Iterator<Client> lste= cl.iterator();
        while(lste.hasNext()) {
            tmp=(Client) lste.next();
            tmp.recevoir(message);
        }
    }
}