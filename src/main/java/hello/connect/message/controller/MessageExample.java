/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.connect.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joao
 */
@RestController
public class MessageExample {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    
    @RequestMapping(value = "/endpoint-to-callAction", method = RequestMethod.GET)
    public void sendMessage() {
        simpMessagingTemplate.convertAndSend("/topic/clients-subscribed", "message, data, content");
    }

}
