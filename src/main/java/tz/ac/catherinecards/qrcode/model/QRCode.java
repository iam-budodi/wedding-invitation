package tz.ac.catherinecards.qrcode.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import tz.ac.catherinecards.event.model.Invitation;

import java.util.UUID;

@Entity
@Table(name = "qr_code")
public class QRCode extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "qr_code_id")
    public UUID codeID;

    @NotEmpty
    @Column(name = "qr_content", nullable = false)
    public String data;

    public Boolean verified;

    @OneToOne
    public Invitation invitation;
}