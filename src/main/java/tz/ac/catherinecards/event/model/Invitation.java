package tz.ac.catherinecards.event.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import tz.ac.catherinecards.qrcode.model.QRCode;

import java.util.UUID;

@Entity
@Table(name = "wedding_invitation")
public class Invitation extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "invitation_id")
    public UUID invitationID;

    @OneToOne
    public Attendee attendee;

    @OneToOne(mappedBy = "invitation")
    public QRCode qrCode;
}
