package com.cb.notificationtemplate.beans.dtos;

import com.cb.notificationtemplate.beans.NotificationTemplate;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class NotificationTemplateResponse {
    private List<NotificationTemplate> notificationTemplates;
    private String status;
    private String statusDescription;
}
