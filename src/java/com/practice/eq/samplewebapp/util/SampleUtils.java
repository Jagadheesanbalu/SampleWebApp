/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.eq.samplewebapp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author baluj
 */
public class SampleUtils {
    
    
    
    public List<String> getMessage() {
        
  
        List<String> list = new ArrayList<String>();
        JSONObject obj = new JSONObject();
        list.add("One");
        list.add("Two");
        list.add("Three");
 
       
        return list;
    }
}
