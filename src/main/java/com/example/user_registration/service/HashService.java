package com.example.user_registration.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Service;

@Service
public class HashService {

    private MessageDigest messageDigest;
    private StringBuilder hexString;

    public HashService(){
        try{
            this.messageDigest = MessageDigest.getInstance("MD5");
            this.hexString = new StringBuilder();
        }
        catch(NoSuchAlgorithmException message){
            message.printStackTrace();
        }
    }

    public String doHashing(String password){
       
        messageDigest.reset();
        hexString.setLength(0);

        byte[] messageArrayBytes = messageDigest.digest(password.getBytes());

        for(byte currentByte : messageArrayBytes){
            hexString.append(String.format("%02x", 0xFF & currentByte));
        }
        return hexString.toString();
    }

}
