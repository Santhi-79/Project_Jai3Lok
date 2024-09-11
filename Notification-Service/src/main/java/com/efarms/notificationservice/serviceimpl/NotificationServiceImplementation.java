package com.efarms.notificationservice.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.notificationservice.entity.Notification;
import com.efarms.notificationservice.repository.NotificationRepository;
import com.efarms.notificationservice.service.NotificationService;

@Service
public class NotificationServiceImplementation implements NotificationService{
	
	@Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification sendNotification(Notification notification) {
        notification.setCreatedAt(LocalDateTime.now());
        notification.setRead(false);
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getNotificationsByUserId(Long userId) {
        return notificationRepository.findByUserId(userId);
    }

    @Override
    public Notification markAsRead(Long notificationId) {
        Optional<Notification> notification = notificationRepository.findById(notificationId);
        if (notification.isPresent()) {
            Notification notif = notification.get();
            notif.setRead(true);
            return notificationRepository.save(notif);
        }
        return null;
    }

}
