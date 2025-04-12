package models;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class UrlMapping {

    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany
        private List<ClickEvent> clicketEvents;
    
    
    
    
    
    }