package tz.ac.catherinecards.event.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

@Entity
@Table(name = "bride_groom")
public class BrideGroom extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "bride_groom_id")
    public UUID id;

    @NotEmpty
    @Column(name = "bride_name", nullable = false)
    public String bName;

    @NotEmpty
    @Column(name = "groom_name", nullable = false)
    public String gName;

    @NotEmpty
    @Email
    @Column(name = "bride_email", nullable = false)
    public String bEmail;

    @Email
    @Column(name = "groom_email")
    public String gEmail;

    @NotEmpty
    @Column(name = "bride_mobile", nullable = false)
    public String bMobile;

    @Column(name = "groom_mobile", nullable = false)
    public String gMobile;

    @ManyToOne
    public Event event;
}
