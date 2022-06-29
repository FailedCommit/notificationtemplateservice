package com.cb.notificationtemplate.controllers;

import com.cb.notificationtemplate.beans.dtos.NotificationTemplateRequest;
import com.cb.notificationtemplate.beans.dtos.NotificationTemplateResponse;
import com.cb.notificationtemplate.services.NotificationTemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/notification-templates")
public class NotificationTemplateApi {
    private final NotificationTemplateService notificationTemplateService;

    @PostMapping(value = "/template")
    public ResponseEntity<NotificationTemplateResponse> createNotificationTemplate(@RequestBody NotificationTemplateRequest request) {
        // Cache and put the template in S3 bucket and template metadata in DynamoDB, ideally. For now just keep in resources folder
        NotificationTemplateResponse notificationTemplate = notificationTemplateService.createNotificationTemplate(request);
//        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
//        map.add("Header1", 11111);
//        ResponseEntity<NotificationTemplateResponse> respEntity = new ResponseEntity<>(notificationTemplate, )
        return ResponseEntity.ok(notificationTemplate);
    }

//    @PostMapping("/template")
//    public ResponseEntity<Object> test() {
//        return ResponseEntity.ok("Test");
//    }
}
