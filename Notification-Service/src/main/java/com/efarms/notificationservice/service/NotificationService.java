package com.efarms.notificationservice.service;

import java.util.List;

import com.efarms.notificationservice.entity.Notification;

public interface NotificationService {
	
	Notification sendNotification(Notification notification);
    List<Notification> getNotificationsByUserId(Long userId);
    Notification markAsRead(Long notificationId);

}
