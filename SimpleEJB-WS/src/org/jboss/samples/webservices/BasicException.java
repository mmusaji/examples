package org.jboss.samples.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class BasicException extends Exception 
  {
     private String message;
     private String code;

     public BasicException(String message)
      {
         super(message);
      }

     public String getCode() {
       return code;
     }

     public void setCode(String code) {
       this.code=code;
     }

//     public String getMessage() {
//       return message;
//     }
//
//     public String toString() 
//     {
//       return message;
//     }
  }