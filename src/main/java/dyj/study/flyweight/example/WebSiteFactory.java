package dyj.study.flyweight.example;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String,WebSite> webSiteHashMap = new HashMap<>();

    public WebSite getWebSite(String key){
        if(!webSiteHashMap.containsKey(key)){
            webSiteHashMap.put(key,new ConcreteWebSite(key));
        }
        return webSiteHashMap.get(key);
    }

    public int getWebSiteCount(){
        return webSiteHashMap.size();
    }
}
