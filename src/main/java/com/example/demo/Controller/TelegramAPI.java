package com.example.demo.Controller;

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
        try{

            // Create an ObjectMapper instance
            // Create an ObjectMapper instance
            String token = dataPLC.getToken();
            int userId =dataPLC.getUserid();
            String addressName = dataPLC.getAddress_name();

            // Print the values
            System.out.println("Token: " + token);
            System.out.println("User ID: " + userId);
            System.out.println("Address Name: " + addressName);
            try{
                PLC found = plcService.getPLCByToken(token);
                List<Address> addresses = found.getAddresses();

                for (Address address : addresses) {
                    System.out.println("Address ID: " + address.getId());
                    System.out.println("Description" + address.getDescription());
                    System.out.println("Name : " + address.getName());
                    if(dataPLC.getAddress_name().equals(address.getName())){

                        System.out.println("Data matched....");
                        //
                        /*
                         * 
                         * 
                         * 
                         */
                        String botToken = "";
                        String chatId = "";
                        String messageText = "Hi\n";
                
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
                    }
                    // ... and so on for other properties of the Address entity
                }




                return ResponseEntity.ok("User data received successfully!");


            }catch(Exception e){


                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found 404");

            }

    
    

        }catch(Exception e){


            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to process and save JSON data!");

        }
        

        // Return a response indicating success (HTTP status code 200 OK)
    }


}
