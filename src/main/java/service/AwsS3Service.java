/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Pedro
 */
@Service
public class AwsS3Service {
    @Autowired
    private AmazonS3 amazonS3;

    public void uploadEventToS3(String eventId, String eventType, String eventData) {
        String json = "{\"eventId\":\"" + eventId + "\",\"eventType\":\"" + eventType + "\",\"eventData\":\"" + eventData + "\"}";
        
        amazonS3.putObject("my-bucket", eventId + ".json", json);
    }
}
