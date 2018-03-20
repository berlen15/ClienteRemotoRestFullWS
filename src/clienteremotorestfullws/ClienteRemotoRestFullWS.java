
package clienteremotorestfullws;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClienteRemotoRestFullWS {

    
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        URL uri = new URL("http://ws.docencia.ces.siani.es/a25/ClienteWebHora/webresources/horaservidor");
        HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
        connection.setRequestMethod("GET");
        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        
        Scanner scan = new Scanner(uri.openStream());
        String source = new String();
        while(scan.hasNext()) source += scan.nextLine();
        System.out.println(source);           
        /*try(BufferedReader reader = new BufferedReader(input)){
            String line = reader.readLine();
            
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }*/
    }
    
}
