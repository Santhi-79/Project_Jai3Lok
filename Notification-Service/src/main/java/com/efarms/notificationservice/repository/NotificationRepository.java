package com.efarms.notificationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efarms.notificationservice.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
	
	List<Notification> findByUserId(Long userId);

}
