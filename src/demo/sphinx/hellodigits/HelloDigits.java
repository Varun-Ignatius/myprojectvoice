/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package demo.sphinx.hellodigits;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * A simple HelloDigits demo showing a simple speech application 
 * built using Sphinx-4. This application uses the Sphinx-4 endpointer,
 * which automatically segments incoming audio into utterances and silences.
 */
public class HelloDigits {
    String ss;
    private ConfigurationManager cm;
    private Recognizer recognizer;
    private Microphone microphone;
    private Result result;
    
 
  
    public   HelloDigits() {
        
        try {
            URL url= new File("C://Users//ASUS//Documents//NetBeansProjects//speech//src//demo//sphinx//hellodigits//hellodigits.config.xml").toURI().toURL();
         
             cm = new ConfigurationManager(url);
            recognizer = (Recognizer) cm.lookup("recognizer");
	     microphone = (Microphone) cm.lookup("microphone");
	 
             //result=null;
          //  int i=0;


            /* allocate the resource necessary for the recognizer */
            
          
        } catch (IOException e) {
            System.err.println("Problem when loading HelloDigits: " + e);
            e.printStackTrace();
        } catch (PropertyException e) {
            System.err.println("Problem configuring HelloDigits: " + e);
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.err.println("Problem creating HelloDigits: " + e);
            e.printStackTrace();
        }
    }

            /* the microphone will keep recording until the program exits */
    public String speechrecord()
    {
       
        try {   
            recognizer.allocate();
        
           
            if (microphone.startRecording()) {
                
                // System.out.println
                //   ("Say any digit(s): e.g. \"two oh oh four\", " +
                //   "\"three six five\".");
                // int count=0;
                
                System.out.println("Start speaking.\n");
                
                /*
                * This method will return when the end of speech
                * is reached. Note that the endpointer will determine
                * the end of speech.
                */
               
                result = recognizer.recognize();
                
                if (result != null) {
                    String resultText = result.getBestResultNoFiller();
                    ss=resultText;
                } else {
                    System.out.println("I can't hear what you said.\n");
                }
                System.out.println(ss);
                System.out.println(result );
                
            } else {
                System.out.println("Cannot start microphone.");
                recognizer.deallocate();
                System.exit(1);
            }
             microphone.stopRecording();
            recognizer.deallocate();
        } catch (IllegalStateException ex) {
            Logger.getLogger(HelloDigits.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HelloDigits.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ss;
    }
}
