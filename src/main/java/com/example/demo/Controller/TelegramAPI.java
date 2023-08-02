package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.AddressEntry;
import com.example.demo.Entity.PLC;
import com.example.demo.Entity.Telegram;
import com.example.demo.Service.PLCService;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@RestController
@RequestMapping("/telegram")
@CrossOrigin("*")
public class TelegramAPI {


    private final PLCService plcService;

    @Autowired
    public TelegramAPI(PLCService plcService) {
        this.plcService = plcService;
    }

    // Endpoint to get an address by ID
    @GetMapping("/testing")
    public  String getHello(){
       return "Hello World";
    }

    @PostMapping("/alert")
    public ResponseEntity<String> processUserData(@RequestBody Telegram dataPLC) {
        // Process the received user data as needed
        // For this example, we will simply print it to the console

        //System.out.println(user);
        String token = dataPLC.getToken();
        int userId = dataPLC.getUserid();
        
        System.out.println("Token is " + token);
        System.out.println("User ID: " + userId);
        //System.out.println(userId);
    // For loop to print the 'name' attribute of each AddressEntry
        //System.out.println(returnedPLC.getUserid());

        //PLC returnedPLC = plcService.getPLCByToken(token);
        //System.out.println(returnedPLC.getAddresses());
        //List<Address> recordAddress = returnedPLC.getAddresses();
        List<AddressEntry> list = dataPLC.getAddress_name();
        // For loop to print the 'name' attribute of each AddressEntry
        PLC result = plcService.getPLCByToken(token);
        //System.out.println(result.getName());
        List<Address> recordAddress = result.getAddresses();


        String Telegram_message = "";


        String triggered_address = "";
        for (AddressEntry entry : list) {
           // System.out.println("Address Name: " + entry.getName());
            triggered_address = entry.getName();
            for (Address databasePLCaddress : recordAddress) {
                if(triggered_address.equals(databasePLCaddress.getName())){
                    System.out.println("Call API ");
                    Telegram_message += " Address : " + databasePLCaddress.getName() + " Alarm Description: " + databasePLCaddress.getDescription(); 
                }
            }
        }




          //
                        /*
                         * 
                         * 
                         * 
                         */
                        String botToken = "";
                        String chatId="";
                        String messageText = Telegram_message;
                
                        try {
                            String url = "https://api.telegram.org/bot" + botToken + "/sendMessage";
                            String postData = "chat_id=" + chatId + "&text=" + messageText;
                
                            URL apiUrl = new URL(url);
                            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
                            connection.setRequestMethod("POST");
                            connection.setDoOutput(true);
                            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            connection.setRequestProperty("Content-Length", String.valueOf(postData.length()));
                            connection.getOutputStream().write(postData.getBytes("UTF-8"));
                
                            int responseCode = connection.getResponseCode();
                            if (responseCode == HttpURLConnection.HTTP_OK) {
                                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                                String line;
                                StringBuilder response = new StringBuilder();
                                while ((line = reader.readLine()) != null) {
                                    response.append(line);
                                    response.append('\r');
                                }
                                reader.close();
                
                                System.out.println(response.toString());
                            } else {
                                System.out.println("Error sending message. Response Code: " + responseCode);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }



                        /*
                         * 
                         * 
                         * 
                         */
                        //
        //




        //

        return new ResponseEntity<>("Data received successfully", HttpStatus.OK);

        

        // Return a response indicating success (HTTP status code 200 OK)
    }


}
