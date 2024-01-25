package tz.ac.catherinecards.event.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "wedding_events")
public class Event extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "event_id")
    public UUID eventID;

    @NotNull
    @Future
    @Column(name = "event_date", nullable = false)
    public LocalDateTime date;

    @NotEmpty
    @Column(nullable = false)
    public String venue;

    @NotEmpty
    @Column(name = "event_location",nullable = false)
    public String location;
}
