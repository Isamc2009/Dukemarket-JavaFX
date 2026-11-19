module br.dev.isabelle.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;
    
    
    opens br.dev.isabelle.dukemarket.javafx to javafx.fxml;
    opens br.dev.isabelle.dukemarket.javafx.controller to javafx.fxml; 
    
    
   exports br.dev.isabelle.dukemarket.javafx;
   exports br.dev.isabelle.dukemarket.javafx.controller;
   exports br.dev.isabelle.dukemarket.javafx.DAO;
   exports br.dev.isabelle.dukemarket.javafx.model;
   exports connection;
   
   requires mysql.connector.java; 
   
   
    
   
    
}
