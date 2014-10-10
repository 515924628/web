package com.sg.zfw.util;

import java.util.Properties;
import java.io.*;

public final class Env extends Properties{

	private static Env instance;
    public static Env getInstance() {
              if (instance != null)     return instance;
             else {
                     makeInstance();
                     return instance;
              }
      }
    private static synchronized void makeInstance() {
             if (instance == null)      instance = new Env();
     }
    private Env() {
          InputStream is = getClass().getResourceAsStream("/db.properties");
           try {
                  load(is);
                //  is.close();
            } catch (Exception e) {     e.printStackTrace();       
            }
            }

}
