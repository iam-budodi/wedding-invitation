package tz.ac.catherinecards.event.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

@Entity
@Table(name = "attendees")
public class Attendee extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "attendee_id")
    public UUID attendeeID;

    @NotEmpty
    @Column(name = "full_name", nullable = false)
    public String name;

    @Email
    public String email;

    @NotEmpty
    @Column(name = "phone_number", nullable = false)
    public String mobile;

    public Boolean verified;

    @ManyToOne
    public Event event;
}
