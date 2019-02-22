/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudHandler;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author bedp
 */
public class CRUHandler {

    String Url;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
    URLConnection urlConnection;

    public URLConnection getUrlConnection() {
        return urlConnection;
    }

    public void setUrlConnection(URLConnection urlConnection) {
        this.urlConnection = urlConnection;
    }
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    WebResource webResource;

    public WebResource getWebResource() {
        return webResource;
    }

    public void setWebResource(WebResource webResource) {
        this.webResource = webResource;
    }
     ClientResponse response;

    public ClientResponse getResponse() {
        return response;
    }

    public void setResponse(ClientResponse response) {
        this.response = response;
    }
    public JsonArray FindAllJsonArray(String AppendUrl) throws Exception {
        Url = Url + AppendUrl;
        urlConnection = new URL(Url).openConnection();
        urlConnection.connect();
        JsonReader reader = new JsonReader(
                new InputStreamReader(urlConnection.getInputStream()));
        JsonParser parser = new JsonParser();
        JsonElement rootElement = parser.parse(reader);
        JsonArray tweetsJson = rootElement.getAsJsonArray();
         Url=new String();
        return tweetsJson;
    }
  public JsonArray FindAllJsonArraywithId(String AppendUrl ,String ID) throws Exception {
        Url = Url + AppendUrl+"/"+ID;
        urlConnection = new URL(Url).openConnection();
        urlConnection.connect();
        JsonReader reader = new JsonReader(
                new InputStreamReader(urlConnection.getInputStream()));
        JsonParser parser = new JsonParser();
        JsonElement rootElement = parser.parse(reader);
        JsonArray tweetsJson = rootElement.getAsJsonArray();
         Url=new String();
        return tweetsJson;
    }
    public String RemoveWithId(String AppendUrl,String ID) throws Exception {
        Url = Url + AppendUrl+"/"+ID;
        urlConnection =  new URL(Url).openConnection();
        urlConnection.connect();
        String Status = new InputStreamReader(urlConnection.getInputStream()).toString();
         Url=new String();
        return Status;
    }
    // AppendUrl Url of class ...ID id Deleted 
    public String RemoveWithDelete(String AppendUrl,String Id)
    {
        Url = Url + AppendUrl;
        client=Client.create();
        webResource=client.resource(Url);
        response= webResource.path(Id).delete(ClientResponse.class);
        Url=new String();
        return new Integer(response.getStatus()).toString();
    }
    // AppendUrl Url of class ...object data
    public String InsertNew(String AppendUrl ,Object Object ) throws Exception
    {
         Url = Url + AppendUrl;
        client = Client.create();
        webResource = client.resource(Url);
        Gson gson = new Gson();
        response = 
                webResource.type("application/json").post(ClientResponse.class,
                gson.toJson(Object));
         Url=new String();
         return new Integer(response.getStatus()).toString();
    }
    // AppendUrl Url of class ...object data...ID id updated 
    public  String EditValues(String AppendUrl,Object object,String ID) throws Exception
    {
         Url = Url + AppendUrl+"/"+ID;
        client = Client.create();
        webResource = client.resource(Url);
        Gson gson = new Gson();
        response = 
                webResource.type("application/json").put(ClientResponse.class,
                gson.toJson(object));
         Url=new String();
      return new Integer(response.getStatus()).toString();  
    }
    

}
