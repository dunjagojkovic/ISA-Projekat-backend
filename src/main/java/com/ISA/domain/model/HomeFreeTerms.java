package com.ISA.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "home_free_terms")

public class HomeFreeTerms {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    private HomeProfile homeProfile;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public Date getEndDate() { return  endDate; }
    public void  setEndDate(Date endDate) { this.endDate = endDate; }

    public HomeProfile getHomeProfile() {
        return homeProfile;
    }

    public void setHomeProfile(HomeProfile homeProfile) {
        this.homeProfile = homeProfile;
    }
}
